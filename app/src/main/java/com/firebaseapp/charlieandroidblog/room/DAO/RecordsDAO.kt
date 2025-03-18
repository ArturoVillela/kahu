package com.firebaseapp.charlieandroidblog.room.DAO

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.firebaseapp.charlieandroidblog.room.Records

@Dao
interface RecordsDAO {
    
    @Insert
    suspend fun insert(record: Records)
    
    @Delete
    suspend fun delete(record: Records)
     
    @Query("SELECT * FROM Records")
    fun getAllRecords():LiveData<List<Records>>
    
}