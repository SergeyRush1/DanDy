package com.example.dandy.room.DAO

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.dandy.room.HeroCharachteristics
import com.example.dandy.room.HeroDbAntity
import kotlinx.coroutines.flow.Flow

@Dao
interface HeroDao{
    @Query("SELECT name,dexterity FROM heroes WHERE name = :name")
    suspend fun getHeroCharacteristicks(name:String):HeroCharachteristics?
    //suspend fun findByName(name:String):
    @Update(entity = HeroDbAntity::class)
    suspend fun changeHpHERO(HP:Int)
    @Insert
    suspend fun createNewHero(heroDbAntity: HeroDbAntity)

    @Query("SELECT*FROM heroes WHERE id= :id" )
    suspend fun getById(id:Long):Flow<HeroDbAntity?>
}