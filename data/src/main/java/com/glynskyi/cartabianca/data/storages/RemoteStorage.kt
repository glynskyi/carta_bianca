package com.glynskyi.cartabianca.data.storages

import com.glynskyi.cartabianca.domain.models.Email
import com.glynskyi.cartabianca.domain.models.UserProfile
import com.glynskyi.cartabianca.domain.repositories.RemoteRepository
import kotlinx.coroutines.delay
import javax.inject.Inject

class RemoteStorage @Inject constructor() : RemoteRepository {

    override suspend fun sigIn(email: Email, password: String): UserProfile {
        delay(3000)
        return UserProfile(
            firstName = "Dmytro",
            lastName = "Glynyskyi"
        )
    }
}