package com.glynskyi.cartabianca.ui.screen.signin

import androidx.lifecycle.ViewModel
import com.glynskyi.cartabianca.ui.extensions.mutable
import com.snakydesign.livedataextensions.combineLatest
import javax.inject.Inject

class SignInViewModel @Inject constructor(): ViewModel() {

    val firstName = mutable("")
    val lastName = mutable("")
    val isValidated = combineLatest(firstName, lastName) { firstName, lastName ->
        firstName.isNotBlank() && lastName.isNotBlank()
    }
}