package com.example.feeds.ui.matrials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.feeds.Data
import com.example.feeds.MaterialsAdapter
import com.example.feeds.databinding.ActivityMaterialsBinding

class MaterialsActivity : AppCompatActivity() {
    lateinit var binding: ActivityMaterialsBinding
    private lateinit var viewModel: MaterialsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMaterialsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            viewModel = ViewModelProvider(this@MaterialsActivity)[MaterialsViewModel::class.java]
            recyclerView1.adapter = MaterialsAdapter(Data.getMaterial(), viewModel)

            viewModel.size.value = 1000
            viewModel.price.value = 0
            viewModel.protein.value = 0

            viewModel.size.observe(this@MaterialsActivity) {

            }
            viewModel.price.observe(this@MaterialsActivity) {

            }

            viewModel.protein.observe(this@MaterialsActivity) {

            }
        }
    }
}