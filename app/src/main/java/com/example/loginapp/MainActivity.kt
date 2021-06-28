package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var loginButton:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton=findViewById(R.id.loginBtn)

        loginButton.setOnClickListener {
            val intent=Intent(this,DashBoard::class.java)
            startActivity(intent)

            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
        }
    }
}