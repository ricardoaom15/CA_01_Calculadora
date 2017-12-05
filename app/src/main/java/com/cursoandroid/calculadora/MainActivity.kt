package com.cursoandroid.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener(this::operar)
        btnSub.setOnClickListener(this::operar)
        btnMul.setOnClickListener(this::operar)
        btnDiv.setOnClickListener(this::operar)

    }

    fun operar(view: View){
        val n1 = num1.text.toString().toInt()
        val n2 = num2.text.toString().toInt()
        val nRta = when(view.id){
            R.id.btnAdd -> n1 + n2
            R.id.btnSub -> n1 - n2
            R.id.btnMul -> n1 * n2
            else -> n1 / n2
        }
        result.text = "$nRta"
    }
}
