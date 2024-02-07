package com.hikmatillo.mvvm.core.model.now


import com.google.gson.annotations.SerializedName
import com.hikmatillo.mvvm.core.model.base.BaseModel

data class FilmsNowPlayingResponse(
    @SerializedName("dates")
    val dates: Dates,
    @SerializedName("page")
    val page: Int, // 1
    @SerializedName("results")
    val results: List<BannerResult>,
    @SerializedName("total_pages")
    val totalPages: Int, // 168
    @SerializedName("total_results")
    val totalResults: Int // 3342
): BaseModel() {
    override fun getType(): Int {
        return NOW_PLAYING
    }
}