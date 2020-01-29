package com.example.markus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fabOpened = false

        fabPlus.setOnClickListener{
            if (!fabOpened) {
                fabOpened = true
                fabMap.animate().translationY(-resources.getDimension(R.dimen.standard_66))
                fabTime.animate().translationY(-resources.getDimension(R.dimen.standard_116))
            }
            else {
                fabOpened = false
                fabMap.animate().translationY(0f)
                fabTime.animate().translationY(0f)
            }

        }

        //button.setOnClickListener {
            //toast("Mobile Comp")

            //startActivity(Intent(applicationContext, TimeActivity::class.java)

            //val intent = (Intent(applicationContext, TimeActivity::class.java))
            //startActivity(intent)

        fabTime.setOnClickListener {
            val intent = (Intent(applicationContext, TimeActivity::class.java))
            startActivity(intent)
        }

        fabMap.setOnClickListener{
            val intent = (Intent(applicationContext, MapActivity::class.java))
            startActivity(intent)
        }
    }
}
