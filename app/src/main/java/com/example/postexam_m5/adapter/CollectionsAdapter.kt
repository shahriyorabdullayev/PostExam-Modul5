package com.example.postexam_m5.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.postexam_m5.R
import com.example.postexam_m5.model.Collections

class CollectionsAdapter(val context: Context, val items:ArrayList<Collections>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CollectionViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_collections, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return items.size
    }

    class CollectionViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }
}