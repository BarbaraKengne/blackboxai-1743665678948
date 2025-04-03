package com.example.bookexchange.models

data class Book(
    val id: String,
    val title: String,
    val author: String,
    val coverUrl: String,
    val condition: String,
    val owner: String,
    val location: String,
    val availableForExchange: Boolean = true
)