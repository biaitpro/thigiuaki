package com.example.thi_gk2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.thigk2.Constant
import com.example.thigk2.ProvinceAdapter

class ActivityMain2: AppCompatActivity() {
    private lateinit var name_tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        name_tv = findViewById(R.id.name);
//val name: String? = intent.getStringExtra("NAME")
        //name_tv.text = name


    }

}