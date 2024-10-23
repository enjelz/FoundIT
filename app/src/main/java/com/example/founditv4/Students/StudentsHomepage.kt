package com.example.founditv4.Students

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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
        menuInflater.inflate(R.menu.main_drawer_menu, menu)
        toolbar.overflowIcon = null
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_s_search -> {
                // Handle search icon click
                return true
            }
            R.id.nav_s_notif -> {
                // Handle notification icon click
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
