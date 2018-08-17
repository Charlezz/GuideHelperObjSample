package com.charlezz.guidehelperobjsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_group.*

class GroupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group)

        hide_all.setOnCheckedChangeListener { compoundButton, b ->
             group.visibility = if(b) View.VISIBLE else View.GONE
        }
    }
}
