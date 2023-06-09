package com.example.sevenmonth.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.sevenmonth.data.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
abstract class NoteDataBase: RoomDatabase() {

    abstract fun noteDao():NoteDao

}