package com.smorzhok.dependencyinjectionstart

import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {
    fun getKeyboard(): Keyboard
    fun getMouse(): Mouse
    fun getMonitor(): Monitor
    fun getComputer(): Computer
    fun inject(activity: Activity)
}