package com.smorzhok.dependencyinjectionstart.data.datasource

import android.util.Log
import javax.inject.Inject

class TestRemoteDataSourceImpl @Inject constructor():
    ExampleRemoteDataSource {
    override fun method() {
        Log.d("Doing","test")
    }
}