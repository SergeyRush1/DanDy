package com.example.dandy.imageCrop.settings


//Тип операции обрезки

//Если выбрано Static], наложение неподвижное, изображение подвижное.
//Если выбрано Dynamic, наложение можно перемещать, изменять размер, изображение неподвижное.
enum class CropType {
    Static, Dynamic
}