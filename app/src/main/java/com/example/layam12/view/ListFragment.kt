package com.example.layam12.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.layam12.R
import com.example.layam12.model.Mad
import com.example.layam12.viewmodel.MadViewModel
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment() {

lateinit var viewModel:MadViewModel
private val listAdapter=MadsListAdapter(arrayListOf())

private var madListObserver=Observer<List<Mad>>{list->
     list?.let {
         madsList.visibility=View.VISIBLE
         listAdapter.updateMadsList(it)


     }
}
private var errorObserver=Observer<Boolean>{isError->

    errorMessage.visibility= if (isError) View.VISIBLE else View.INVISIBLE
    if (isError){
        madsList.visibility=View.INVISIBLE
        loadingMessage.visibility=View.INVISIBLE
    }



}
private var loadingObserver=Observer<Boolean>{isLoading->

 loadingMessage.visibility=if (isLoading) View.VISIBLE else View.INVISIBLE
    if (isLoading) {
        errorMessage.visibility = View.INVISIBLE
        madsList.visibility = View.INVISIBLE

    }

}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(MadViewModel::class.java)
        viewModel.mads.observe(this, madListObserver)
        viewModel.loadError.observe(this, errorObserver)
        viewModel.loadind.observe(this, loadingObserver)

        viewModel.refresh()

        madsList.apply {
            layoutManager=LinearLayoutManager(context)
            adapter= listAdapter


        }
refrshLayout.setOnRefreshListener {

    madsList.visibility=View.GONE
    errorMessage.visibility=View.GONE
    loadingMessage.visibility=View.VISIBLE
    viewModel.refresh()
    refrshLayout.isRefreshing=false
}

    }
}
