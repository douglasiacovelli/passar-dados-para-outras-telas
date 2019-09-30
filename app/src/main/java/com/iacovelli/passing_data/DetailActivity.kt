package com.iacovelli.passing_data

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity: AppCompatActivity() {

    private val name by lazy { intent.getStringExtra(NAME) }
    private val user by lazy { intent.getParcelableExtra<User>(USER)!! }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        setWindowFullscreen()
        setText(user.name)
    }

    private fun setText(text: String) {
        detailText.text = text
    }

    companion object {
        private const val NAME = "name"
        private const val USER = "user"

        fun createIntent(context: Context, name: String, user: User): Intent {
            return Intent(context, DetailActivity::class.java).apply {
                putExtra(NAME, name)
                putExtra(USER, user)
            }
        }
    }

}