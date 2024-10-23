package com.example.founditv4.Students

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.appcompat.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.example.founditv4.R
import com.google.android.material.navigation.NavigationView
import android.view.View
import androidx.core.view.GravityCompat
import com.example.founditv4.Welcome


open class DrawerBaseActivity : AppCompatActivity(),
    NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawerLayout: DrawerLayout


    override fun setContentView(layoutResID: Int) {
        super.setContentView(R.layout.activity_drawer_base) // Your base layout
        val contentFrame = findViewById<FrameLayout>(R.id.s_activityContainer) // Placeholder
        layoutInflater.inflate(
            layoutResID,
            contentFrame,
            true
        ) // Inflate child layout into placeholder

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawerLayout) // Initialize drawerLayout

        val navigationView = drawerLayout.findViewById<NavigationView>(R.id.s_nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        val toggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.menu_drawer_open,
            R.string.menu_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
    }

    fun allocatedActivityTitle(titleString: String) {
        supportActionBar?.title = titleString
    }

    fun sLogout_click(view: View) {
        val intent = Intent(this, Welcome::class.java)
        startActivity(intent)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        drawerLayout.closeDrawer(GravityCompat.START)

        when (item.itemId) {
            R.id.nav_s_claim_reqs -> {
                startActivity(Intent(this, SClaimRequestsActivity::class.java))
                overridePendingTransition(0, 0)
            }

            R.id.nav_s_claim_his -> {
                startActivity(Intent(this, SClaimHistoryActivity::class.java))
                overridePendingTransition(0, 0)
            }

            R.id.nav_s_faqs -> {
                startActivity(Intent(this, SFAQsActivity::class.java))
                overridePendingTransition(0, 0)
            }
        }
        return false // or false, depending on your desired behavior
    }
}








