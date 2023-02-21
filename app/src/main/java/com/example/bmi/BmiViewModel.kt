package com.example.bmi

import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel

class BmiViewModel: ViewModel() {

    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")
    //var result by mutableStateOf("")

    var bmi: Float = 0.0f
        get() {
            return calculate()
        }

    private var weight: Int = 0
        get() {
            return weightInput.toIntOrNull() ?: 0
        }

    private var height: Float = 0.0f
        get() {
            return heightInput.toFloatOrNull() ?: 0.0f
        }

    fun changeWeightInput(value: String) {
        weightInput = value
    }

    fun changeHeightInput(value: String) {
        heightInput = value
    }

    private fun calculate (): Float {
        return if (weight > 0 && height > 0) weight / (height * height) else 0.0f
    }
}