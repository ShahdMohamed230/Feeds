package com.example.feeds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.feeds.databinding.ActivityMainBinding
import com.example.feeds.databinding.ActivityMaterialsBinding

class materials : AppCompatActivity() {
    lateinit var binding: ActivityMaterialsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMaterialsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}