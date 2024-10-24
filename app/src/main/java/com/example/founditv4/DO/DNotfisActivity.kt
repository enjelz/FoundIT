package com.example.founditv4.DO

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.founditv4.R
import com.example.founditv4.Students.StudentsHomepage
import com.example.founditv4.databinding.ActivityDnotfisBinding
import com.example.founditv4.databinding.ActivitySnotifsBinding

class DNotfisActivity : AppCompatActivity() {

    lateinit var activityDnotifs: ActivityDnotfisBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snotifs) // Provide layout resource ID
        activityDnotifs = ActivityDnotfisBinding.inflate(layoutInflater)
        enableEdgeToEdge()

        //allocatedActivityTitle("Notifications")
    }
    fun Home(view: View) {
        val intent = Intent(this, DOHomepage::class.java)
        startActivity(intent)
    }
}