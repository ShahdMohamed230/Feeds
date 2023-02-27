package com.example.feeds

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.feeds.databinding.ListItemMaterialsBinding

class DataAdapter1 (private val list1:List<MaterialsData>): RecyclerView.Adapter<DataAdapter1.ViewHolder>() {
    class ViewHolder(binding: ListItemMaterialsBinding) : RecyclerView.ViewHolder(binding.root) {
        var tvMaterial: TextView =binding.tvMaterial
        var tvProteinRatio=binding.tvProteinRatio
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val view = ListItemMaterialsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list1.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvMaterial.text = list1[position].material
        holder.tvProteinRatio.text = list1[position].protein_ratio.toString()
    }
}