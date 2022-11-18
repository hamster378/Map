package com.example.map

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonOnClick(view: View) {
        val intent : Intent = Intent(this@MainActivity, MainActivity2::class.java)
        startActivity(intent)
    }

    fun bntOpl(view: View) { val intent : Intent = Intent(this@MainActivity, oplata::class.java)
        startActivity(intent)}

    fun rasp(view: View) { val intent : Intent = Intent(this@MainActivity, raspicanie::class.java)
        startActivity(intent)
    }

}