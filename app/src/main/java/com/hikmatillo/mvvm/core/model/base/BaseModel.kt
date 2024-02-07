package com.hikmatillo.mvvm.core.model.base

abstract class BaseModel {

    companion object {
        const val NOW_PLAYING = 0
        const val POPULAR = 1
    }

    abstract fun getType() :Int


}