package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class category : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val buttonClick = findViewById<Button>(R.id.kembali)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
            finish()
        }

    }
}