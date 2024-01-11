package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialog

class About : AppCompatActivity() {

    lateinit var btnShowBottomSheet: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val buttonClick = findViewById<Button>(R.id.balik)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,Menu ::class.java)
            startActivity(intent)
            finish()


        })

        val buttonClick1 = findViewById<Button>(R.id.logout)
        buttonClick1.setOnClickListener(View.OnClickListener {

            val intent1 = Intent(this,MainActivity ::class.java)
            startActivity(intent1)
            finish()


        })

        // initializing our variable for button with its id.
        btnShowBottomSheet = findViewById(R.id.ratepls);

        // adding on click listener for our button.
        btnShowBottomSheet.setOnClickListener {

            // on below line we are creating a new bottom sheet dialog.
            val dialog = BottomSheetDialog(this)

            // on below line we are inflating a layout file which we have created.
            val view = layoutInflater.inflate(R.layout.bottom_sheet_dialog, null)

            // on below line we are creating a variable for our button
            // which we are using to dismiss our dialog.
            val btnClose = view.findViewById<Button>(R.id.idBtnDismiss)

            // on below line we are adding on click listener
            // for our dismissing the dialog button.
            btnClose.setOnClickListener {
                // on below line we are calling a dismiss
                // method to close our dialog.
                dialog.dismiss()
            }
            // below line is use to set cancelable to avoid
            // closing of dialog box when clicking on the screen.
            dialog.setCancelable(false)

            // on below line we are setting
            // content view to our view.
            dialog.setContentView(view)

            // on below line we are calling
            // a show method to display a dialog.
            dialog.show()
        }
    }
}