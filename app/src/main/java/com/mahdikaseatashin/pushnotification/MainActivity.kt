package com.mahdikaseatashin.pushnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.ronash.pushe.Pushe

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Pushe.initialize(this,true)
    }
}
