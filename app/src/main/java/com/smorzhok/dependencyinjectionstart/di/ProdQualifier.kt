package com.smorzhok.dependencyinjectionstart.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class ProdQualifier()
