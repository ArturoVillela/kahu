package com.firebaseapp.charlieandroidblog.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import androidx.lifecycle.viewModelScope
import com.firebaseapp.charlieandroidblog.room.Records
import com.firebaseapp.charlieandroidblog.room.RecordsDB
import com.firebaseapp.charlieandroidblog.utils.UtilContext
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class VMRecords: ViewModel() {

    init {
        getListRecords()
    }

    private val recordsDao = RecordsDB.getDatabase(UtilContext.getContext()).getRecords()
    var listRecords = MutableLiveData<ArrayList<String>>()

    private fun getListRecords() {
        viewModelScope.launch {
            val records = recordsDao.getAllRecords()
            val list = records.value?.map { StringBuilder().append(it.id)
                .append(it.fecha.toString())
                .append("<->")
                .append(it.title).toString()}
            list?.let{
                listRecords.value = ArrayList(it)
            }
        }
    }

    fun addElementToDB(record: Records){
        viewModelScope.launch {
            recordsDao.insert(record)
        }
    }


}