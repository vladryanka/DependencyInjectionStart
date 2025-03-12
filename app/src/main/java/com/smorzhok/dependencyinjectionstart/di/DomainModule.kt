package com.smorzhok.dependencyinjectionstart.di

import com.smorzhok.dependencyinjectionstart.data.repository.ExampleRepositoryImpl
import com.smorzhok.dependencyinjectionstart.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {
    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}