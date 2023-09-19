package com.example.hotel

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.smarteist.autoimageslider.SliderViewAdapter

class SliderAdapter(imageUrl:ArrayList<String>):
    SliderViewAdapter<SliderAdapter.SliderViewHolder>() {

    var sliderImage:ArrayList<String> = imageUrl

    class SliderViewHolder(itemView:View):SliderViewAdapter.ViewHolder(itemView) {
        var imageviwe:ImageView=itemView.findViewById(R.id.image2)
    }

    override fun getCount(): Int {
      return sliderImage.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?): SliderViewHolder {
        var inflater:View=LayoutInflater.from(parent!!.context).inflate(R.layout.slideritem,null)
        return SliderViewHolder(inflater)
    }


    override fun onBindViewHolder(viewHolder: SliderViewHolder?, position: Int) {
        if (viewHolder!=null) Glide.with(viewHolder.itemView).load(sliderImage.get(position)).fitCenter().into(viewHolder.imageviwe)
    }

}