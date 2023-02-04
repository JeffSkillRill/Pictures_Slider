package com.example.jeff_skillrill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var index = 0
    var imgarray:MutableList<Int> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgarray.add(R.drawable.image1)
        imgarray.add(R.drawable.image2)
        imgarray.add(R.drawable.image3)
        imgarray.add(R.drawable.image4)
        imgarray.add(R.drawable.image5)
        imgarray.add(R.drawable.image6)


        img1.setOnClickListener {
            buttons()
            next()
            img1.setImageResource(imgarray[index])

        }

        next.setOnClickListener {
            next()
            img1.setImageResource(imgarray[index])

        }
        prev.setOnClickListener {
            prev()
            img1.setImageResource(imgarray[index])

        }



    }

    private fun next()
    {
        if (index < imgarray.size-1)
        {
            index++
        }
        else{
            index=0
        }
    }

    private fun prev()
    {
        if (index > 0)
        {
            index--
        }
        else{
            index=imgarray.size-1
        }
    }

    private fun buttons()
    {
        next.visibility = View.VISIBLE
        prev.visibility = View.VISIBLE
    }




}