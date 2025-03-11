package com.smorzhok.dependencyinjectionstart.di

import com.smorzhok.dependencyinjectionstart.presentation.MainActivity
import dagger.Component

@Component(modules = [DomainModule::class, DataModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}