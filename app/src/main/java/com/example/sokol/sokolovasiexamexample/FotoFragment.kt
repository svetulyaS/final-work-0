package com.example.sokol.sokolovasiexamexample

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import android.content.Intent as Activity2Intent


private const val Hello_KEY="hello"


class FotoFragment : Fragment() {

    lateinit var carouselButton: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_foto2, container, false)

        carouselButton=view.findViewById(R.id.carousel_button)
        carouselButton.setOnClickListener {
            val Activity2Intent : Intent = Intent(this, Activity2::class.java)
            Activity2Intent.putExtra(Hello_KEY,"Carousel")
            startActivity(Activity2Intent)
        }




        return view



    }






}

