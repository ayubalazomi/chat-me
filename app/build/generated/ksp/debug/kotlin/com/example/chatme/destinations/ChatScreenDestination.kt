package com.example.chatme.destinations

import android.os.Bundle
import androidx.annotation.RestrictTo
import androidx.compose.runtime.Composable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDeepLink
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink
import com.example.chatme.ChatScreen
import com.example.chatme.destinations.ChatScreenDestination.NavArgs
import com.ramcosta.composedestinations.navargs.primitives.DestinationsStringNavType
import com.ramcosta.composedestinations.navigation.DependenciesContainerBuilder
import com.ramcosta.composedestinations.navigation.DestinationDependenciesContainer
import com.ramcosta.composedestinations.scope.DestinationScope
import com.ramcosta.composedestinations.spec.DestinationSpec
import com.ramcosta.composedestinations.spec.DestinationStyle
import com.ramcosta.composedestinations.spec.Direction
import com.ramcosta.composedestinations.spec.DirectionDestinationSpec
import com.ramcosta.composedestinations.spec.NavGraphSpec
import com.ramcosta.composedestinations.spec.Route

public object ChatScreenDestination : TypedDestination<ChatScreenDestination.NavArgs> {
    
    override fun invoke(navArgs: NavArgs): Direction = with(navArgs) {
        invoke(myEmail)
    }
     
    public operator fun invoke(
		myEmail: String,
    ): Direction {
        return Direction(
            route = "$baseRoute" + 
					"/${DestinationsStringNavType.serializeValue("myEmail", myEmail)}"
        )
    }
    
    @get:RestrictTo(RestrictTo.Scope.SUBCLASSES)
    override val baseRoute: String = "chat_screen"

    override val route: String = "$baseRoute/{myEmail}"
    
	override val arguments: List<NamedNavArgument> get() = listOf(
		navArgument("myEmail") {
			type = DestinationsStringNavType
		}
	)

    @Composable
    override fun DestinationScope<NavArgs>.Content() {
		val (myEmail) = navArgs
		ChatScreen(
			nav = destinationsNavigator, 
			myEmail = myEmail
		)
    }
                    
	override fun argsFrom(bundle: Bundle?): NavArgs {
	    return NavArgs(
			myEmail = DestinationsStringNavType.safeGet(bundle, "myEmail") ?: throw RuntimeException("'myEmail' argument is mandatory, but was not present!"),
	    )
	}
                
	override fun argsFrom(savedStateHandle: SavedStateHandle): NavArgs {
	    return NavArgs(
			myEmail = DestinationsStringNavType.get(savedStateHandle, "myEmail") ?: throw RuntimeException("'myEmail' argument is mandatory, but was not present!"),
	    )
	}

	public data class NavArgs(
		val myEmail: String,
	)
}