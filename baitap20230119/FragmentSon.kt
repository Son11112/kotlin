package com.example.baitap20230119

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class FragmentSon : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_son, container, false)
        val buttonVu = view.findViewById<Button>(R.id.buttomVu)
        buttonVu.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentSon_to_fragmentVu)
        }
        return  view
    }

}