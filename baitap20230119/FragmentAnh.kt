package com.example.baitap20230119


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import java.security.AccessController


class FragmentAnh : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_anh, container, false)
        val buttomSon = view.findViewById<Button>(R.id.buttomSon)
        val buttomThao = view.findViewById<Button>(R.id.buttomThao)
        buttomSon.setOnClickListener{
            findNavController().navigate(R.id.action_fragmentAnh_to_fragmentSon)
        }
        buttomThao.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentAnh_to_fragmentThao)
        }
        return  view
    }

}