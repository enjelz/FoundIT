package com.example.founditv4.DO

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import com.example.founditv4.R
import com.example.founditv4.databinding.ActivityDfaqsBinding

class DFAQsActivity : DrawerBase2Activity() {

    lateinit var activityDfaqsBinding: ActivityDfaqsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dfaqs) // Provide layout resource ID
        activityDfaqsBinding = ActivityDfaqsBinding.inflate(layoutInflater)
        enableEdgeToEdge()

        allocatedActivityTitle("FAQs")
    }
    fun Home(view: View) {
        val intent = Intent(this, DOHomepage::class.java)
        startActivity(intent)
    }
}