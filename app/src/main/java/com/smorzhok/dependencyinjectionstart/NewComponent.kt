package com.smorzhok.dependencyinjectionstart

import dagger.Component

@Component
interface NewComponent {
    fun getKeyboard(): Keyboard
    fun getMouse(): Mouse
    fun getMonitor():Monitor
}