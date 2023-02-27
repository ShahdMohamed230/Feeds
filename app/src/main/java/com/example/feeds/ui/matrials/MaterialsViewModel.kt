package com.example.feeds.ui.matrials

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MaterialsViewModel : ViewModel() {

    val price: MutableLiveData<Int> = MutableLiveData()
    val size: MutableLiveData<Int> = MutableLiveData()
    val protein: MutableLiveData<Int> = MutableLiveData()

}