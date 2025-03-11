package com.smorzhok.dependencyinjectionstart

import javax.inject.Inject

class Activity {
    @Inject
    lateinit var computer : Computer
    init {
        DaggerNewComponent.create().inject(this)
    }
}