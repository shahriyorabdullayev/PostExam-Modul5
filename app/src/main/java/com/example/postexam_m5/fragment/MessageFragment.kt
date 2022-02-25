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
import com.example.postexam_m5.model.Messages


class MessageFragment : Fragment() {

    private lateinit var rvMessage:RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_message, container, false)
        initView(view)
        return view
    }

    private fun initView(view: View) {
        rvMessage = view.findViewById(R.id.rv_messages)
        rvMessage.layoutManager = GridLayoutManager(requireContext(), 1)

        refreshAdapter(getMessage())

    }

    private fun refreshAdapter(list: ArrayList<Messages>){
        val adapter = MessageAdpater(requireContext(), list)
        rvMessage.adapter = adapter
    }

    private fun getMessage():ArrayList<Messages>{
        val list = ArrayList<Messages>()

        for (i in 0..10) {
            list.add(Messages(R.drawable.ic_launcher_background, "Shahriyor", "Salom yaxshimisan"))
        }
        return list
    }


}