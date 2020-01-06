package com.glynskyi.cartabianca.ui.screen.main

import android.util.Log
import androidx.lifecycle.ViewModel
import com.glynskyi.cartabianca.ui.core.Event
import com.glynskyi.cartabianca.ui.extensions.event
import javax.inject.Inject

class MainViewModel @Inject constructor() : ViewModel() {

    val onOpenSignInExample = event<Unit>()

    fun openSignInExample() {
        Log.e("!!!", "openSignInExample")
        onOpenSignInExample.postValue(Event(Unit))
    }
}