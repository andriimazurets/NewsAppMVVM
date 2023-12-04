package com.example.newsappmvvm.ui

import androidx.lifecycle.ViewModel
import com.example.newsappmvvm.reposiroty.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
): ViewModel() {
}