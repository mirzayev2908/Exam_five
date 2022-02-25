package com.example.exam_five

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FourthFragment: Fragment() {

    lateinit var tv_done: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fourth,container,false)
        tv_done = view.findViewById(R.id.tv_done)
        tv_done.setOnClickListener{
            openSecondActivity()
        }

        return view
    }
    fun openSecondActivity(){
        val intent = Intent(activity, SecondActivity::class.java)
        startActivity(intent)
    }


}