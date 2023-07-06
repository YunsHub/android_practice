package com.example.androidbase.ui.booklist

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidbase.data.model.Book
import com.example.androidbase.data.model.BookListResponse
import com.example.androidbase.data.repository.BookListRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

const val TAG = "BookListViewModel"
class BookListViewModel: ViewModel() {
    private val bookListRepository: BookListRepository by lazy {BookListRepository()}

    private val _bookList = MutableLiveData<BookListResponse>()
    val bookList: LiveData<BookListResponse> get() = _bookList
    fun getBookList(title: String, start: Int) {
        viewModelScope.launch {
            try {
                val response = bookListRepository.getBookList(title, start)
                if(response.bookList != null) {
                    _bookList.postValue(response)
                }
            }catch (e: Exception) {
                Log.d(TAG, "getBookList: ${e.message}")
            }

        }
    }
}