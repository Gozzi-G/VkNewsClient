package com.example.vknewsclient

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.vknewsclient.domain.FeedPost
import com.example.vknewsclient.ui.commensts.CommentsViewModel

class CommentsViewModelFactory(
    private val feedPost: FeedPost
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CommentsViewModel(feedPost) as T
    }
}