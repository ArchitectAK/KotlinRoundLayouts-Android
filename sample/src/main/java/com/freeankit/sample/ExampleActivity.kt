package com.freeankit.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * @author Ankit Kumar (ankitdroiddeveloper@gmail.com) on 04/04/2018 (MM/DD/YYYY)
 */
class ExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (intent.getStringExtra("round").equals("frame", true))
            setContentView(R.layout.activity_round_framelayout)
        else if (intent.getStringExtra("round").equals("relative", true))
            setContentView(R.layout.activity_round_relativelayout)
        else if (intent.getStringExtra("round").equals("linear", true))
            setContentView(R.layout.activity_round_linearlayout)
    }
}