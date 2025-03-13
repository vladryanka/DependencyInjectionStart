package com.smorzhok.dependencyinjectionstart.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.smorzhok.dependencyinjectionstart.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(private val useCase: ExampleUseCase) : ViewModel() {
    fun method() {
        useCase()
        Log.d("Doing", "ExampleViewModel $this")
    }
}