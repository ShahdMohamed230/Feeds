package com.example.feeds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.feeds.databinding.ActivityMaterialsBinding
import com.example.feeds.databinding.ActivityMixesBinding

class mixes : AppCompatActivity() {
    lateinit var binding: ActivityMixesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMixesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}