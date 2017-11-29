package com.aluno.renan.meuslugares

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegistraActivity : AppCompatActivity() {
    //lateinit var lugares : Array<Lugar>
    lateinit var btnSalvar: Button
    //

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registra)

        this.btnSalvar = findViewById(R.id.btnRegistraSalvar)
        this.btnSalvar.setOnClickListener({ salvar(it) })
    }

    fun salvar(view: View){

    }
}
