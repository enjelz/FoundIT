package com.example.founditv4.DO

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.founditv4.R
import com.example.founditv4.databinding.ActivityDclaimRequestsBinding
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
}