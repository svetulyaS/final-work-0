  package com.example.sokol.sokolovasiexamexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val Hello_KEY="hello"


  class Activity2 : AppCompatActivity() {

    lateinit var fotoRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        fotoRecyclerView = findViewById(R.id.foto_recycler_view)
        val fotoList: List<Foto> = listOf(
            Foto("Mountain", R.drawable.gora),
            Foto("Thunderstorm", R.drawable.groza),
            Foto("Forest", R.drawable.les),
            Foto("Sky", R.drawable.nebo)
        )

        fotoRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        fotoRecyclerView.adapter = FotoAdapter(fotoList)


    }



}