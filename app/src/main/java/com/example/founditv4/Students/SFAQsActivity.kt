package com.example.founditv4.Students

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
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
}