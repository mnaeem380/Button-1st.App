package com.example.mybuttonapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    btnShowToast.setOnClickListener {
        Log.i("MainActivity", "Button Was Clicked !")
        Toast.makeText(this, "Button Was Clicked !", Toast.LENGTH_SHORT ).show()

    }
        btnSendMsgToNextActivity.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
            val intent= Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }

    }
}