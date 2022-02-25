package com.example.postexam_m5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.postexam_m5.fragment.CollectionsFragment
import com.example.postexam_m5.fragment.HomeFragment
import com.example.postexam_m5.fragment.MessageFragment
import com.example.postexam_m5.fragment.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    private lateinit var homeFragment: HomeFragment
    private lateinit var collectionFragment: CollectionsFragment
    private lateinit var messageFragment:MessageFragment
    private lateinit var searchFragment:SearchFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

    }

    private fun initViews() {
        bottomNavigationView = findViewById(R.id.bottom_navigation)

        homeFragment = HomeFragment()
        collectionFragment = CollectionsFragment()
        messageFragment = MessageFragment()
        searchFragment = SearchFragment()

        bottomNavigationView.menu.getItem(0).isCheckable = true
        loadFragment(homeFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {menu ->

            when(menu.itemId){
                R.id.page_home -> {
                    loadFragment(homeFragment)
                    true
                }
                R.id.page_collections -> {
                    loadFragment(collectionFragment)
                    true
                }
                R.id.page_messages -> {
                    loadFragment(messageFragment)
                    true
                }
                R.id.page_search -> {
                    loadFragment(searchFragment)
                    true
                }
                else -> false
            }
        }




    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, fragment)
            .commit()
    }
}