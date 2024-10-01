package com.example.lab_1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//----------------------------------------------------------
        val button = findViewById<Button>(R.id.button3)
        val textView = findViewById<TextView>(R.id.textView)

        val view_model = ViewModelProvider(this).get(CustomViewModel::class.java)

        textView.text = view_model.number.toString()

        button.setOnClickListener {
            view_model.Incrementation()
            textView.text = view_model.number.toString()
        }
    }
}