package com.example.progect3.ui.recadapters

import android.content.Context
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.progect3.R

class StateRecycler(val context:Context, val list: ArrayList<state>) : RecyclerView.Adapter<StateRecycler.MyVH>() {

    class MyVH(itemView: View): RecyclerView.ViewHolder(itemView){
        val Name:TextView = itemView.findViewById(R.id.stateName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateRecycler.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.state_adapter,parent, false)
        return MyVH(root)
    }

    override fun onBindViewHolder(holder: StateRecycler.MyVH, position: Int) {
        holder.Name.setText(list[position].name)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}