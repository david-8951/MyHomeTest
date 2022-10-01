package com.example.myhometest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val itemList: ArrayList<DtaClass>): RecyclerView.Adapter<MyAdapter.viewHolder>() {
    inner class viewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.imageView2)
        val text = itemView.findViewById<TextView>(R.id.text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview, parent,false)

        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val myList:DtaClass = itemList[position]
        holder.image.setImageResource(myList.image)
        holder.text.text = myList.text
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}