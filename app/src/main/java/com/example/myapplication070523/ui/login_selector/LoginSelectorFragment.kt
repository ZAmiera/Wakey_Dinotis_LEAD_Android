package com.example.myapplication070523.ui.login_selector

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication070523.R
import com.example.myapplication070523.databinding.ActivityLoginSelector3Binding
import com.example.myapplication070523.databinding.FragmentLoginSelector3Binding
import com.example.myapplication070523.databinding.FragmentSplashBinding

class LoginSelectorFragment : Fragment() {
    private var _binding: FragmentLoginSelector3Binding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginSelector3Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupClickListener()
    }

    private fun setupClickListener() {
        // TODO : buat handle component click
        binding.apply {
            btnSignin.setOnClickListener {
                // TODO : if click sign in
                navigateToSignIn()

            }
            btnSignup.setOnClickListener {
                navigateToSignUp()
            }
        }
    }

    private fun navigateToSignIn() {
        val direction = LoginSelectorFragmentDirections.actionLoginSelectorFragmentToLoginFragment()
        findNavController().navigate(direction)
    }

    private fun navigateToSignUp() {
        val direction =
            LoginSelectorFragmentDirections.actionLoginSelectorFragmentToRegisterFragment()
        findNavController().navigate(direction)
    }
}