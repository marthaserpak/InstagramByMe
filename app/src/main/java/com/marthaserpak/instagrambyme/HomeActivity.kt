package com.marthaserpak.instagrambyme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.LabelVisibilityMode
import kotlinx.android.synthetic.main.bottom_navigation_view.*

class HomeActivity : AppCompatActivity() {
    private val TAG = "HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ptofile)
        Log.d(TAG, "onCreate")

        bottom_navigation_view.setTextVisibility(false)
        bottom_navigation_view.labelVisibilityMode = LabelVisibilityMode.LABEL_VISIBILITY_SELECTED
        bottom_navigation_view.isItemHorizontalTranslationEnabled = false
        bottom_navigation_view.enableAnimation(false)
        for (i in 0 until bottom_navigation_view.menu.size()) {
            bottom_navigation_view.setIconTintList(-1, null)
        }

    }
}