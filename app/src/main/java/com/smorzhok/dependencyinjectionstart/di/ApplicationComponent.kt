package com.smorzhok.dependencyinjectionstart.di

import android.content.Context
import com.smorzhok.dependencyinjectionstart.data.network.ExampleApiService
import com.smorzhok.dependencyinjectionstart.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DomainModule::class, DataModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)

    fun getApiService(): ExampleApiService

    @Component.Factory
    interface ApplicationComponentFactory{
        fun create(
            @BindsInstance context: Context,
            @BindsInstance time: Long
        ): ApplicationComponent
    }
}