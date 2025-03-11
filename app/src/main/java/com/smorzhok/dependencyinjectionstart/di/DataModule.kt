package com.smorzhok.dependencyinjectionstart.di

import com.smorzhok.dependencyinjectionstart.data.datasource.ExampleLocalDataSource
import com.smorzhok.dependencyinjectionstart.data.datasource.ExampleLocalDataSourceImpl
import com.smorzhok.dependencyinjectionstart.data.datasource.ExampleRemoteDataSource
import com.smorzhok.dependencyinjectionstart.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {
    @Binds
    fun bindExampleLocalDataSource(impl:ExampleLocalDataSourceImpl): ExampleLocalDataSource
    @Binds
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}