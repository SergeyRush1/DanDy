package com.example.dand.handlers

interface EventHandler<T> {
    fun obtainEvent(event:T)
}