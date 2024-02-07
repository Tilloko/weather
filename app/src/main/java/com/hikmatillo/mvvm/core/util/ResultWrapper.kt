package com.hikmatillo.mvvm.core.util

data class ResultWrapper<S>(
    val data :S? = null,
    val error:String? = null
)