package com.smorzhok.dependencyinjectionstart.di

import androidx.lifecycle.ViewModel
import com.smorzhok.dependencyinjectionstart.presentation.ExampleViewModel
import com.smorzhok.dependencyinjectionstart.presentation.ExampleViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {
    @IntoMap
    @ViewModelKey(ExampleViewModel::class)
    @Binds
    fun bindExampleViewModel(impl: ExampleViewModel): ViewModel

    @IntoMap
    @ViewModelKey(ExampleViewModel2::class)
    @Binds
    fun bindExampleViewModel2(impl: ExampleViewModel2): ViewModel
}