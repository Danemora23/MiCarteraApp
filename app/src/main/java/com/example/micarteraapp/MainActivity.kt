package com.example.micarteraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment__ingresar.*
import kotlinx.android.synthetic.main.fragment_blank.*

class MainActivity : AppCompatActivity() {

    val manager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmenInicio()


        btnIngresar.setOnClickListener{
            frangmenIngresar()
        }
        btnGastos.setOnClickListener{
            frangmenGastos()
        }
        btnInicio.setOnClickListener{
            fragmenInicio()
        }
    }
    fun frangmenIngresar(){
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.frameInicio, FragmentIngresar())
        transaction.addToBackStack(null)
        transaction.commit()
    }
    fun frangmenGastos(){
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.frameInicio, FragmentGastos())
        transaction.addToBackStack(null)
        transaction.commit()
    }
    fun fragmenInicio(){
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.frameInicio, FragmentInicio())
        transaction.addToBackStack(null)
        transaction.commit()
    }
}