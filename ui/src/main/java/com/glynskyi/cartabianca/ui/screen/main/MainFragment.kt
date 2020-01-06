package com.glynskyi.cartabianca.ui.screen.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.glynskyi.cartabianca.ui.R
import com.glynskyi.cartabianca.ui.core.CoreFragment
import com.glynskyi.cartabianca.ui.core.ViewModelFactory
import com.glynskyi.cartabianca.ui.databinding.MainFragmentBinding
import com.glynskyi.cartabianca.ui.extensions.factory
import com.glynskyi.cartabianca.ui.extensions.observeEvent
import com.glynskyi.cartabianca.ui.screen.signin.SignInActivity
import javax.inject.Inject

class MainFragment : CoreFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory<MainViewModel>

    private val viewModel: MainViewModel by factory { viewModelFactory }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: MainFragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        binding.lifecycleOwner = this
        binding.vm = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.onOpenSignInExample.observeEvent(this) {
            val intent = SignInActivity.getIntent(requireContext())
            startActivity(intent)
        }
    }
}