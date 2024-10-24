package com.example.founditv4.Students

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.activity.enableEdgeToEdge
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

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_students_notif_search, menu)
        toolbar.overflowIcon = null
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_s_notif -> {
                // Start SNotifsActivity
                startActivity(Intent(this, SNotifsActivity::class.java))
                overridePendingTransition(0, 0)
                return true
            }
            // ... other menu items ...
        }
        return super.onOptionsItemSelected(item)
    }
    fun btn_viewItem(view: View) {

        val intent = Intent(this, SRequestForm::class.java)
        startActivity(intent)
    }
    
}
