package com.infinum.async

import groovyx.gpars.actor.Actor
import groovyx.gpars.actor.DefaultActor

class Runner extends DefaultActor {

    void act() {
        loop{
            react {
                log.debug("Fire And Forget ${it} - in Actor")
                longWait()
                log.info("Target reached ${it} - in Actor")
            }
        }
    }

    /**
     * Example process
     *
     * To Investigate, can we access the hibernate session from here?  Probably not.
     */
    void longWait(){
        Thread.sleep(30000L)
    }
}
