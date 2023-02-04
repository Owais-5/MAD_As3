package com.example.testing

import com.example.testing.Results

data class QuoteList(

    val count: Int,
    val lastItemIndex: Int,
    val page: Int,
    val results: List<Results>,
    val totalCount: Int,
    val totalPages: Int
)