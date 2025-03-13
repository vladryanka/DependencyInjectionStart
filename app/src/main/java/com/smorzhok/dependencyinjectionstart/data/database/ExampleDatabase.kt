package com.smorzhok.dependencyinjectionstart.data.database

import android.content.Context
import android.util.Log
import com.smorzhok.dependencyinjectionstart.R
import javax.inject.Inject

class ExampleDatabase @Inject constructor(private val context: Context,private val time: Long){
    fun method(){
        Log.d(TAG, "ExampleDatabase ${context.getString(R.string.app_name)} ${time}")
    }
    companion object{
        const val TAG = "Doing"
    }
}