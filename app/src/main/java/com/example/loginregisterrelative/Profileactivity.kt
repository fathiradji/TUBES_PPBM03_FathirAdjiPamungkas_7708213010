package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Profileactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profileactivity)

        val buttonClick = findViewById<TextView>(R.id.start)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent( this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        })


    }
}