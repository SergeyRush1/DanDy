package com.example.dandy.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.dandy.room.DAO.HeroDao

@Database(version = 1,
    entities = [HeroDbAntity::class])
abstract class AppDatabase:RoomDatabase(){
    abstract fun  getHeroDao():HeroDao
}