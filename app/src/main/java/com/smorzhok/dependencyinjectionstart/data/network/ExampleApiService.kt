package com.smorzhok.dependencyinjectionstart.data.network

import android.util.Log
import javax.inject.Inject

class ExampleApiService @Inject constructor() {

    fun method(){
        Log.d(TAG, "ExampleApiService")
    }
    companion object{
        const val TAG = "Doing"
    }
}