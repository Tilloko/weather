package com.hikmatillo.mvvm.core.repository



import com.hikmatillo.mvvm.core.model.now.FilmsNowPlayingResponse
import com.hikmatillo.mvvm.core.model.popular.FilmsPopularResponse
import com.hikmatillo.mvvm.core.network.ApiClient
import com.hikmatillo.mvvm.core.util.API_KEY
import com.hikmatillo.mvvm.core.util.ResultWrapper


class FilmsRepository {

    val serviceNow = ApiClient.getFilmsNowPlaying()
    val servicePopular = ApiClient.getFilmsNowPlaying()

    suspend fun getNowFilms(): ResultWrapper<FilmsNowPlayingResponse> {

        val response = serviceNow.getNowPlaying(API_KEY)

        if (response.isSuccessful){
            response.body()?.let { return ResultWrapper(it) }
        }

        return ResultWrapper(error = "Error")
    }


    suspend fun getPopularFilms(): ResultWrapper<FilmsPopularResponse> {
        val response = servicePopular.getPopular(API_KEY)

        if (response.isSuccessful){
            response.body()?.let { return ResultWrapper(it) }
        }
        return ResultWrapper(error = "Error")
    }

}