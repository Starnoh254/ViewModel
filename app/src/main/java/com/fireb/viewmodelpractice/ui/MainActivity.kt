package com.fireb.viewmodelpractice.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.fireb.viewmodelpractice.R
import com.fireb.viewmodelpractice.viewmodel.MyViewModel
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel : MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(application))[MyViewModel::class.java]

        val button: MaterialButton = findViewById(R.id.button)
        val mtext : TextView = findViewById(R.id.text)

        mtext.text = viewModel.number.value?.toString()
        viewModel.number.observe(this) {
            mtext.text = it.toString()
        }

        button.setOnClickListener {
            viewModel.increaseNumber()
        }

    }
}