package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class Registeractivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registeractivity)



        val buttonClick = findViewById<ImageView>(R.id.back2)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
            finish()
        })

        val buttonClick1 = findViewById<TextView>(R.id.loginlagi)
        buttonClick1.setOnClickListener(View.OnClickListener {

            val intent1 = Intent(this,LoginActivity ::class.java)
            startActivity(intent1)
            finish()
        })

        val buttonClick2 = findViewById<TextView>(R.id.regis)
        buttonClick2.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this,LoginActivity ::class.java)
            startActivity(intent2)
            finish()
        })
    }
}