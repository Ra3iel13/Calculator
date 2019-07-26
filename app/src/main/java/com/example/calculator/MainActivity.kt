package com.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_save.setOnClickListener {
            tv_user_name.text = "Hello " + et_name.text.toString()
        }

        btn_save.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
    }
}
