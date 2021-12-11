package com.example.sokol.sokolovasiexamexample
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView




class FotoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val fotoImageView:ImageView = itemView.findViewById(R.id.foto_image_view)
    private val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)


    fun bind(foto:Foto) {
        nameTextView.text = foto.name
        fotoImageView.setImageResource(foto.image)
    }

}
