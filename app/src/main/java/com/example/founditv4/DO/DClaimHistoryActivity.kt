package com.example.founditv4.DO

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import com.example.founditv4.R
import com.example.founditv4.databinding.ActivityDclaimHistoryBinding

class DClaimHistoryActivity : DrawerBase2Activity() {

    lateinit var activityDclaimHistory: ActivityDclaimHistoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dclaim_history) // Provide layout resource ID
        activityDclaimHistory = ActivityDclaimHistoryBinding.inflate(layoutInflater)
        enableEdgeToEdge()

        allocatedActivityTitle("Claim History")
    }
}