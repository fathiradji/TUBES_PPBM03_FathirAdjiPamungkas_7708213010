package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.example.loginregisterrelative.databinding.ActivityViewitemBinding

class itemview : AppCompatActivity() {

    private lateinit var binding : ActivityViewitemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewitemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val country = intent.getStringExtra("country")
        val imageId = intent.getIntExtra("imageId",R.drawable.mintchoco)

        binding.nameProfile.text = name
        binding.phoneProfile.text = phone
        binding.countryProfile.text = country
        binding.profileImage.setImageResource(imageId)

        val buttonClick = findViewById<ImageView>(R.id.backviewitem)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,Menu3 ::class.java)
            startActivity(intent)
            finish()




        })

        val buttonClick4 = findViewById<Button>(R.id.ordervi)
        buttonClick4.setOnClickListener(View.OnClickListener {

            val intent4 = Intent(this, Order::class.java)
            startActivity(intent4)
            finish()
        })

    }
}