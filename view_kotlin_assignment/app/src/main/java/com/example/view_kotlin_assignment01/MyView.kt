package com.example.view_kotlin_assignment01

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View


/**
 * Listing 4-15: Creating a new View
 */
class MyView : View {
    constructor(context: Context?) : super(context) {}

    constructor(context: Context?, ats: AttributeSet?, defaultStyle: Int) : super(
        context,
        ats,
        defaultStyle
    ) {
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {}

    override fun onDraw(canvas: Canvas) {
        val height = measuredHeight
        val width = measuredWidth

        val px = width / 2
        val py = height / 2
        val mTextPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        mTextPaint.color = Color.WHITE

        val displayText = "Hello World!"

        val textWidth = mTextPaint.measureText(displayText)

        canvas.drawText(displayText, px - textWidth / 2, py.toFloat(), mTextPaint)
    }

    /**
     * Listing 4-17: A typical View measurement implementation
     */
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val measuredHeight = measureHeight(heightMeasureSpec)
        val measuredWidth = measureWidth(widthMeasureSpec)
        setMeasuredDimension(measuredHeight, measuredWidth)
    }

    private fun measureHeight(measureSpec: Int): Int {
        val specMode = MeasureSpec.getMode(measureSpec)
        val specSize = MeasureSpec.getSize(measureSpec)

        //  Default size if no limits are specified.
        var result = 500
        if (specMode == MeasureSpec.AT_MOST) {
            // Calculate the ideal size of your
            // control within this maximum size.
            // If your control fills the available
            // space return the outer bound.
            result = specSize
        } else if (specMode == MeasureSpec.EXACTLY) {
            // If your control can fit within these bounds return that value.
            result = specSize
        }
        return result
    }

    private fun measureWidth(measureSpec: Int): Int {
        val specMode = MeasureSpec.getMode(measureSpec)
        val specSize = MeasureSpec.getSize(measureSpec)

        var result = 500
        if (specMode == MeasureSpec.AT_MOST) {

            result = specSize
        } else if (specMode == MeasureSpec.EXACTLY) {
            result = specSize
        }
        return result
    }

    /**
     * Listing 4-18: Input event handling for Views
     */
    override fun onKeyDown(keyCode: Int, keyEvent: KeyEvent): Boolean {
        // Return true if the event was handled.
        return true
    }

    override fun onKeyUp(keyCode: Int, keyEvent: KeyEvent): Boolean {
        // Return true if the event was handled.
        return true
    }

    override fun onTrackballEvent(event: MotionEvent): Boolean {
        // Get the type of action this event represents
        val actionPerformed = event.action
        // Return true if the event was handled.
        return true
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        // Get the type of action this event represents
        val actionPerformed = event.action
        // Return true if the event was handled.
        return true
    }
}