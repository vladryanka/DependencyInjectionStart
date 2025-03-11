package com.smorzhok.dependencyinjectionstart.domain

import javax.inject.Inject

class ExampleUseCase @Inject constructor(private val repository: ExampleRepository) {
    operator fun invoke(){
        repository.method()
    }
}