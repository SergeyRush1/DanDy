package com.example.dand.DATA

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Context
import android.content.SharedPreferences
import com.example.dand.UI.theme.DanDCorners
import com.example.dand.UI.theme.DanDSize
import com.example.dand.UI.theme.DanDStyle


class SettingsPreferences(context: Context) {
   // private val context = context
    val setingsPref: SharedPreferences = context.getSharedPreferences(TABLE_NAME_SETTINGS,Context.MODE_PRIVATE)

    fun getSettings():Settings{
        var settings = Settings()
        settings.dark_mode = getDarckMode()
        settings.corners = getCorners()
        settings.paddigSize = getPaddingSize()
        settings.style = getStyle()
        settings.textSize = getTextSize()
        return settings
    }

    fun setSetting(settings: Settings){
        setStyle(settings.style)
        setCorners(settings.corners)
        setDarckMode(settings.dark_mode)
        setPaddingSize(settings.paddigSize)
        setTextSize(settings.textSize)
    }

    @SuppressLint("CommitPrefEdits")
    fun setPaddingSize(size:DanDSize){
        when(size){
            DanDSize.Medium -> setingsPref.edit().putString(PADDING_SIZE, MEDIUM)
            DanDSize.Small -> setingsPref.edit().putString(PADDING_SIZE, SMALL)
            DanDSize.Big -> setingsPref.edit().putString(PADDING_SIZE, BIG)
        }
    }

    fun getPaddingSize():DanDSize{
        return  when(setingsPref.getString(PADDING_SIZE, MEDIUM)){
            MEDIUM ->  DanDSize.Medium
            SMALL ->  DanDSize.Small
            BIG ->  DanDSize.Big
            else -> DanDSize.Medium
        }
    }

    fun setCorners(corner:DanDCorners){
        when(corner){
            DanDCorners.Flat -> setingsPref.edit().putString(CORNER_STYLE, FLAT).apply()
            DanDCorners.Rounded -> setingsPref.edit().putString(CORNER_STYLE, ROUNDED).apply()
        }
    }
    fun getCorners():DanDCorners{
        return when(setingsPref.getString(CORNER_STYLE, ROUNDED)){
            FLAT -> DanDCorners.Flat
            ROUNDED -> DanDCorners.Rounded
            else -> DanDCorners.Flat
        }
    }


   fun getTextSize():DanDSize{
    return  when(setingsPref.getString(TEXT_SIZE, MEDIUM)){
           MEDIUM ->  DanDSize.Medium
           SMALL ->  DanDSize.Small
           BIG ->  DanDSize.Big
        else -> DanDSize.Medium
    }
   }
    fun setTextSize(size:DanDSize){
        when(size){
            DanDSize.Medium -> setingsPref.edit().putString(TEXT_SIZE, MEDIUM).apply()
            DanDSize.Small -> setingsPref.edit().putString(TEXT_SIZE, SMALL).apply()
            DanDSize.Big -> setingsPref.edit().putString(TEXT_SIZE, BIG).apply()
        }
    }



    fun getDarckMode():Boolean{
        return setingsPref.getBoolean(DARK_MODE,false)
    }

    fun setDarckMode(darckMode:Boolean){
        setingsPref.edit().putBoolean(DARK_MODE,darckMode).apply()
    }
    fun getStyle():DanDStyle{
        return when( setingsPref.getString(STYLE,"black")){
          "black" -> DanDStyle.Black
          "blue" ->  DanDStyle.Blue
          "green" -> DanDStyle.Green
          "red"-> DanDStyle.Red
          "yellow" ->DanDStyle.Yellow
          else -> DanDStyle.Black
        }
    }



    fun setStyle(style:DanDStyle){
        when(style){
            DanDStyle.Black -> setingsPref.edit().putString(STYLE, BLACK).apply()
            DanDStyle.Blue -> setingsPref.edit().putString(STYLE, BLUE).apply()
            DanDStyle.Yellow -> setingsPref.edit().putString(STYLE, YELLOW).apply()
            DanDStyle.Red -> setingsPref.edit().putString(STYLE, RED).apply()
            DanDStyle.Green -> setingsPref.edit().putString(STYLE, GREEN).apply()
        }
    }
}