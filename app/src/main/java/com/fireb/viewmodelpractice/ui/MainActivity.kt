package com.fireb.viewmodelpractice.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fireb.viewmodelpractice.R
import com.fireb.viewmodelpractice.model.PaymentAdapter
import com.fireb.viewmodelpractice.viewmodel.MyViewModel
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel : MyViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var paymentAdapter: PaymentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler)


        viewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(application))[MyViewModel::class.java]

        val button: MaterialButton = findViewById(R.id.button)
        val mtext : TextView = findViewById(R.id.text)

        viewModel.paymentList.observe(this , Observer {
            Log.d("TAG", it.toString())
            paymentAdapter = PaymentAdapter(it)
            recyclerView.adapter = paymentAdapter

        })
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)




        mtext.text = viewModel.number.value?.toString()
        viewModel.number.observe(this) {
            mtext.text = it.toString()
        }

        button.setOnClickListener {
            viewModel.increaseNumber()
        }

    }
}