package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val city = arrayOf("Voucher","Voucher ongkir","Voucher diskon","Voucher bonus")


        val spinner = findViewById<Spinner>(R.id.spinner)
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,city)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext,"Memasang " + city[position],Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        val buttonClick = findViewById<ImageView>(R.id.backpmsn)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,Menu ::class.java)
            startActivity(intent)
            finish()




        })

        val buttonClick1 = findViewById<Button>(R.id.start1)
        buttonClick1.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this,mypesanan ::class.java)
            startActivity(intent2)
            finish()




        })

    }
}