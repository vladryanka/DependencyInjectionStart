package com.smorzhok.dependencyinjectionstart.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class ExampleViewModelFactory @Inject constructor(
    private val viewModels: @JvmSuppressWildcards
    Map<String, ViewModel>
) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModels[modelClass.simpleName] as T
    }
}