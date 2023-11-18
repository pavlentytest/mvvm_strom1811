package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var btn: Button
    private lateinit var textView: TextView
    private lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button)
        textView = findViewById(R.id.textView)
        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        btn.setOnClickListener {
            myViewModel.updateCounter()
        }
        myViewModel.counter.observe(this, Observer {
            textView.text = it.toString()
        })

    }
}