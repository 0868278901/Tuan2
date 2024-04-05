package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class tuan21MainActivityResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan21_main_result)
        var tvKQ=findViewById<TextView>(R.id.tuan2tvkq)
        val i1=intent
        val chuoi1= i1.extras!!.getString("so1")
        val so1=chuoi1!!.toFloat()
        val chuoi2= i1.extras!!.getString("so2")
        val so2=chuoi2!!.toFloat()
        val tong=so1+so2
        tvKQ!!.text=tong.toString()
    }
}