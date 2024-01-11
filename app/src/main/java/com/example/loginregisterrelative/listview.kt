package com.example.loginregisterrelative

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginregisterrelative.databinding.ActivityListviewBinding
import com.example.loginregisterrelative.databinding.ActivityMainBinding


class listview : AppCompatActivity() {

    private lateinit var binding: ActivityListviewBinding
    private lateinit var userArrayList : ArrayList<item>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

            "Rp15.000","Rp20.000","Rp12.000","Rp12.000","7:00 AM","Rp15.000"
        )

        val phoneNo = arrayOf(

            "Rp15.000","Rp20.000","Rp12.000","Rp12.000","7:00 AM","Rp15.000"
        )

        val country = arrayOf(

            "Chocolate with Fresh Mint","The smooth choco with avocado","The origin of salted caramel","Choco from the sea!!","The elegant choco mocha"
        )

        userArrayList = ArrayList()

        for( i in name.indices){

            val item = item(name[i],lastmessage[i],lastMsgTime[i],phoneNo[i],country[i],imageId[i])
            userArrayList.add(item)

        }

        binding.listitem.isClickable = true
        binding.listitem.adapter = MyAdapter(this, userArrayList)
        binding.listitem.setOnItemClickListener { parent, view, position, id ->

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