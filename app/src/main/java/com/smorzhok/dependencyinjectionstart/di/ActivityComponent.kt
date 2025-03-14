package com.smorzhok.dependencyinjectionstart.di

import com.smorzhok.dependencyinjectionstart.presentation.MainActivity
import com.smorzhok.dependencyinjectionstart.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [ViewModelModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)

    fun inject(activity: MainActivity2)

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance id: String): ActivityComponent
    }
}