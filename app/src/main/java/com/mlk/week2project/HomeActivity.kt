package com.mlk.week2project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar


class HomeActivity : AppCompatActivity() {

    lateinit var nameFromSignInPage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val toolBar = findViewById<Toolbar>(R.id.toolbar)

        nameFromSignInPage = findViewById(R.id.homeTextView)
        nameFromSignInPage.text  = intent.getStringExtra("name").toString()

        toolBar.setNavigationOnClickListener {
            finish()
        }
    }


}