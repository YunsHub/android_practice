package com.example.androidbase.data.datasource.remote

import android.util.Log
import com.example.androidbase.ApplcationClass
import com.example.androidbase.data.model.BookListResponse

class BookListRemoteDatasource {
    suspend fun getBookList(title: String, start: Int): BookListResponse {
        val result = ApplcationClass.bookListService.getBooks(title = title, start = start)
        return try {
            if (result.isSuccessful && result.body() != null) {
                Log.d("TAG", "getBookList: ${result}")
                result.body()!!
            } else {
                Log.d("TAG", "getBookList: ${result}")
                BookListResponse(1, listOf())
            }
        } catch (e: Exception) {
            Log.d("TAG", "getBookList: ${e}")
            BookListResponse(1, listOf())
        }
    }
}