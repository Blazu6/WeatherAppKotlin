package com.example.weatherapp

import android.util.Log
import androidx.lifecycle.ViewModel

//ten plik sluzy do przechowywania funkcji ktore sluza do zmiany ui w momencie np klikniecia lupy zeby wyszukac miasto np

class WeatherViewModel :ViewModel(){

    fun getData(city : String){
        Log.d("WeatherPage", "Kliknięto lupę! Wyszukane miasto: $city")
    }
}