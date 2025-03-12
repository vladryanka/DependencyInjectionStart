package com.smorzhok.dependencyinjectionstart.di

import com.smorzhok.dependencyinjectionstart.data.repository.ExampleRepositoryImpl
import com.smorzhok.dependencyinjectionstart.domain.ExampleRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {
    @Provides
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository {
        return impl
    }
}