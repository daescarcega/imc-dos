package edu.itesm.calcula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inicia()
    }

    fun inicia(){
        val peso_ = peso.text.toString().toDouble()
        val altura_ = peso.text.toString().toDouble()
        calcula.setOnClickListener {

        }

    }
}