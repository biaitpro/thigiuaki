package com.example.thi_gk2



import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.thigk2.Constant
import com.example.thigk2.ProvinceAdapter
import kotlinx.android.synthetic.main.card_item_std.*


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var layoutManger : LinearLayoutManager;
    private var adapter: ProvinceAdapter? = null
    private lateinit var imageView : ImageView
    private lateinit var changeImageBtn : Button
    private lateinit var viewkk : View
    private lateinit var holder: ProvinceAdapter.QuestionViewHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = Constant.getQuestions()
        recyclerView = findViewById(R.id.slideViewPager);
        recyclerView.adapter = ProvinceAdapter(this, myDataset);
        layoutManger = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView.layoutManager= layoutManger
         viewkk = LayoutInflater.from(this).inflate(R.layout.card_item_std, null, false)

        }



}