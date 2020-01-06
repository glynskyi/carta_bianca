package com.glynskyi.cartabianca

import com.glynskyi.cartabianca.di.DaggerAppComponent
import dagger.android.DaggerApplication

class CartaBiancaApp : DaggerApplication() {

    private val appComponent by lazy {
        DaggerAppComponent
            .builder()
            .appContext(this)
            .build()
    }

    override fun applicationInjector() = appComponent
}