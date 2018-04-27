package com.freeankit.sample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startConstraintActivity(view: View) {
        startActivity(Intent(this@MainActivity, ExampleActivity::class.java)
                .putExtra("round", "relative"))
    }

    fun startLinearActivity(view: View) {
        startActivity(Intent(this@MainActivity, ExampleActivity::class.java)
                .putExtra("round", "linear"))
    }

    fun startRelativeActivity(view: View) {
        startActivity(Intent(this@MainActivity, ExampleActivity::class.java)
                .putExtra("round", "relative"))
    }

    fun startFrameActivity(view: View) {
        startActivity(Intent(this@MainActivity, ExampleActivity::class.java)
                .putExtra("round", "frame"))
    }
}
