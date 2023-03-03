package com.example.progect3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var Email:EditText
    lateinit var Password:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Email = findViewById(R.id.mainEmail)
        Password = findViewById(R.id.mainPassword)
    }

    fun login(view: View) {
        if (Email.text.isNotEmpty() && Password.text.isNotEmpty()){
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
        else
        {
            val alert = AlertDialog.Builder(this)
                .setTitle("Error")
                .setMessage("Email textedit or Password textedit is null")
                .setPositiveButton("Ok", null)
                .create()
                .show()
        }
    }
}