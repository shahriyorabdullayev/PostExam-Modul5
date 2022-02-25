package com.example.postexam_m5.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.postexam_m5.R
import com.example.postexam_m5.adapter.HomeFeedAdapter
import com.example.postexam_m5.adapter.MessageAdpater
import com.example.postexam_m5.model.HomePageFeed
import com.example.postexam_m5.model.HomeRestaurants
import com.example.postexam_m5.model.Messages


class HomeFragment : Fragment() {

    private lateinit var rvHome: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        initViews(view)
        return view


    }

    private fun initViews(view: View) {

        rvHome = view.findViewById(R.id.rv_home)
        rvHome.layoutManager = GridLayoutManager(requireContext(), 2)

        refreshAdapter(getFeed())
    }

    private fun refreshAdapter(list: ArrayList<HomeRestaurants>){
        val adapter = HomeFeedAdapter(requireContext(), list)
        rvHome.adapter = adapter
    }

    private fun getFeed(): ArrayList<HomeRestaurants> {
        val list = ArrayList<HomeRestaurants>()

        for (i in 0..10) {
            list.add(HomeRestaurants(R.drawable.ic_launcher_background, "Name", "description"))
        }
        return list
    }




}