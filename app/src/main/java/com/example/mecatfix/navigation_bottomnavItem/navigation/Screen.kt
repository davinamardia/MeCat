package com.example.mecatfix.navigation_bottomnavItem.navigation

sealed class Screen( val route: String) {
    data object Home : Screen("Home")
    data object Gallery : Screen("Gallery")
    data object About : Screen("About")
    data object Detail : Screen("detail_cats")
}