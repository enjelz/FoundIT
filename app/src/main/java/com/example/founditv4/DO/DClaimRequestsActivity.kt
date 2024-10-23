package com.example.founditv4.DO

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.founditv4.R
import com.example.founditv4.databinding.ActivityDclaimHistoryBinding
import com.example.founditv4.databinding.ActivityDclaimRequestsBinding

class DClaimRequestsActivity : DrawerBase2Activity() {

    lateinit var activityDclaimRequests: ActivityDclaimRequestsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dclaim_requests) // Provide layout resource ID
        activityDclaimRequests = ActivityDclaimRequestsBinding.inflate(layoutInflater)
        enableEdgeToEdge()

        allocatedActivityTitle("Claim Requests")
    }
}