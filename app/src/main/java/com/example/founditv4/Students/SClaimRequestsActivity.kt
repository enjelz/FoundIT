package com.example.founditv4.Students

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import com.example.founditv4.R
import com.example.founditv4.databinding.ActivitySclaimRequestsBinding

class SClaimRequestsActivity : DrawerBaseActivity() {

    lateinit var activitySClaimRequests: ActivitySclaimRequestsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sclaim_requests) // Provide layout resource ID
        activitySClaimRequests = ActivitySclaimRequestsBinding.inflate(layoutInflater)
        enableEdgeToEdge()

        allocatedActivityTitle("Your Claim Requests")

    }
}