package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import com.example.loginregisterrelative.databinding.ActivityListviewBinding
import com.example.loginregisterrelative.databinding.ActivityMenu3Binding

class Menu3 : AppCompatActivity() {

    private lateinit var binding: ActivityMenu3Binding
    private lateinit var userArrayList : ArrayList<item>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenu3Binding.inflate(layoutInflater)
        setContentView(R.layout.activity_menu3)
        setContentView(binding.root)

        val buttonClick = findViewById<TextView>(R.id.promolagi)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,Menu ::class.java)
            startActivity(intent)
            finish()


        })
        val buttonClick1 = findViewById<TextView>(R.id.mended)
        buttonClick1.setOnClickListener(View.OnClickListener {

            val intent1 = Intent(this,Menu2 ::class.java)
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

        val imageId = intArrayOf(

            R.drawable.mintchoco, R.drawable.avocadochoco,R.drawable.saltedcaramelchoco,R.drawable.seasaltchoco,R.drawable.whitechocomocha

        )

        val name = arrayOf(

            "Mint Chocolate","Avocado Choco Mousse","Salted Caramel Choco","Sea Salt Choco","White Choco Mocha"
        )

        val lastmessage = arrayOf(

            "Chocolate with Fresh Mint","The smooth choco with avocado","The origin of salted caramel","Choco from the sea!!","The elegant choco mocha"

        )

        val lastMsgTime = arrayOf(

            "Rp15.000","Rp20.000","Rp12.000","Rp12.000","Rp15.000"
        )

        val phoneNo = arrayOf(

            "Rp15.000","Rp20.000","Rp12.000","Rp12.000","Rp15.000"
        )

        val country = arrayOf(

            "Chocolate with Fresh Mint","The smooth choco with avocado","The origin of salted caramel","Choco from the sea!!","The elegant choco mocha"
        )

        userArrayList = ArrayList()

        for( i in name.indices){

            val item = item(name[i],lastmessage[i],lastMsgTime[i],phoneNo[i],country[i],imageId[i])
            userArrayList.add(item)

        }



        binding.listitemview.isClickable = true
        binding.listitemview.adapter = MyAdapter(this, userArrayList)
        binding.listitemview.setOnItemClickListener { parent, view, position, id ->

            val name = name[position]
            val phone = phoneNo[position]
            val country = country[position]
            val imageId = imageId[position]

            val i = Intent(this, itemview::class.java)
            i.putExtra("name",name)
            i.putExtra("phone",phone)
            i.putExtra("country",country)
            i.putExtra("imageId",imageId)
            startActivity(i)


        }
    }
}