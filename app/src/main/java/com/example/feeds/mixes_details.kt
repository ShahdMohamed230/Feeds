package com.example.feeds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.feeds.databinding.ActivityMixesBinding
import com.example.feeds.databinding.ActivityMixesDetailsBinding

class mixes_details : AppCompatActivity() {
    lateinit var binding: ActivityMixesDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMixesDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}