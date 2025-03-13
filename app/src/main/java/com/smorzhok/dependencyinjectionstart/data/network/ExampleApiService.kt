package com.smorzhok.dependencyinjectionstart.data.network

import android.content.Context
import android.util.Log
import com.smorzhok.dependencyinjectionstart.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(private val context: Context, private val time: Long) {

    fun method(){
        Log.d(TAG, "ExampleApiService ${context.getString(R.string.app_name)} ${time} $this")
    }
    companion object{
        const val TAG = "Doing"
    }
}