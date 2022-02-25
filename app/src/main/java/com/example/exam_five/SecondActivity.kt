package com.example.exam_five

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.viewpager.widget.ViewPager

class SecondActivity : AppCompatActivity() {

    lateinit var viewPager: ViewPager
    lateinit var viewPagerAdapterSecond: ViewPagerAdapterSecond


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        initViews()
    }
    fun initViews(){
        viewPager = findViewById(R.id.viewPager2)
        viewPagerAdapterSecond = ViewPagerAdapterSecond(supportFragmentManager)

        viewPagerAdapterSecond.add(FirstActivity_F())
        viewPagerAdapterSecond.add(FirstActivity_F())

        viewPager.adapter = viewPagerAdapterSecond


    }

}