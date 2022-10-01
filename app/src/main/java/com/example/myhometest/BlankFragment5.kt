package com.example.myhometest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BlankFragment5 : Fragment() {
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_blank5, container, false)
        recyclerView.layoutManager = GridLayoutManager(requireContext(),2)

        val myList = ArrayList<DtaClass>()

        myList.add(DtaClass(R.drawable.a,"David"))
        myList.add(DtaClass(R.drawable.b,"David"))
        myList.add(DtaClass(R.drawable.a,"David"))
        myList.add(DtaClass(R.drawable.b,"David"))
        myList.add(DtaClass(R.drawable.a,"David"))
        myList.add(DtaClass(R.drawable.b,"David"))

        val myAdapter = MyAdapter(myList)
        recyclerView.adapter = myAdapter

        return view
    }
}