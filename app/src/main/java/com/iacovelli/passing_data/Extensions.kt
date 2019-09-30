package com.iacovelli.passing_data

import android.app.Activity
import android.graphics.Color
import android.view.View

fun Activity.setWindowFullscreen() {
    window.apply {
        decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        statusBarColor = Color.TRANSPARENT
    }
}
