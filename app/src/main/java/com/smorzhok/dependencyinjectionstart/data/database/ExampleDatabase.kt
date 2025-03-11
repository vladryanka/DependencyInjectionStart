package com.smorzhok.dependencyinjectionstart.data.database

import android.util.Log
import javax.inject.Inject

class ExampleDatabase @Inject constructor(){
    fun method(){
        Log.d(TAG, "ExampleDatabase")
    }
    companion object{
        const val TAG = "Doing"
    }
}