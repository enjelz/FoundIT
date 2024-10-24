package com.example.founditv4.Students

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import com.example.founditv4.R
import com.example.founditv4.databinding.ActivitySfaqsBinding

class SFAQsActivity : DrawerBaseActivity() {

    lateinit var activitySfaqsBinding: ActivitySfaqsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sfaqs) // Provide layout resource ID
        activitySfaqsBinding = ActivitySfaqsBinding.inflate(layoutInflater)
        enableEdgeToEdge()

        allocatedActivityTitle("FAQs")
    }
    fun Home(view: View) {
        val intent = Intent(this, StudentsHomepage::class.java)
        startActivity(intent)
    }
}