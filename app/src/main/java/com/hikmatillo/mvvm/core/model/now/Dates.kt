package com.hikmatillo.mvvm.core.model.now

import com.google.gson.annotations.SerializedName

data class Dates(
    @SerializedName("maximum")
    val maximum: String, // 2024-02-07
    @SerializedName("minimum")
    val minimum: String // 2023-12-27
)