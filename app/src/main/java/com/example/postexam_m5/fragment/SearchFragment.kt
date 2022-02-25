package com.example.postexam_m5.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.postexam_m5.R
import com.example.postexam_m5.adapter.MessageAdpater
import com.example.postexam_m5.adapter.SearchAdapter
import com.example.postexam_m5.model.Messages
import com.example.postexam_m5.model.Search


class SearchFragment : Fragment() {

    private lateinit var rvSearch: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_search, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        rvSearch = view.findViewById(R.id.rv_search)
        rvSearch.layoutManager = GridLayoutManager(requireContext(), 1)

        refreshAdapter(getSearch())


    }

    private fun refreshAdapter(list: ArrayList<Search>){
        val adapter = SearchAdapter(requireContext(), list)
        rvSearch.adapter = adapter
    }

    private fun getSearch():ArrayList<Search>{
        val list = ArrayList<Search>()

        for (i in 0..10) {
            list.add(Search(R.drawable.ic_launcher_background, "Cola", "added 1", "15$"))
        }
        return list
    }


}