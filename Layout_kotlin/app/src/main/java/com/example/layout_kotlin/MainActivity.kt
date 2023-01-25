package com.example.layout_kotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : Activity() {
    /**
     * Called when the activity is first created.
     */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)

        // findViewById Will Search View In View Hierarchy i.e. View Tree
        val linearButton = findViewById<View>(R.id.linearButton) as Button
        val relativeButton = findViewById<View>(R.id.relativeButton) as Button
        val gridButton = findViewById<View>(R.id.gridbutton) as Button
        linearButton.setOnClickListener { // Creating Intent Object
            // Intent is Message
            //      From    : LayoutActivity
            //      To      : LinearLayoutActivity

            // startActivity Method Will Send Intent
            startActivity(
                Intent(
                    this@MainActivity,
                    LinearLayoutActivity::class.java
                )
            )
        }
        relativeButton.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    RelativeLayoutActivity::class.java
                )
            )
        }
        gridButton.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    GridLayoutActivity::class.java
                )
            )
        }
    }
}