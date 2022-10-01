package com.example.myhometest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.Navigation

class BlankFragment4 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_blank4, container, false)

        val btn_frag4 = view.findViewById<AppCompatButton>(R.id.btnsecondFragmentt)

        btn_frag4.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_blankFragment4_to_blankFragment5)
        }


        return view
    }
}