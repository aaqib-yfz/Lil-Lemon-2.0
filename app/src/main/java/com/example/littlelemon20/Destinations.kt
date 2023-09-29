package com.example.littlelemon20

import android.graphics.drawable.Icon

interface Destinations{
    val route : String
}

object HomeScreen : Destinations{
    override val route = "HomeScreen"
}

object DishDetails : Destinations {
    override val route = "Menu"
    const val argDishId = "dishId"
}

