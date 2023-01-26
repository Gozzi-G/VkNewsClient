package com.example.vknewsclient.ui

import com.example.vknewsclient.domain.FeedPost
import com.example.vknewsclient.domain.PostComment

sealed class HomeScreenState {
    object Initial: HomeScreenState()
    data class Posts(val posts: List<FeedPost>): HomeScreenState()
    data class Comments(val feed: FeedPost, val comments: List<PostComment>): HomeScreenState()
}