package com.example.layam12.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.layam12.R
import com.example.layam12.model.Mad
import kotlinx.android.synthetic.main.item_mad.view.*

class MadsListAdapter(val madsList: ArrayList<Mad>) :
    RecyclerView.Adapter<MadsListAdapter.MadViewHolder>() {

    fun updateMadsList(newlist: List<Mad>) {
        madsList.clear()
        madsList.addAll(newlist)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MadViewHolder {
        val inflator = LayoutInflater.from(parent.context)
        val view = inflator.inflate(R.layout.item_mad, parent, false)
        return MadViewHolder(view)
    }

    override fun getItemCount() = madsList.size

    override fun onBindViewHolder(holder: MadViewHolder, position: Int) {
       holder.view.madName.text = madsList[position].name
        holder.view.madItemLayout.setOnClickListener {
            val action = ListFragmentDirections.actionToDetails(madsList[position])
            Navigation.findNavController(it).navigate(action)
        }
    }

    class MadViewHolder(val view: View) : RecyclerView.ViewHolder(view)

}