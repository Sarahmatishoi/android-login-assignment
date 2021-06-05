package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class signup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        var spgender=findViewById<Spinner>(R.id.spgender)
       var btnbutton=findViewById<Button>(R.id.btnbutton)

        btnbutton.setOnClickListener{
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
        val gender= arrayOf("male","female","others")
        val adapter= ArrayAdapter<String>(baseContext,android.R.layout.simple_spinner_item,gender)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spgender.adapter=adapter

    }
}

