package com.example.feeds

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.feeds.databinding.ListItemMaterialsBinding
import com.example.feeds.ui.matrials.MaterialsViewModel

class MaterialsAdapter(
    private val list1: List<MaterialsData>,
    private val viewModel: MaterialsViewModel
) : RecyclerView.Adapter<MaterialsAdapter.ViewHolder>() {
    class ViewHolder(binding: ListItemMaterialsBinding) : RecyclerView.ViewHolder(binding.root) {
        var tvMaterial: TextView = binding.tvMaterial
        var tvProteinRatio = binding.tvProteinRatio
        val checkBox = binding.checkBox
        val edtPrice = binding.edtPrice
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            ListItemMaterialsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list1.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvMaterial.text = list1[position].material
        holder.tvProteinRatio.text = list1[position].protein_ratio.toString()
        holder.checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                viewModel.price.value =
                    viewModel.price.value?.plus(holder.edtPrice.text.toString().toInt())
                viewModel.size.value = viewModel.size.value?.minus(100)
                viewModel.protein.value =
                    viewModel.protein.value?.plus(list1[position].protein_ratio)
            } else {
                viewModel.price.value =
                    viewModel.price.value?.minus(holder.edtPrice.text.toString().toInt())
                viewModel.size.value = viewModel.size.value?.plus(100)
                viewModel.protein.value =
                    viewModel.protein.value?.minus(list1[position].protein_ratio)
            }
        }

    }
}