package com.glynskyi.cartabianca.di

import android.content.Context
import com.glynskyi.cartabianca.CartaBiancaApp
import com.glynskyi.cartabianca.di.modules.RepositoriesModule
import com.glynskyi.cartabianca.di.modules.UiModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector

@Component(
    modules = [
        UiModule::class,
        RepositoriesModule::class
    ]
)
interface AppComponent : AndroidInjector<CartaBiancaApp> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun appContext(context: Context): Builder

        fun build(): AppComponent
    }
}