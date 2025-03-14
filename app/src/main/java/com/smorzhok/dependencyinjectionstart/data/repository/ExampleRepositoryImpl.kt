package com.smorzhok.dependencyinjectionstart.data.repository

import com.smorzhok.dependencyinjectionstart.data.datasource.ExampleLocalDataSource
import com.smorzhok.dependencyinjectionstart.data.datasource.ExampleRemoteDataSource
import com.smorzhok.dependencyinjectionstart.data.mapper.ExampleMapper
import com.smorzhok.dependencyinjectionstart.di.RemoteQualifier
import com.smorzhok.dependencyinjectionstart.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    @RemoteQualifier private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
): ExampleRepository {
    override fun method() {
       mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}