package com.tugastengahsemester.yargamiahcmad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = (findViewById<View>(R.id.button1) as Button).also({
            it.setOnClickListener(View.OnClickListener {
                val i = Intent(this@MainActivity, MainActivity1::class.java)
                startActivity(i)
            })
        })
    }

    fun NEXT(view: View) {}
}
