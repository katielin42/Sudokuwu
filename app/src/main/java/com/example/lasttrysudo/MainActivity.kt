package com.example.lasttrysudo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonSolve.setOnClickListener{
            val intent = Intent(this,Main2Activity::class.java)
            startActivity(intent)
        }

        buttonPlay.setOnClickListener{
            val intent = Intent(this,Main3Activity::class.java)
            startActivity(intent)
        }
    }
}

//uwu
