package com.example.androidbase.data.model

import com.google.gson.annotations.SerializedName

data class BookListResponse(
    val start: Int,
    @SerializedName("items")
    val bookList: List<Book>
)

data class Book(
    val title: String,
    val image: String,
    val author: String,
    val discount: String,
    val publisher: String,
    val pubdate: String,
    val isbn: String,
    val description: String
)
