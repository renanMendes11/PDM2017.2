package com.aluno.renan.monitora

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var receiver: BroadcastReceiverInterno
    lateinit var filter: IntentFilter
    lateinit var texto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.texto = findViewById(R.id.tvMainTexto)
        this.receiver = BroadcastReceiverInterno()
        this.filter = IntentFilter()
        this.filter.addAction(Intent.ACTION_POWER_CONNECTED)
        this.filter.addAction(Intent.ACTION_POWER_DISCONNECTED)

    }

    override fun onResume() {
        super.onResume()
        registerReceiver(this.receiver, this.filter)
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(this.receiver)
    }

    inner class BroadcastReceiverInterno(): BroadcastReceiver(){
        override fun onReceive(p0: Context?, p1: Intent?) {
            val msg = when(intent?.action){
                Intent.ACTION_BATTERY_LOW -> "Bateria está baixa"
                Intent.ACTION_BOOT_COMPLETED -> "abrir Page"
                //Intent.ACTION_VOICE_COMMAND
                Intent.ACTION_REBOOT -> "Reiniciando"
                Intent.ACTION_SHUTDOWN -> "Desligando"
                Intent.ACTION_HEADSET_PLUG -> "Fone conectado"
                Intent.ACTION_POWER_CONNECTED -> "Conectou mesmo"
                Intent.ACTION_POWER_DISCONNECTED -> "Desconectou mesmo"
                else -> "Eita"
            }
            if (msg == "abrir Page")
                abrirPage()
            else
                this@MainActivity.texto.text = msg
        }
    }

    fun abrirPage( ){
        val uri = Uri.parse("http://pdm.valeriacavalcanti.com.br")
        val it = Intent(Intent.ACTION_VIEW, uri)
        startActivity(it)
    }
}
