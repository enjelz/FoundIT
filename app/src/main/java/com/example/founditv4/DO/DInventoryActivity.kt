package com.example.founditv4.DO

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.founditv4.R
import com.example.founditv4.databinding.ActivityDinventoryBinding

class DInventoryActivity : DrawerBase2Activity() {

    lateinit var activityDinventory: ActivityDinventoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dinventory) // Provide layout resource ID
        activityDinventory = ActivityDinventoryBinding.inflate(layoutInflater)
        enableEdgeToEdge()

        allocatedActivityTitle("Item Inventory")
    }
}