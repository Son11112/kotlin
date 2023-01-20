package com.example.viewmodelandlivedata

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var count = 0

    fun updateCount(){
        ++count
    }
}