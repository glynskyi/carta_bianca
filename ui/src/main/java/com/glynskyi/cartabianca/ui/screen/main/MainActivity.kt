package com.glynskyi.cartabianca.ui.screen.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.glynskyi.cartabianca.ui.R
import com.glynskyi.cartabianca.ui.core.CoreActivity

class MainActivity : CoreActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                add(R.id.container, MainFragment())
            }
        }
    }
}
