package com.codekul.recyclerview

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.custom_item.view.*

/**
 * Created by pooja on 6/12/17.
 */

class MyAdapter(val list:ArrayList<MyDataClass>):RecyclerView.Adapter<MyAdapter.ViewHolder>(){


    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bindItems(list[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.custom_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }


    class ViewHolder(view: View): RecyclerView.ViewHolder(view)  {
        fun bindItems(data : MyDataClass){
            val _textView1: TextView = itemView.findViewById(R.id.tvName)
            val _textView2: TextView = itemView.findViewById(R.id.tvVersion)
            val _imageView: ImageView = itemView.findViewById(R.id.imgVw)
            _textView1.text = data.name
            _textView2.text=data.version
            _imageView.setImageResource(data.imageIcon)

            //set the onclick listener for the singlt list item
            itemView.setOnClickListener({
                Log.e("ItemClicked", data.name )
            })
        }

    }
}






