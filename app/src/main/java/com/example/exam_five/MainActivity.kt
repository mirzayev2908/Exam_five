package com.example.exam_five

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {

    lateinit var tv_done: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)


        initViews()
    }
    fun initViews(){
        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        var viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        viewPagerAdapter.add(FirstFragment())
        viewPagerAdapter.add(SecondFragment())
        viewPagerAdapter.add(ThirdFragment())
        viewPagerAdapter.add(FourthFragment())

        viewPager.adapter = viewPagerAdapter


    }

}