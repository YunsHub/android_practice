package com.example.androidbase.ui.booklist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidbase.R
import com.example.androidbase.data.model.Book
import com.example.androidbase.data.model.BookListResponse
import com.example.androidbase.databinding.FragmentBookListBinding


class BookListFragment : Fragment() {
    private lateinit var binding: FragmentBookListBinding
    private val bookListViewModel: BookListViewModel by viewModels()
    private lateinit var book: List<Book>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBookListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initViewModelCallback()
    }

    private fun initView() {
        bookListViewModel.getBookList("안드로이드", 1)

    }
    private fun initViewModelCallback() {
        bookListViewModel.bookList.observe(viewLifecycleOwner) {
            book = it.bookList
            val bookAdapter = BookAdapter(book)
            bookAdapter.notifyDataSetChanged()
            binding.rvBookList.adapter = bookAdapter
            binding.rvBookList.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }
    }


}