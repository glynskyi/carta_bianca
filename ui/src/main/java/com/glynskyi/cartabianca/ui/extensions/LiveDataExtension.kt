package com.glynskyi.cartabianca.ui.extensions

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.glynskyi.cartabianca.ui.core.Event
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.first

fun <T : Any> LiveData<Event<T>>.observeEvent(
    lifecycleOwner: LifecycleOwner,
    observer: (T) -> Unit
) {
    observe(lifecycleOwner, Observer {
        it.getContentIfNotHandled()?.let(observer)
    })
}

@Suppress("UNCHECKED_CAST")
val <T> LiveData<T>.kvalue: T
    get() = value as T

infix fun <T> MutableLiveData<T>.post(value: T) = postValue(value)

suspend fun <T> MutableLiveData<SendChannel<T>>.await(): T {
    val channel = ConflatedBroadcastChannel<T>()
    postValue(channel)
    val result = channel.asFlow().first()
    channel.close()
    return result
}

suspend fun <A, T> MutableLiveData<Pair<A, SendChannel<T>>>.await(arg: A): T {
    val channel = ConflatedBroadcastChannel<T>()
    postValue(Pair(arg, channel))
    val result = channel.asFlow().first()
    channel.close()
    return result
}