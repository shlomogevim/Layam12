package com.example.layam12.view

import android.util.Log
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



        holder.view.madImage.setImageResource(getInt(position))
        holder.view.madItemLayout.setOnClickListener {
            val action = ListFragmentDirections.actionToDetails(madsList[position])
            Navigation.findNavController(it).navigate(action)
        }
    }
    private fun getInt(num:Int):Int{
      var num1= when (num){
            0->R.drawable.b2
            1->R.drawable.b6
            2->R.drawable.b3
            3->R.drawable.b4
            4->R.drawable.b1
            5->R.drawable.b8
            6->R.drawable.b9
            7->R.drawable.b10
            8->R.drawable.b20
            9->R.drawable.b21
            10->R.drawable.b22
            11->R.drawable.b24
            12->R.drawable.b25
           else->R.drawable.b1
        }




       return num1
    }




    class MadViewHolder(val view: View) : RecyclerView.ViewHolder(view)

}