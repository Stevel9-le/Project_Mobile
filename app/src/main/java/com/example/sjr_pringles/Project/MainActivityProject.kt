package com.example.sjr_pringles.Project

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sjr_pringles.R
import com.example.sjr_pringles.databinding.ActivityMainProjectBinding

class MainActivityProject : AppCompatActivity() {

    private lateinit var binding: ActivityMainProjectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainProjectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup Toolbar
        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            title = "iCafe Edge - Home"
        }

        // Navigasi ke BookingActivity
        binding.btnBooking.setOnClickListener {
            startActivity(Intent(this, BookingActivity::class.java))
        }

        // Navigasi ke WebViewActivity (Portal Member)
        binding.btnWebView.setOnClickListener {
            startActivity(Intent(this, WebViewActivity::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_search -> {
                Toast.makeText(this, "Search Clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_settings -> {
                Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}