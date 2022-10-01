package com.example.myhometest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.Navigation


class BlankFragment3 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_blank3, container, false)

        val btn_frag3 = view.findViewById<AppCompatButton>(R.id.btnThirdFragment)

        btn_frag3.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_blankFragment3_to_blankFragment4)
        }


        return view

    }
}