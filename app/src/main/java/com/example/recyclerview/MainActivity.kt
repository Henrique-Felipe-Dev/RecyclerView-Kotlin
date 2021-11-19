package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.ItemAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        RecyclerView - Cria listas dinâmicas dentro do aplicativo
        Classes para utilização do RecyclerView
        RecyclerView - ViewHolder - Adpter

        item - Pedacinho de layout que vai mostrar os componentes da nossa
        lista

        Adapter - Preparação dos itens que vão aparecer na lista

        ViewHolder - Um conjunto de visualizações que nós mostraremos os
        nossos itens
         */

        val listNome = mutableListOf<String>()

        listNome.add("Henrique")
        listNome.add("Rogério")
        listNome.add("Genivaldo")
        listNome.add("Jonas")
        listNome.add("Jhonatan")
        listNome.add("Henrique")
        listNome.add("Rogério")
        listNome.add("Genivaldo")
        listNome.add("Jonas")
        listNome.add("Jhonatan")
        listNome.add("Henrique")
        listNome.add("Rogério")
        listNome.add("Genivaldo")
        listNome.add("Jonas")
        listNome.add("Jhonatan")
        listNome.add("Henrique")
        listNome.add("Rogério")
        listNome.add("Genivaldo")
        listNome.add("Jonas")
        listNome.add("Jhonatan")
        listNome.add("Henrique")
        listNome.add("Rogério")
        listNome.add("Genivaldo")
        listNome.add("Jonas")
        listNome.add("Jhonatan")


        //Referenciamos a nossa recycler
        val recyclerNome = findViewById<RecyclerView>(R.id.recyclerNome)
        //Definimos o layoutManager do RecyclerView como LinearLayoutManager
        recyclerNome.layoutManager = LinearLayoutManager(this)
        //Configurar o adapter
        recyclerNome.adapter = ItemAdapter(this, listNome)
        //Definir a nossa lista para ter um tamanho fixo
        recyclerNome.setHasFixedSize(true)

    }
}