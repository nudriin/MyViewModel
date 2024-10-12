package com.nudriin.myviewmodel

import androidx.lifecycle.ViewModel

// create main view model that extends ViewModel
class MainViewModel: ViewModel() {
    var result = 0

    fun calculate(width: String, height: String, length: String) {
        result = width.toInt() * height.toInt() * length.toInt()
    }
}