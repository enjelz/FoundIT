package com.example.founditv4.DO

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.founditv4.R
import com.example.founditv4.databinding.ActivityDoHomepageBinding


class DOHomepage : DrawerBase2Activity() {

    lateinit var activityDoHomepageBinding: ActivityDoHomepageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_do_homepage) // Provide layout resource ID
        activityDoHomepageBinding = ActivityDoHomepageBinding.inflate(layoutInflater)
        enableEdgeToEdge()

        allocatedActivityTitle("Homepage")
    }
}