package com.example.founditv4.DO

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import com.example.founditv4.R
import com.example.founditv4.databinding.ActivityDuploadItemBinding

class DUploadItemActivity : DrawerBase2Activity() {

    lateinit var activityDuploadItem: ActivityDuploadItemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dupload_item) // Provide layout resource ID
        activityDuploadItem = ActivityDuploadItemBinding.inflate(layoutInflater)
        enableEdgeToEdge()

        allocatedActivityTitle("Upload Lost Item")
    }
    fun Home(view: View) {
        val intent = Intent(this, DOHomepage::class.java)
        startActivity(intent)
    }
}