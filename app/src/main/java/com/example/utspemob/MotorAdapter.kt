package com.example.utspemob

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MotorAdapter (private val context: Context, private val motorList: List<Motor>) :
    BaseAdapter() {

    override fun getCount(): Int = motorList.size
    override fun getItem(position: Int): Any = motorList[position]
    override fun getItemId(position: Int): Long = position.toLong()
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.item_motor, parent, false)
        val imgMotor = view.findViewById<ImageView>(R.id.imgMotor)
        val txtMotorName = view.findViewById<TextView>(R.id.txtMotorName)
        val txtMotorGenre = view.findViewById<TextView>(R.id.txtMotorGenre)
        val motor = motorList[position]
        imgMotor.setImageResource(motor.imageResId)
        txtMotorName.text = motor.name
        txtMotorGenre.text = motor.genres
        return view
    }
    }