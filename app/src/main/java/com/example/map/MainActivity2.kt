package com.example.map

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun tr2(view: View) {val intent : Intent = Intent(this@MainActivity2, marshryt::class.java)
        startActivity(intent)

    }

    fun tr3(view: View) {val intent : Intent = Intent(this@MainActivity2, tr3::class.java)
        startActivity(intent)

    }

    fun tr4(view: View) {val intent : Intent = Intent(this@MainActivity2, tr4::class.java)
        startActivity(intent)

    }

    fun tr5(view: View) {val intent : Intent = Intent(this@MainActivity2, tr5::class.java)
        startActivity(intent)}

    fun tr6(view: View) {val intent : Intent = Intent(this@MainActivity2, tr6::class.java)
        startActivity(intent)}

    fun tr7(view: View) {val intent : Intent = Intent(this@MainActivity2, tr7::class.java)
        startActivity(intent)}

    fun tr8(view: View) {val intent : Intent = Intent(this@MainActivity2, tr8::class.java)
        startActivity(intent)}

    fun tr11(view: View) {val intent : Intent = Intent(this@MainActivity2, tr11::class.java)
        startActivity(intent)}
}