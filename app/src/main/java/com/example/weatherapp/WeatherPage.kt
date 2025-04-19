package com.example.weatherapp

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WeatherPage(viewModel: WeatherViewModel){
    var city by remember { mutableStateOf("") }

    Column (
        Modifier
            .padding(WindowInsets.statusBars.asPaddingValues())
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            OutlinedTextField(
                modifier = Modifier.weight(1f),
                value = city,
                onValueChange = { city = it
                    Log.d("WeatherPage", "Wpisano: $city")},
                label = {Text("Miasto")},
                placeholder = { Text("Wpisz nazwę miasta") }
            )

            IconButton(
                onClick = { viewModel.getData(city) }
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Szukaj"
                )
            }

        }
    }
}
