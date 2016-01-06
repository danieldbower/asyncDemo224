package com.infinum.async

class DemoController {

    AsyncService asyncService
    
    def fireAndForget(){
        switch(params.module){
            case 'a':
                asyncService.fireAndForgetA()
                break
            case 'b':
                asyncService.fireAndForgetB()
                break
        }
        log.debug("returned to controller")
        render 'Returned'
    }
}

