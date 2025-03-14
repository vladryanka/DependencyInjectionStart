package com.smorzhok.dependencyinjectionstart.di

import com.smorzhok.dependencyinjectionstart.data.datasource.ExampleLocalDataSource
import com.smorzhok.dependencyinjectionstart.data.datasource.ExampleLocalDataSourceImpl
import com.smorzhok.dependencyinjectionstart.data.datasource.ExampleRemoteDataSource
import com.smorzhok.dependencyinjectionstart.data.datasource.ExampleRemoteDataSourceImpl
import com.smorzhok.dependencyinjectionstart.data.datasource.TestRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {
    @ApplicationScope
    @Binds
    fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @ApplicationScope
    @RemoteQualifier
    @Binds
    fun bindTestRemoteDataSource(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource
}