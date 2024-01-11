package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Menu2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)

        val buttonClick = findViewById<TextView>(R.id.proms)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,Menu ::class.java)
            startActivity(intent)
            finish()


        })
        val buttonClick1 = findViewById<TextView>(R.id.bokung)
        buttonClick1.setOnClickListener(View.OnClickListener {

            val intent1 = Intent(this,Menu3 ::class.java)
            startActivity(intent1)
            finish()


        })
        val buttonClick2 = findViewById<ImageView>(R.id.train)
        buttonClick2.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this,category ::class.java)
            startActivity(intent2)
            finish()


        })

        val buttonClick3 = findViewById<ImageView>(R.id.menu)
        buttonClick3.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this,About ::class.java)
            startActivity(intent2)
            finish()


        })

        val buttonClick4 = findViewById<Button>(R.id.jumbobtn)
        buttonClick4.setOnClickListener(View.OnClickListener {

            val intent3 = Intent(this,Order ::class.java)
            startActivity(intent3)
            finish()


        })

    }
}