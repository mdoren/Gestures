package com.example.gestures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{

    var gDetector: GestureDetectorCompat? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.gDetector = GestureDetectorCompat(this,this)
        gDetector?.setOnDoubleTapListener(this)

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun onDown(p0: MotionEvent?): Boolean {
        getGestureText.text = "onDown"
        return true
    }

    override fun onShowPress(p0: MotionEvent?) {
        getGestureText.text = "onShowPress"
    }

    override fun onSingleTapUp(p0: MotionEvent?): Boolean {
        getGestureText.text = "onSingleTapUp"
        textResponse.text = "boop"
        return true
    }

    override fun onScroll(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        getGestureText.text = "onScroll"
        textResponse.text = "What are you looking for?"
        return true
    }

    override fun onLongPress(p0: MotionEvent?) {
        getGestureText.text = "onLongPress"
        textResponse.text = "Nope, nothing here.."

    }

    override fun onFling(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        getGestureText.text = "onFling"
        textResponse.text = "Weeeeeeee!"
        return true
    }

    override fun onSingleTapConfirmed(p0: MotionEvent?): Boolean {
        getGestureText.text = "onSingleTapConfirmed"
        return true
    }

    override fun onDoubleTap(p0: MotionEvent?): Boolean {
        getGestureText.text = "onDoubleTap"
        return true
    }

    override fun onDoubleTapEvent(p0: MotionEvent?): Boolean {
        getGestureText.text = "onDoubleTapEvent"
        return true
    }
}
