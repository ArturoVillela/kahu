package com.firebaseapp.charlieandroidblog.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.firebaseapp.charlieandroidblog.room.DAO.RecordsDAO

@Database(entities = [Records::class], version = 1)
abstract class RecordsDB : RoomDatabase() {

    abstract fun getRecords():RecordsDAO

    companion object {
        @Volatile
        private var INSTANCE: RecordsDB? = null

        fun getDatabase(context: Context): RecordsDB {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RecordsDB::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }

}