package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val buttonClick = findViewById<Button>(R.id.btn_1)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent( this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        })

        val buttonClick2 = findViewById<Button>(R.id.btn_2)
        buttonClick2.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this, Registeractivity::class.java)
            startActivity(intent2)
            finish()
        })
        val buttonClick3 = findViewById<Button>(R.id.about)
        buttonClick3.setOnClickListener(View.OnClickListener {

            val intent3 = Intent( this, Profileactivity::class.java)
            startActivity(intent3)
        })

    }
}


