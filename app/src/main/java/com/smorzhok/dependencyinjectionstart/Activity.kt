package com.smorzhok.dependencyinjectionstart

class Activity {
    private val component = DaggerNewComponent.create()
     val keyboard = component.getKeyboard()
     val mouse = component.getMouse()
     val monitor = component.getMonitor()
}