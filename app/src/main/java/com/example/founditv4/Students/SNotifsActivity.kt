package com.example.founditv4.Students

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.founditv4.R
import com.example.founditv4.databinding.ActivitySfaqsBinding
import com.example.founditv4.databinding.ActivitySnotifsBinding

class SNotifsActivity : AppCompatActivity() {

    lateinit var activitySnotifs: ActivitySnotifsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snotifs) // Provide layout resource ID
        activitySnotifs = ActivitySnotifsBinding.inflate(layoutInflater)
        enableEdgeToEdge()

        //allocatedActivityTitle("Notifications")
    }
    fun Home(view: View) {
        val intent = Intent(this, StudentsHomepage::class.java)
        startActivity(intent)
    }
}