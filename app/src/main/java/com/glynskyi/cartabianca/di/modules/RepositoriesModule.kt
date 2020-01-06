package com.glynskyi.cartabianca.di.modules

import com.glynskyi.cartabianca.data.storages.RemoteStorage
import com.glynskyi.cartabianca.domain.repositories.RemoteRepository
import dagger.Binds
import dagger.Module

@Module
interface RepositoriesModule {

    @Binds
    fun remoteRepository(storage: RemoteStorage): RemoteRepository
}