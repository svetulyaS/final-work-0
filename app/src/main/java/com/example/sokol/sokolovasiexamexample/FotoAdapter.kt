package com.example.sokol.sokolovasiexamexample

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup


class FotoAdapter(private val fotoList: List<Foto>): RecyclerView.Adapter<FotoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FotoViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.foto_list_item,parent,false)
        return FotoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FotoViewHolder, position: Int) {
        val foto =fotoList[position]
        holder.bind(foto)
    }

    override fun getItemCount(): Int {
        return fotoList.size
    }
}



