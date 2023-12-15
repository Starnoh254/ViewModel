package com.fireb.viewmodelpractice.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fireb.viewmodelpractice.R

class PaymentAdapter(items : List<PaymentDetails>?): RecyclerView.Adapter<PaymentAdapter.ViewHolder>() {

   private var itemList : List<PaymentDetails>? = items
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name = itemView.findViewById<TextView>(R.id.name)
        val amount = itemView.findViewById<TextView>(R.id.amount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_payment,parent,false)
        return  ViewHolder(view)
    }

    override fun getItemCount(): Int {
        var results  = 0
        if (itemList != null){
            results =  itemList!!.size
        }
        return results

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList?.get(position)
        if (item != null) {
            holder.name.text = item.FirstName
        }
        if (item != null) {
            holder.amount.text = item.amount
        }
    }
}