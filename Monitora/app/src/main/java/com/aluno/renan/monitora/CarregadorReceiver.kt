package com.aluno.renan.monitora

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class CarregadorReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        val msg = when(intent.action){
            Intent.ACTION_POWER_CONNECTED -> "Conectou"
            Intent.ACTION_POWER_DISCONNECTED -> "Desconectou"
            else -> "Deu errado!"
        }
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}
