package com.example.founditv4.Students

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.founditv4.R
import com.example.founditv4.databinding.ActivityStudentsHomepageBinding


class StudentsHomepage : DrawerBaseActivity(){

    lateinit var activityStudentsHomepageBinding: ActivityStudentsHomepageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students_homepage) // Provide layout resource ID
        activityStudentsHomepageBinding = ActivityStudentsHomepageBinding.inflate(layoutInflater)
        enableEdgeToEdge()

        allocatedActivityTitle("Homepage")

    }
}








