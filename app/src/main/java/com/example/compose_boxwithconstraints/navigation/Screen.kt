package com.example.compose_boxwithconstraints.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
}