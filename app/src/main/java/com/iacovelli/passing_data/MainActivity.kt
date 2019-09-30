package com.iacovelli.passing_data

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setWindowFullscreen()

        setupButtonListeners()
    }

    private fun setupButtonListeners() {
        nextFragment.setOnClickListener { instantiateFragment() }
        nextActivity.setOnClickListener { instantiateActivity() }
    }

    private fun instantiateActivity() {

    }

    private fun instantiateFragment() {

    }
}
