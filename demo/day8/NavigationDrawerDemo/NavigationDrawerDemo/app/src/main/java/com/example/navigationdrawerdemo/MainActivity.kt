package com.example.navigationdrawerdemo

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var  drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
         drawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        navView.setNavigationItemSelectedListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        return when (item.itemId) {
            R.id.nav_gallery -> {
                // Handle the camera action
                Toast.makeText(applicationContext, "Gallery Selected", Toast.LENGTH_LONG).show()
                true
            }
            R.id.nav_home -> {
                Toast.makeText(applicationContext, "Gallery Selected", Toast.LENGTH_LONG).show()
                true
            }
            R.id.nav_send -> {
                Toast.makeText(applicationContext, "Gallery Selected", Toast.LENGTH_LONG).show()
                true
            }
            R.id.nav_slideshow -> {
                Toast.makeText(applicationContext, "Gallery Selected", Toast.LENGTH_LONG).show()
                true
            }
            R.id.nav_tools -> {
                Toast.makeText(applicationContext, "Gallery Selected", Toast.LENGTH_LONG).show()
                true
            }
            R.id.nav_share -> {
                Toast.makeText(applicationContext, "Gallery Selected", Toast.LENGTH_LONG).show()
                true
            }
            R.id.nav_send -> {
                Toast.makeText(applicationContext, "Gallery Selected", Toast.LENGTH_LONG).show()
                true
            }
            else -> {
                val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
               drawer.closeDrawer(GravityCompat.START)
                true
            }
        }
    }
   override fun onBackPressed() {
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        }
        else {
            super.onBackPressed()
        }
    }
}



