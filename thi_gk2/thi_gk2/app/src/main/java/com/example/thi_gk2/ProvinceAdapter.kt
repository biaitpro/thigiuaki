package com.example.thigk2

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.thi_gk2.ActivityMain2
import com.example.thi_gk2.MainActivity
import com.example.thi_gk2.ProvinceModal
import com.example.thi_gk2.R


class ProvinceAdapter(
    private val context: Context,
    private val dataset: ArrayList<ProvinceModal>,
) : RecyclerView.Adapter<ProvinceAdapter.QuestionViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProvinceAdapter.QuestionViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.card_item_std, parent, false)

        return QuestionViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ProvinceAdapter.QuestionViewHolder, position: Int) {
        val item = dataset[position]
        holder.image.setImageResource(item.img)
        holder.name.text =  "Họ và tên :"+ item.name
        holder.pop.text = "Năm sinh :"+ item.population.toString()

        holder.deletebtn.setOnClickListener {
            if(dataset.size <= 1){
            }
            else{
                dataset.removeAt(position)
                notifyItemRemoved(position)
            }
        }
        holder.itemView.setOnClickListener {
            val viewkk = LayoutInflater.from(context).inflate(R.layout.activity_main2, null, false)
            val image = viewkk.findViewById<ImageView>(R.id.img)
            val name = viewkk.findViewById<TextView>(R.id.name)
            val pop = viewkk.findViewById<TextView>(R.id.pop)
            val details = viewkk.findViewById<TextView>(R.id.details)
            val dialogBuilder= AlertDialog.Builder(context)
            dialogBuilder.setView(viewkk)
            image.setImageResource(item.img)
            name.text = "Họ và tên :" +item.name
            pop.text =  "Năm sinh :" +item.population.toString()
            details.text =  "Thông tin chi tiết :"+ item.detail
            dialogBuilder.create().show()

            viewkk.findViewById<Button>(R.id.ImageBtn).setOnClickListener {
                Toast.makeText(context,"huhu",Toast.LENGTH_SHORT).show()
            }

        }

    }


    override fun getItemCount(): Int {
        return dataset.size
    }

    class QuestionViewHolder(private var view:View): RecyclerView.ViewHolder(view){
        var name = view.findViewById<TextView>(R.id.tv_name)
        var image = view.findViewById<ImageView>(R.id.tv_image)
        var pop = view.findViewById<TextView>(R.id.tv_population)
        var deletebtn = view.findViewById<Button>(R.id.delete_btn);

    }





}