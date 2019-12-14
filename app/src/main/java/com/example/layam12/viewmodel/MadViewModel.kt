package com.example.layam12.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.layam12.model.Mad

class MadViewModel(application: Application) : AndroidViewModel(application) {
    val mads by lazy { MutableLiveData<List<Mad>>() }
    val loadError by lazy { MutableLiveData<Boolean>() }
    val loadind by lazy { MutableLiveData<Boolean>() }


    fun refresh() {
        getMads()

    }

    private fun getMads() {
        var mas1 = arrayListOf<Mad>()
        mas1.add(Mad("Mad1"))
        mas1.add(Mad("Mad2"))
        mas1.add(Mad("Mad3"))
        mas1.add(Mad("Mad4"))
        mas1.add(Mad("Mad5"))
        mas1.add(Mad("Mad6"))
        mas1.add(Mad("Mad7"))
        mas1.add(Mad("Mad8"))
        mas1.add(Mad("Mad9"))

        mads.value = mas1
        loadError.value = false
        loadind.value = false
    }

}