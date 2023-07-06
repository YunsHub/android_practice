package com.example.androidbase

import android.app.Application
import com.example.androidbase.data.api.BookApi
import com.example.androidbase.utils.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class ApplcationClass : Application() {
    companion object {
        private val retrofit: Retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        val bookListService: BookApi by lazy { retrofit.create(BookApi::class.java) }
    }
}