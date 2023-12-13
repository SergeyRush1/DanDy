package com.example.dandy.DATA
//раса содержит название и описание рассы
data class Race(val name:String,
                val description:String)
//название и описание бэка
data class BackGround(val name:String,
                      val description:String)
data class Hero(val name:String?, //имя игрового персонажа
                val race: Race?, // расса персонажа
                val level:Int?, // уровень
                val background: BackGround?, // предистория
                val alignment:String?, //мировоззрение


                var armor:Int?, //броня
                var HP:Int?,
                val tmHP:Int?,// текущее здоровье

                val strenght:Int?, //сила
                val dexterity:Int?,// ловкость
                val constitution:Int?,// телосложение
                val intellice:Int?, // интелект
                val wisdom:Int?, // мудрость
                val charisma:Int?, // харизма
        //saving throws
                val stStrenght:Int?, //спасбросок сила
                val stDexterity:Int?, // спасбросок ловкость
                val stConstitution:Int?, // спасбросок телосложение
                val stIntelligence:Int?, // спасбросок интелект
                val stWisdom:Int?, //спасброок мудрость
                val stChatrisma:Int?,//спасбросок харизма
    //skills
                val  acrobatics:Int?,//акробатика
                val animanHandling:Int?,// запугивание
                val arcana:Int?,//
                val athletics:Int?,//атлетика
                val deseption:Int?, // обман
                val history:Int?, // история
                val insight:Int?, //проницательность
                val investigation:Int?,//анализ
                val medicine:Int?,//медицина
                val nature:Int?,//природа
                val perception:Int?,
                val perfomance:Int?,//выступление
                val persuasion:Int?,//убеждение
                val religion:Int?,//религия
                val sleightOfHand:Int?,// ловкость рук
                val stealth:Int?,//скрытность
                val survival:Int?,//выживание
                val passivePerceptions:Int?,//пассивная внимательность
                val proficiencyBonus:Int?,//бонус мастерства
                val inspiration:Int?,//вдохновение
) {
    companion object createHero{
        fun createNewHero(): Hero {
            return Hero(
                name = null,
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
                stConstitution = null,
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
                passivePerceptions = null,
                proficiencyBonus = null,
                inspiration = null
            )
        }
    }
}