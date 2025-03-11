package com.smorzhok.dependencyinjectionstart.data.datasource

import com.smorzhok.dependencyinjectionstart.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(private val apiService: ExampleApiService) :
    ExampleRemoteDataSource {
    override fun method() {
        apiService.method()
    }
}