package com.rm.f2ifirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class LinearLayoutActivity : AppCompatActivity() {

    /** Create de variations in Kotlin */
    /*
    * 1 -variables mutable (var)
    **/
    var nomVariable = 0

    lateinit var goToRelative : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)

        // lien goToRelative
        goToRelative = findViewById(R.id.goToRelativeLayout)

        goToRelative.setOnClickListener { /*
                    * 2 -variables mutable (val)
                    **/
            val packageContext = ""
            val intent: Intent =
                Intent( packageContext: this@LinearLayoutActivity, RelativeLayoutActivity::class.java)
            startActivity(intent)
        }

    }

}
