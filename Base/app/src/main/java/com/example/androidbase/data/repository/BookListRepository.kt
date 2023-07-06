package com.example.androidbase.data.repository

import com.example.androidbase.data.datasource.remote.BookListRemoteDatasource
import com.example.androidbase.data.model.BookListResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit

class BookListRepository {
    private val bookListRemoteDatasource: BookListRemoteDatasource by lazy { BookListRemoteDatasource() }
    suspend fun getBookList(title: String, start: Int): BookListResponse {
        return withContext(Dispatchers.IO) {
            bookListRemoteDatasource.getBookList(title, start)
        }

    }
}