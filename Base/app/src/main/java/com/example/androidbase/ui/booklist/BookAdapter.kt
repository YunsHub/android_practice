package com.example.androidbase.ui.booklist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidbase.data.model.Book
import com.example.androidbase.databinding.ItemBookListBinding

class BookAdapter(private val bookList: List<Book>) : RecyclerView.Adapter<BookAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ItemBookListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(bookModel: Book) {
            binding.apply {
                book = bookModel
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemBookListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(bookList[position])
    }

    override fun getItemCount(): Int {
        return bookList.count()
    }


}