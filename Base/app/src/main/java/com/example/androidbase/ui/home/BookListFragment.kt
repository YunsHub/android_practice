package com.example.androidbase.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidbase.R
import com.example.androidbase.databinding.FragmentBookListBinding


class BookListFragment : Fragment() {
    private lateinit var binding: FragmentBookListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBookListBinding.inflate(inflater, container, false)
        return binding.root
    }


}