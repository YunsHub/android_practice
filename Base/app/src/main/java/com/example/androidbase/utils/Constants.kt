package com.example.androidbase.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.androidbase.R

const val BASE_URL = "https://openapi.naver.com/"
const val ClientId = "JByY3rxLsDenflIN8gfB"
const val ClientSecret = "R6RRNnD1Um"

        @BindingAdapter("loadImage")
        fun loadImage(view: ImageView, src: String?){
            Glide.with(view.context)
                .load(src)
                .error(R.drawable.baseline_location_on_24)
                .into(view)
        }

