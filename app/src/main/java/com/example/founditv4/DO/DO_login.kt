package com.example.founditv4.DO

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.founditv4.R

class DO_login : AppCompatActivity() {

    lateinit var textInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_do_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        textInput = findViewById(R.id.d_name_input)
        textInput = findViewById(R.id.d_username_input)
        textInput = findViewById(R.id.d_password_input)
    }
    fun d_login_btn_click(view: View) {
        val get_dName = findViewById<EditText>(R.id.d_name_input)
        val d_Name = get_dName.text.toString()

        val get_dUsername = findViewById<EditText>(R.id.d_username_input)
        val d_username = get_dUsername.text.toString()

        val get_dPassword = findViewById<EditText>(R.id.d_password_input)
        val d_password = get_dPassword.text.toString()

        //val intent = Intent(this, MainActivity::class.java).also{
        //it.putExtra("s_username", s_username)
        // startActivity(it)

        val intent = Intent(this, DOHomepage::class.java)
        startActivity(intent)

    }
}