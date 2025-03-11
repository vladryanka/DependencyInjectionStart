package com.smorzhok.dependencyinjectionstart

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {
    @Provides
    fun providesMonitor(): Monitor {
        return Monitor()
    }

    @Provides
    fun providesKeyboard(): Keyboard {
        return Keyboard()
    }

    @Provides
    fun providesMemory(): Memory {
        return Memory()
    }

    @Provides
    fun providesMouse(): Mouse {
        return Mouse()
    }

    @Provides
    fun providesProcessor(): Processor {
        return Processor()
    }

    @Provides
    fun providesStorage(): Storage {
        return Storage()
    }

    @Provides
    fun providesComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse
    ): Computer {
        return Computer(monitor, computerTower, keyboard, mouse)
    }

    @Provides
    fun providesComputerTower(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ): ComputerTower {
        return ComputerTower(storage, memory, processor)
    }


}