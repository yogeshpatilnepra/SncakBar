package com.example.customsnackbar

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.snackbarlibrary.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootView: View = findViewById(R.id.rootView)

        val button = findViewById<Button>(R.id.btn_snackbar)


        button.setOnClickListener {
            Snackbar.showSnackBar(rootView, "This is a test message!!")
        }
    }
}