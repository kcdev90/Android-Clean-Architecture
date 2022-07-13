package com.kcthomas.core

sealed class LoadState<out T> {
    object InFlight : LoadState<Nothing>()
    object Error : LoadState<Nothing>()
    data class Success<out T>(val viewState: T) : LoadState<T>()
}
