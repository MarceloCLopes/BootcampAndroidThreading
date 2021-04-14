package com.everis.bootcamp.threading

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO: 018 - fazer o handle do clique do botão
    }

    fun showData(list: List<AstrosPeople>?) {
        textview_data.text = ""
        list?.forEach { people ->
            textview_data.append("${people.name} - ${people.craft} \n\n")
        }
    }

    //TODO: 014 - Criar função para exibir a ProgressBar


    //TODO: 015 - Criar função para esconder a ProgressBar


    //TODO: 017 - Criar função para lançar a Task


    //TODO: 016 - Criar classe interna para rodar a tarefa assincrona

}
