package com.example.dandy.room

data class HeroNameTuple(
    val id:Long,
    val name:String,
    val HP:Int
)
data class HeroCharachteristics(val id:Long,
    val streinght:Int)

data class changesHp(val HP: Int)