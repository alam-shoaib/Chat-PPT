package com.example.chatppt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun LoginButtonClicked(view: View)
    {

    }
    fun createNewAccount(view: View)
    {
      val singUp=Intent(this,singupActivity::class.java)
        startActivity(singUp)
    }
}