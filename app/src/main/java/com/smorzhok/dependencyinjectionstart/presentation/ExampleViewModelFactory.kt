package com.smorzhok.dependencyinjectionstart.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

class ExampleViewModelFactory @Inject constructor(
    private val viewModelProvider: @JvmSuppressWildcards
    Map<Class<out ViewModel>, Provider<ViewModel>>
) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModelProvider[modelClass]?.get() as T
    }
}