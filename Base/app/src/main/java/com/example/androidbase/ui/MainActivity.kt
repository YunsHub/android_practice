package com.example.androidbase.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidbase.R
import com.example.androidbase.databinding.ActivityMainBinding
import com.example.androidbase.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_top, HomeFragment())
    }
}