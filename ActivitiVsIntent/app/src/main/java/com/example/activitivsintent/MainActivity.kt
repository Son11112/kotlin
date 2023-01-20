package com.example.activitivsintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val Tieude = findViewById<EditText>(R.id.edtTieuDe)
        val DuLieu = findViewById<EditText>(R.id.edtDuLieu)

        btnSendData.setOnClickListener{
            var Tieude = Tieude.text.toString()
            var DuLieu = DuLieu.text.toString()



            var intent = Intent (this, MainActivity2::class.java)
            intent.putExtra("tv_tieuDe",Tieude)
            intent.putExtra("tv_duLieu",DuLieu)
            startActivity(intent)
        }

    }
}