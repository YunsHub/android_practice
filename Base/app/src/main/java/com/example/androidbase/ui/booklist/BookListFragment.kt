package com.example.androidbase.ui.booklist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.androidbase.R
import com.example.androidbase.databinding.FragmentBookListBinding


class BookListFragment : Fragment() {
    private lateinit var binding: FragmentBookListBinding
    private val bookListViewModel: BookListViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBookListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvList.setOnClickListener {
            bookListViewModel.getBookList("곰", 1)
        }
    }


}