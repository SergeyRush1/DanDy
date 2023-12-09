package com.example.dandy.DATA

data class Race(val name:String, val description:String)
data class BackGround(val name:String, val description:String)
data class Hero(val name:String?,
                val race: Race?,
                val level:Int?,
                val background: BackGround?,
                val alignment:String?,


                var armor:Int?,
                var HP:Int?,
                val tmHP:Int?,

                val strenght:Int?,
                val dexterity:Int?,
                val constitution:Int?,
                val intellice:Int?,
                val wisdom:Int?,
                val charisma:Int?,

                val stStrenght:Int?,
                val stDexterity:Int?,
                val spConstitution:Int?,
                val stIntelligence:Int?,
                val stWisdom:Int?,
                val stChatrisma:Int?,
    //skills
                val  acrobatics:Int?,
                val animanHandling:Int?,
                val arcana:Int?,
                val athletics:Int?,
                val deseption:Int?,
                val history:Int?,
                val insight:Int?,
                val investigation:Int?,
                val medicine:Int?,
                val nature:Int?,
                val perception:Int?,
                val perfomance:Int?,
                val persuasion:Int?,
                val religion:Int?,
                val sleightOfHand:Int?,
                val stealth:Int?,
                val survival:Int?,
                val passivePerceptions:Int?,//пассивная внимательность
) {
    companion object createHero{
        fun createNewHero (): Hero {
            var newHero = Hero(name = null,
                race = null,
                level = null,
                background = null,
                alignment = null,
                armor = null,
                HP = null,
                tmHP = null,
                strenght = null,
                dexterity = null,
                constitution = null,
                intellice = null,
                wisdom = null,
                charisma = null,
                stStrenght = null,
                stDexterity = null,
                spConstitution = null,
                stIntelligence = null,
                stWisdom = null,
                stChatrisma = null,
                acrobatics = null,
                animanHandling = null,
                arcana = null,
                athletics = null,
                deseption = null,
                history = null,
                insight = null,
                investigation = null,
                medicine = null,
                nature = null,
                perception = null,
                perfomance = null,
                persuasion = null,
                religion = null,
                sleightOfHand = null,
                stealth = null,
                survival = null,
                passivePerceptions = null)
            return newHero
        }
    }
}