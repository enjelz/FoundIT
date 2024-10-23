package com.example.founditv4.Students

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.founditv4.R

class Students_login : AppCompatActivity() {

    lateinit var textInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_students_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textInput = findViewById(R.id.s_name_input)
        textInput = findViewById(R.id.s_username_input)
        textInput = findViewById(R.id.s_password_input)
    }
    fun s_login_btn_click(view: View) {
        val get_sName = findViewById<EditText>(R.id.s_name_input)
        val s_sName = get_sName.text.toString()

        val get_sUsername = findViewById<EditText>(R.id.s_username_input)
        val s_username = get_sUsername.text.toString()

        val get_sPassword = findViewById<EditText>(R.id.s_password_input)
        val s_password = get_sPassword.text.toString()

        //val intent = Intent(this, MainActivity::class.java).aslo{
        //it.putExtra("s_username", s_username)
       // startActivity(it)
        val intent = Intent(this, StudentsHomepage::class.java)
        startActivity(intent)

    }
}