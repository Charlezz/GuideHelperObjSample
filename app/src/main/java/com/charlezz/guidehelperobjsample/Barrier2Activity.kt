package com.charlezz.guidehelperobjsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_barrier2.*

class Barrier2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barrier2)
        hide_tv2.setOnCheckedChangeListener { compoundButton, b ->
                tv2.visibility = if(b) View.VISIBLE else View.GONE
        }
    }
}
