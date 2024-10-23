package com.example.founditv4.Students

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import com.example.founditv4.R
import com.example.founditv4.databinding.ActivitySclaimHistoryBinding

class SClaimHistoryActivity : DrawerBaseActivity() {

    lateinit var activitySclaimHistory: ActivitySclaimHistoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sclaim_history) // Provide layout resource ID
        activitySclaimHistory = ActivitySclaimHistoryBinding.inflate(layoutInflater)
        enableEdgeToEdge()

        allocatedActivityTitle("Your Claim History")

    }
}