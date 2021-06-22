package com.mahdikaseatashin.pushnotification

import android.app.Application
import com.najva.sdk.NajvaClient
import com.najva.sdk.NajvaConfiguration

class NajvaApplication : Application() {
    override fun onCreate(){
        super.onCreate()
        val config = NajvaConfiguration()
        config.enableLocation()
        registerActivityLifecycleCallbacks(NajvaClient.getInstance(this,config))
    }

    override fun onTerminate() {
        super.onTerminate()
        NajvaClient.getInstance().onAppTerminated()
    }

}
