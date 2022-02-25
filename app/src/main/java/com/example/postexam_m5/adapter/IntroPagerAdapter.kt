package com.example.postexam_m5.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.postexam_m5.R
import com.example.postexam_m5.model.IntroPage

class IntroPagerAdapter(val introPages:ArrayList<IntroPage>, val context: Context) : PagerAdapter() {

    override fun getCount(): Int {
        return introPages.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean = view === `object`

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val view = layoutInflater.inflate(R.layout.item_intro_page, container, false)

        view.findViewById<ImageView>(R.id.iv_intro).setImageResource(introPages[position].image)
        view.findViewById<TextView>(R.id.tv_title).text = introPages[position].title
        view.findViewById<TextView>(R.id.tv_description).text = introPages[position].description

        (container as ViewPager).addView(view)

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val viewPager = container as ViewPager
        val view = `object` as View
        viewPager.removeView(view)
    }
}