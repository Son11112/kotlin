package com.example.baitap20230119

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class FragmentVu : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_vu, container, false)
        val buttomSon = view.findViewById<Button>(R.id.buttomSon)
        val buttomAnh = view.findViewById<Button>(R.id.buttomAnh)
        buttomSon.setOnClickListener{
            findNavController().navigate(R.id.action_fragmentVu_to_fragmentSon)
        }
        buttomAnh.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentVu_to_fragmentAnh)
        }
        return view
    }

}