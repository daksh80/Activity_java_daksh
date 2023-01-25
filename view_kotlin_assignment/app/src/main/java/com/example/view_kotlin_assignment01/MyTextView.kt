package com.example.view_kotlin_assignment01

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView


class MyTextView : TextView {
    constructor(context: Context?, attrs: AttributeSet?, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
    }

    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {}
}
