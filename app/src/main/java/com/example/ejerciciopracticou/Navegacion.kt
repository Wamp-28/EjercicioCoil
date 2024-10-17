package com.example.ejerciciopracticou

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(){

    val navController = rememberNavController()

    val personajes = remember { mutableStateListOf<InfoPersonajes>() }


    NavHost(navController = navController, startDestination = "CrearPersonaje" ) {

        composable("CrearPersonaje"){
            crearPersonajes(navController, personajes)
        }

        composable("ListaPersonajes"){
            ListaPersonajes(navController, personajes)
        }






    }






}


