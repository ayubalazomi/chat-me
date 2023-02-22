package com.example.chatme

import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavBackStackEntry
import com.example.chatme.destinations.ChatScreenDestination
import com.example.chatme.destinations.ChatScreenDestination.NavArgs

public inline fun <reified T> SavedStateHandle.navArgs(): T {
    return navArgs(T::class.java, this)
}

public inline fun <reified T> NavBackStackEntry.navArgs(): T {
    return navArgs(T::class.java, this)
}

@Suppress("UNCHECKED_CAST")
public fun <T> navArgs(argsClass: Class<T>, argsContainer: SavedStateHandle): T {
    return when (argsClass) {
		NavArgs::class.java -> ChatScreenDestination.argsFrom(argsContainer) as T
        else -> error("Class ${argsClass} is not a navigation arguments class!")
    }
}

@Suppress("UNCHECKED_CAST")
public fun <T> navArgs(argsClass: Class<T>, argsContainer: NavBackStackEntry): T {
    return when (argsClass) {
		NavArgs::class.java -> ChatScreenDestination.argsFrom(argsContainer) as T
        else -> error("Class ${argsClass} is not a navigation arguments class!")
    }
}
