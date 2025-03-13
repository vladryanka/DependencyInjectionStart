package com.smorzhok.dependencyinjectionstart.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.smorzhok.dependencyinjectionstart.domain.ExampleRepository
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(private val repository: ExampleRepository) :
    ViewModel() {
    fun method() {
        repository.method()
        Log.d("Doing", "ExampleViewModel2 $this")
    }
}