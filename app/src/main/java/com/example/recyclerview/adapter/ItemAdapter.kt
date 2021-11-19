package com.example.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R

class ItemAdapter (context: Context,
                    private val dataSet: List<String>
                    ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textItem = view.findViewById<TextView>(R.id.textItem)
    }

    //O que vai acontecer quando a nossa viewHolder for criada
    //É aqui onde nós falaremos para ele qual será o layout que ele vai
    //se basear
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    //Como nós manipularemos as informações da nossa lista (dataSet)
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]

        holder.textItem.text = item

    }

    //Armazenar o tamanho do nosso dataSet
    override fun getItemCount(): Int {
        return dataSet.size
    }
}