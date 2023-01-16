package com.mlk.week2project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val signInActivityModel = SignInActivityModel()
        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val toolBar = findViewById<Toolbar>(R.id.toolbar)

        loginButton.setOnClickListener {
            var correctName = signInActivityModel.checkName(nameEditText.text.toString())
            var correctPassword = signInActivityModel.checkPassword(passwordEditText.text.toString())
            if(!correctName)
                Toast.makeText(applicationContext,"Wrong Name!!",Toast.LENGTH_SHORT).show()
            if(!correctPassword)
                Toast.makeText(applicationContext,"Wrong Password!!",Toast.LENGTH_SHORT).show()
            if (correctName && correctPassword){
                val intent = Intent(applicationContext,HomeActivity::class.java)
                intent.putExtra("name",nameEditText.text.toString())
                startActivity(intent)
            }
        }
        toolBar.setNavigationOnClickListener {
            finish()
        }
    }
}