package com.example.activitivsintent

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var intent = intent
        var Td = intent.getStringExtra("tv_tieuDe")
        var Dl = intent.getStringExtra("tv_duLieu")
        var showdatatieuDe = findViewById<TextView>(R.id.tv_tieuDe)
        var showdataDuLieu = findViewById<TextView>(R.id.tv_duLieu)
        showdatatieuDe.text = Td.toString()
        showdataDuLieu.text= Dl.toString()

    }
}