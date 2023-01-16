package com.mlk.week2project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        val root = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.root)

        root.setOnLongClickListener {
            Toast.makeText(applicationContext,"HIIIII", Toast.LENGTH_SHORT).show()
            startActivity(Intent(applicationContext , SignInActivity::class.java))
            true
        }
    }
}