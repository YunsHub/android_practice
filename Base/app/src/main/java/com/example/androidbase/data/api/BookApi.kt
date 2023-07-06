package com.example.androidbase.data.api

import com.example.androidbase.data.model.BookListResponse
import com.example.androidbase.utils.ClientId
import com.example.androidbase.utils.ClientSecret
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface BookApi {
    @GET("v1/search/book.json")
    suspend fun getBooks(
        @Header("X-Naver-Client-Id") clientId: String = ClientId,
        @Header("X-Naver-Client-Secret") clientSecret: String = ClientSecret,
        @Query("query") title: String,
        @Query("display") display: Int = 10,
        @Query("start") start: Int
    ): Response<BookListResponse>
}