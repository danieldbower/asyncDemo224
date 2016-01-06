package com.infinum.async

import groovyx.gpars.GParsPool
import groovyx.gpars.actor.Actors

class AsyncService {

    Runner waiterA = new Runner()
    Runner waiterB = new Runner()

    AsyncService(){
        waiterA.start()
        waiterB.start()
    }

    void fireAndForgetA(){
        waiterA.send('a')
    }

    void fireAndForgetB(){
        waiterB.send('b')
    }
}

