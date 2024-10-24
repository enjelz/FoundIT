package com.example.founditv4.DO

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import com.example.founditv4.R
import com.example.founditv4.Students.SNotifsActivity
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

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_do_notif_search, menu)
        toolbar2.overflowIcon = null
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_s_notif -> {
                // Start SNotifsActivity
                startActivity(Intent(this, DNotfisActivity::class.java))
                overridePendingTransition(0, 0)
                return true
            }
            // ... other menu items ...
        }
        return super.onOptionsItemSelected(item)
    }
}