package com.example.founditv4.DO

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.founditv4.R
import com.example.founditv4.Students.SClaimHistoryActivity
import com.example.founditv4.Students.SClaimRequestsActivity
import com.example.founditv4.Students.SFAQsActivity
import com.example.founditv4.Welcome
import com.google.android.material.navigation.NavigationView

open class DrawerBase2Activity : AppCompatActivity() ,
    NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout

    override fun setContentView(layoutResID: Int) {
        super.setContentView(R.layout.activity_drawer_base2) // Your base layout
        val contentFrame = findViewById<FrameLayout>(R.id.d_activityContainer) // Placeholder
        layoutInflater.inflate(layoutResID, contentFrame, true) // Inflate child layout into placeholder

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById<DrawerLayout>(R.id.ddrawerLayout) // Initialize drawerLayout

        val navigationView = drawerLayout.findViewById<NavigationView>(R.id.d_nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        val toggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.menu_drawer2_open,
            R.string.menu_drawer2_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        drawerLayout.closeDrawer(GravityCompat.START)

        when (item.itemId) {
            R.id.nav_d_upload_item -> {
                startActivity(Intent(this, DUploadItemActivity::class.java))
                overridePendingTransition(0, 0)
            }

            R.id.nav_d_claim_reqs -> {
                startActivity(Intent(this, DClaimRequestsActivity::class.java))
                overridePendingTransition(0, 0)
            }

            R.id.nav_d_claim_his -> {
                startActivity(Intent(this, DClaimHistoryActivity::class.java))
                overridePendingTransition(0, 0)
            }

            R.id.nav_d_inventory -> {
                startActivity(Intent(this, DInventoryActivity::class.java))
                overridePendingTransition(0, 0)
            }

            R.id.nav_d_faqs -> {
                startActivity(Intent(this, DFAQsActivity::class.java))
                overridePendingTransition(0, 0)
            }
        }
        return false // or false, depending on your desired behavior
    }

    fun allocatedActivityTitle(titleString: String) {
        supportActionBar?.title = titleString
    }

    fun dLogout_click(view: View) {
        val intent = Intent(this, Welcome::class.java)
        startActivity(intent)
    }
}