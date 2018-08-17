package com.charlezz.guidehelperobjsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_place_holder1.*

class PlaceHolder1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place_holder1)

        iv1.setOnClickListener {
           place_holder.setContentId(R.id.iv1)
        }
        iv2.setOnClickListener {
            place_holder.setContentId(R.id.iv2)
        }
        iv3.setOnClickListener {
            place_holder.setContentId(R.id.iv3)
        }
    }
}
