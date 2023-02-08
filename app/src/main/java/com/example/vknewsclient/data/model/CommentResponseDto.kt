package com.example.vknewsclient.data.model

import com.google.gson.annotations.SerializedName

data class CommentResponseDto(
    @SerializedName("response") val content: CommentContentDto,
)