package com.example.postexam_m5.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.postexam_m5.R
import com.example.postexam_m5.adapter.CollectionsAdapter
import com.example.postexam_m5.model.Collections


class CollectionsFragment : Fragment() {

    private lateinit var rvCollection:RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_collections, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {

        rvCollection = view.findViewById(R.id.rv_collections)

        rvCollection.layoutManager = GridLayoutManager(requireContext(), 1)

        refreshAdapter(getCollection())

    }

    private fun refreshAdapter(list: ArrayList<Collections>) {
        val adapter = CollectionsAdapter(requireContext(), list)
        rvCollection.adapter = adapter
    }

    private fun getCollection() :ArrayList<Collections>{
        val list = ArrayList<Collections>()

        for (i in 0..10) {
            list.add(Collections(R.drawable.ic_launcher_background, "Name"))
        }
        return list

    }


}