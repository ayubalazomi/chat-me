package com.example.chatme

import com.example.chatme.destinations.*
import com.ramcosta.composedestinations.spec.*

/**
 * Class generated if any Composable is annotated with `@Destination`.
 * It aggregates all [TypedDestination]s in their [NavGraph]s.
 */
public object NavGraphs {

    public val root: NavGraph = NavGraph(
        route = "root",
        startRoute = LoginScreenDestination,
        destinations = listOf(
            LoginScreenDestination,
			SinUpScreenDestination,
			ChatScreenDestination,
			ContactViewDestination
        )
    )
}