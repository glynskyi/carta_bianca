package com.glynskyi.cartabianca.di.modules

import com.glynskyi.cartabianca.ui.screen.main.MainActivity
import com.glynskyi.cartabianca.ui.screen.main.MainFragment
import com.glynskyi.cartabianca.ui.screen.signin.SignInActivity
import com.glynskyi.cartabianca.ui.screen.signin.SignInFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Module(
    includes = [
        AndroidSupportInjectionModule::class
    ]
)
interface UiModule {

    @ContributesAndroidInjector
    fun mainActivity(): MainActivity

    @ContributesAndroidInjector
    fun mainFragment(): MainFragment

    @ContributesAndroidInjector
    fun sigInActivity(): SignInActivity

    @ContributesAndroidInjector
    fun sigInFragment(): SignInFragment
}