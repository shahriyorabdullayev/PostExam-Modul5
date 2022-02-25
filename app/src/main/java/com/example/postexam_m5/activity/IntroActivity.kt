package com.example.postexam_m5.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.example.postexam_m5.MainActivity
import com.example.postexam_m5.R
import com.example.postexam_m5.SharedPref
import com.example.postexam_m5.adapter.IntroPagerAdapter
import com.example.postexam_m5.model.IntroPage
import com.google.android.material.tabs.TabLayout

class IntroActivity : AppCompatActivity() {

    private lateinit var vp: ViewPager
    private lateinit var pages: ArrayList<IntroPage>
    private lateinit var adapter:IntroPagerAdapter
    private lateinit var tab: TabLayout

    private lateinit var btnNext:TextView
    private lateinit var btnSkip:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        pages = addPages()
        initViews()


    }

    private fun initViews() {

        vp = findViewById(R.id.vp_main)
        tab = findViewById(R.id.tab_intro)
        adapter = IntroPagerAdapter(pages, this)
        vp.adapter = adapter
        tab.setupWithViewPager(vp)

        btnSkip = findViewById(R.id.tv_skip)

        btnSkip.setOnClickListener {
            SharedPref(this).isSaved(true)
            openMainActivity()
        }

        if (SharedPref(this).getSaved()){
            openMainActivity()
        }

    }

    private fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun addPages():ArrayList<IntroPage>{
        val list = ArrayList<IntroPage>()

        for (i in 0..3) {
            list.add(IntroPage(R.drawable.im_instagram, "Saved Listings", "Save your favorite listings to come back to them later"))
        }
        return list
    }
}