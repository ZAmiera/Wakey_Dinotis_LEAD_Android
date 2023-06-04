package com.example.myapplication070523.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.myapplication070523.R
import com.example.myapplication070523.databinding.FragmentSplashBinding
import com.example.myapplication070523.ui.login_selector.LoginSelectorActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : Fragment() {
    private var _binding: FragmentSplashBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSplashBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launch{
            delay(2000)
            navigateToSelector()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun navigateToSelector(){
        val direction = SplashFragmentDirections.actionSplashFragmentToLoginSelectorFragment()
        findNavController().navigate(direction)
    }

}