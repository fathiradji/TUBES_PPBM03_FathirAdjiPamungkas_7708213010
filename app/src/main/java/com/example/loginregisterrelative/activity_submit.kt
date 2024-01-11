package com.example.loginregisterrelative

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.ncorti.slidetoact.SlideToActView
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class activity_submit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit)

        val submitted = findViewById<SlideToActView>(R.id.slide)
        submitted.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {


                // Add a delay of 3 seconds before navigating to MainActivity
                Handler(Looper.getMainLooper()).postDelayed({
                    val pintomain = Intent(this@activity_submit, Menu::class.java)
                    startActivity(pintomain)
                }, 800) // 1500 milliseconds = 1,5 seconds
            }
        }
    }
}