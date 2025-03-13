package com.smorzhok.dependencyinjectionstart

import android.app.Application
import com.smorzhok.dependencyinjectionstart.di.DaggerApplicationComponent

class ExampleApplication : Application() {
    val component by lazy {
        DaggerApplicationComponent.factory().create(this, System.currentTimeMillis())
    }
}