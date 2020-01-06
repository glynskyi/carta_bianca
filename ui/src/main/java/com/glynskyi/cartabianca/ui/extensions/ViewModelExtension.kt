package com.glynskyi.cartabianca.ui.extensions

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.*
import com.glynskyi.cartabianca.ui.core.Event

@Suppress("unused")
fun <T> ViewModel.readonly(initial: T? = null): LiveData<T> {
    return MutableLiveData<T>().apply {
        initial?.let { value = it }
    }
}

@Suppress("unused")
fun <T> ViewModel.mutable(initial: T? = null): MutableLiveData<T> {
    return MutableLiveData<T>().apply {
        initial?.let { value = it }
    }
}

@Suppress("unused")
fun <T : Any> ViewModel.event(): MutableLiveData<Event<T>> {
    return MutableLiveData()
}

@Suppress("UNCHECKED_CAST")
inline fun <reified T : ViewModel> Fragment.factory(crossinline factoryFactory: () -> ViewModelProvider.Factory) = lazy {
    ViewModelProviders.of(this, factoryFactory()).get(T::class.java)
}

@Suppress("UNCHECKED_CAST")
inline fun <reified T : ViewModel> AppCompatActivity.factory(crossinline factoryFactory: () -> ViewModelProvider.Factory) = lazy {
    ViewModelProviders.of(this, factoryFactory()).get(T::class.java)
}