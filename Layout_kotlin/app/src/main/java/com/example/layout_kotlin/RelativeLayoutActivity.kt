package com.example.layout_kotlin

import android.app.Activity
import android.os.Bundle

class RelativeLayoutActivity : Activity() {
    /**
     * Called when the activity is first created.
     */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)
    }
}