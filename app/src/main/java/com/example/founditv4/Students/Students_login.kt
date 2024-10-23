package com.example.founditv4.Students

import android.content.Context
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

    lateinit var txtName: EditText
    lateinit var txtEmail: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_students_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtName = findViewById(R.id.s_name_input)
        txtEmail = findViewById(R.id.s_email_input)

    }
    fun s_login_btn_click(view: View) {

        val sharedPreferences = getSharedPreferences("user_data", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("name", txtName.text.toString()) // Get text from txtName
        editor.putString("email", txtEmail.text.toString()) // Get text from txtEmail
        editor.apply()

        val intent = Intent(this, StudentsHomepage::class.java)
        startActivity(intent)
    }
}