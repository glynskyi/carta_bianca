package com.glynskyi.cartabianca.domain.repositories

import com.glynskyi.cartabianca.domain.models.Email
import com.glynskyi.cartabianca.domain.models.UserProfile

interface RemoteRepository {

    suspend fun sigIn(email: Email, password: String): UserProfile
}