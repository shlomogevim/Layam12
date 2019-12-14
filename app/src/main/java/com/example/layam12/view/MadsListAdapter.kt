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

        var r1=R.drawable.a1

        holder.view.madImage.setImageResource(getInt(position))
        holder.view.madItemLayout.setOnClickListener {
            val action = ListFragmentDirections.actionToDetails(madsList[position])
            Navigation.findNavController(it).navigate(action)
        }
    }
    private fun getInt(num:Int):Int{
      var num1= when (num){
            0->R.drawable.a1
            1->R.drawable.a2
            2->R.drawable.a3
            3->R.drawable.a4
            4->R.drawable.a5
            5->R.drawable.a6
            6->R.drawable.a7
            7->R.drawable.a8
            8->R.drawable.a9
            9->R.drawable.a10
            10->R.drawable.a11
            11->R.drawable.a12
            10->R.drawable.a13
           else->R.drawable.a1
        }




       return num1
    }



    class MadViewHolder(val view: View) : RecyclerView.ViewHolder(view)

}