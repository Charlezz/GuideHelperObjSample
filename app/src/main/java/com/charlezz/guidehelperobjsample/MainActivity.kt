package com.charlezz.guidehelperobjsample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        guide_line.setOnClickListener {
            startActivity(Intent(this, GuideLineActivity::class.java))
        }
        barrier1.setOnClickListener {
            startActivity(Intent(this, Barrier1Activity::class.java))
        }
        barrier2.setOnClickListener {
            startActivity(Intent(this, Barrier2Activity::class.java))
        }
        group.setOnClickListener {
            startActivity(Intent(this, GroupActivity::class.java))
        }
        place_holder1.setOnClickListener{
            startActivity(Intent(this, PlaceHolder1Activity::class.java))
        }
        place_holder2.setOnClickListener {
            startActivity(Intent(this, PlaceHolder2Activity::class.java))
        }
    }
}
