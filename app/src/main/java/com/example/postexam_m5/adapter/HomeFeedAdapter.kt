package com.example.postexam_m5.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.postexam_m5.R
import com.example.postexam_m5.model.HomePageFeed
import com.example.postexam_m5.model.HomeRestaurants

class HomeFeedAdapter(val context: Context, val items: ArrayList<HomeRestaurants>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return RestaurantsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_home_restaurants, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return items.size
    }



    class RestaurantsViewHolder(view: View):RecyclerView.ViewHolder(view) {

    }


}