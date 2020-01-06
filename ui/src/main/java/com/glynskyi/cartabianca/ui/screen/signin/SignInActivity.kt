package com.glynskyi.cartabianca.ui.screen.signin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.commit
import com.glynskyi.cartabianca.ui.R
import com.glynskyi.cartabianca.ui.core.CoreActivity

class SignInActivity : CoreActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                add(R.id.container, SignInFragment())
            }
        }
    }

    companion object {

        fun getIntent(context: Context) = Intent(context, SignInActivity::class.java)
    }
}