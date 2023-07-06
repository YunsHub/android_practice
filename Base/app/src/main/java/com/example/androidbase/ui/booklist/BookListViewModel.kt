package com.example.androidbase.ui.booklist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidbase.data.repository.BookListRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BookListViewModel: ViewModel() {
    private val bookListRepository: BookListRepository by lazy {BookListRepository()}

    fun getBookList(title: String, start: Int) {
        viewModelScope.launch {
            bookListRepository.getBookList(title, start)
        }
    }
}