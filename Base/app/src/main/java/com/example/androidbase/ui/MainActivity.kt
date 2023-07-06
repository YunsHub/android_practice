package com.example.androidbase.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.androidbase.R
import com.example.androidbase.databinding.ActivityMainBinding
import com.example.androidbase.ui.home.BookListFragment
import com.example.androidbase.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_top, HomeFragment()).commit()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_bottom, BookListFragment()).commit()

        val toolbarTemplate = binding.toolbar
        setSupportActionBar(toolbarTemplate)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_menu, menu)
        return true
    }
    
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}