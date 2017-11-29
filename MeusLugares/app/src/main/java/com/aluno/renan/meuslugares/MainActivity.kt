package com.aluno.renan.meuslugares

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var lista: ListView
    val REGISTRA = 1
    lateinit var btnRegistrar: Button
//        var nomes = arrayListOf<String>("Thalita", "Gilberto", "Alex", "Júnior", "Lucas", "Raimundo", "Mateus")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btnRegistrar = findViewById(R.id.btnMainRegistrar)
        this.btnRegistrar.setOnClickListener({ addLugar(it) })
        this.lista = findViewById(R.id.lvMainlistLugar)
//        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomes)
//        this.lista.adapter = adapter

    }
    fun addLugar(view: View){
        val intent = Intent(this, RegistraActivity::class.java)
        startActivityForResult(intent, REGISTRA)
    }


}
