package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class mypesanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        var viewPager = findViewById<ViewPager>(R.id.viewPager)
        var tablayout = findViewById<TabLayout>(R.id.tablayout)



        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(Dikemas(),"Packaging")
        fragmentAdapter.addFragment(Dikirim(),"Sending")
        fragmentAdapter.addFragment(Diterima(),"Arriving")

        viewPager.adapter = fragmentAdapter
        tablayout.setupWithViewPager(viewPager)

        val buttonClick = findViewById<ImageView>(R.id.backorder)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,Order ::class.java)
            startActivity(intent)
            finish()




        })
    }
}