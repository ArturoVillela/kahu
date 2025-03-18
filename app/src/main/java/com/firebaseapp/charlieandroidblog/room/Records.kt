package com.firebaseapp.charlieandroidblog.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Records (
 @PrimaryKey val id:Int = 0,
 val fecha: Date,
 val title:String
)