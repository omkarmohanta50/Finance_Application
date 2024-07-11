package com.example.financeapplication.ViewModel

import androidx.lifecycle.ViewModel
import com.example.financeapplication.Repository.MainRepository

class MainViewModel(val repository: MainRepository): ViewModel() {
    constructor():this(MainRepository())

    fun loadData() = repository.items
    fun loadBudget()= repository.budget
}