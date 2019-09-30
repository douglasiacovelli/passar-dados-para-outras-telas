package com.iacovelli.passing_data

import android.content.Intent
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
        val name = nameInput.text.toString()
        val intent = DetailActivity.createIntent(this, name, User("Douglas", 26, "azul"))

        startActivity(intent)
    }

    private fun instantiateFragment() {
        val name = nameInput.text.toString()
        val fragment = DetailFragment.newInstance(name)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, fragment)
            .addToBackStack(null)
            .commit()
    }
}
