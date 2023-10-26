package com.example.advnative_waroengujang.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.volley.RequestQueue
import com.example.advnative_waroengujang.model.Menu
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class ListMenuModel: ViewModel() {
    val menusLD = MutableLiveData<ArrayList<Menu>>()


}