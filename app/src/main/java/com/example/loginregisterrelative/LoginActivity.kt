package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonClick = findViewById<ImageView>(R.id.back1)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
            finish()


        })

        val buttonClick1 = findViewById<TextView>(R.id.daftarlagi)
        buttonClick1.setOnClickListener(View.OnClickListener {

            val intent1 = Intent(this,Registeractivity ::class.java)
            startActivity(intent1)
            finish()


        })

        val buttonClick2 = findViewById<Button>(R.id.login)
        buttonClick2.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this,activity_submit ::class.java)
            startActivity(intent2)
            finish()


        })
    }
}