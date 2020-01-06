package com.glynskyi.cartabianca.ui.screen.signin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.glynskyi.cartabianca.ui.R
import com.glynskyi.cartabianca.ui.core.CoreFragment
import com.glynskyi.cartabianca.ui.core.ViewModelFactory
import com.glynskyi.cartabianca.ui.databinding.SignInFragmentBinding
import com.glynskyi.cartabianca.ui.extensions.factory
import javax.inject.Inject

class SignInFragment : CoreFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory<SignInViewModel>

    private val viewModel: SignInViewModel by factory { viewModelFactory }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: SignInFragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.sign_in_fragment, container, false)
        binding.lifecycleOwner = this
        binding.vm = viewModel
        return binding.root
    }
}