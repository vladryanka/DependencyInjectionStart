package com.smorzhok.dependencyinjectionstart.presentation

import com.smorzhok.dependencyinjectionstart.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(private val useCase: ExampleUseCase) {
    fun method() {
        useCase()
    }
}