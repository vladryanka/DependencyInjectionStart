package com.smorzhok.dependencyinjectionstart.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.smorzhok.dependencyinjectionstart.R
import com.smorzhok.dependencyinjectionstart.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel
    private val component by lazy {
        DaggerApplicationComponent.builder().context(application).time(System.currentTimeMillis()).build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}