package com.example.addbtn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var num1: EditText? = null
    private var num2: EditText? = null
    private var resultView: TextView ?= null
    private var click:Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addListenButton()


    }

    fun addListenButton(){
        num1 = et_first
        num2 = et_second
        click = button
        resultView = tv_result

    button.setOnClickListener {
        val value1 = num1!!.text.toString()
        val value2 = num2!!.text.toString()
        val a = value1.toInt()
        val b = value2.toInt()
        val sum = a + b

        resultView!!.text = Integer.toString(sum)
    }
    }


}

