package com.smorzhok.dependencyinjectionstart.data.datasource

import com.smorzhok.dependencyinjectionstart.data.database.ExampleDatabase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(private val database: ExampleDatabase) :
    ExampleLocalDataSource {
    override fun method() {
        database.method()
    }
}