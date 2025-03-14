package com.smorzhok.dependencyinjectionstart.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.smorzhok.dependencyinjectionstart.ExampleApplication
import com.smorzhok.dependencyinjectionstart.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ExampleViewModelFactory
    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }
    private val viewModel2 by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel2::class.java]
    }
    private val component by lazy {
        (application as ExampleApplication).component
            .activityComponentFactory().create("MY_ID", "MainActivity")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        viewModel.method()
        viewModel2.method()
    }
}