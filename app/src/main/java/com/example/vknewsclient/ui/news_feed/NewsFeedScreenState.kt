package com.example.vknewsclient.ui.news_feed

import com.example.vknewsclient.domain.FeedPost

sealed class NewsFeedScreenState {
    object Initial: NewsFeedScreenState()
    data class Posts(val posts: List<FeedPost>): NewsFeedScreenState()
}