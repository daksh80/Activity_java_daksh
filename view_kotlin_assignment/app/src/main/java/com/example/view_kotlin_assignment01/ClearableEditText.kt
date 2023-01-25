package com.example.view_kotlin_assignment01

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout

class ClearableEditText(context: Context?) : LinearLayout(context) {
    var editText: EditText
    var clearButton: Button

    init {

        // Inflate the view from the layout resource.
        val infService = Context.LAYOUT_INFLATER_SERVICE
        val li: LayoutInflater = getContext().getSystemService(infService) as LayoutInflater
        li.inflate(R.layout.clearable_edit_text, this, true)

        // Get references to the child controls.
        editText = findViewById<View>(R.id.editText) as EditText
        clearButton = findViewById<View>(R.id.clearButton) as Button

        // Hook up the functionality
        hookupButton()
    }

    /**
     * Listing 4-14: Implementing the Clear Text Button
     */
    private fun hookupButton() {
        clearButton.setOnClickListener { editText.setText("") }
    }
}
