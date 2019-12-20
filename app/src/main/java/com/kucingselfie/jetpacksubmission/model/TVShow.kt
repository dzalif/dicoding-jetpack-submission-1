package com.kucingselfie.jetpacksubmission.model

import com.google.gson.annotations.SerializedName

data class TVShow(
    val id: Int,
    val title: String,
    @SerializedName("poster_path")
    val posterPath: String,
    val overview: String
)