package com.example.myapplication070523.ui.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication070523.databinding.FragmentRegister2Binding
import com.example.myapplication070523.databinding.FragmentSplashBinding
import com.example.myapplication070523.ui.login.LoginFragmentDirections

class RegisterFragment : Fragment() {
    private var _binding: FragmentRegister2Binding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegister2Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupClickListener()
    }

    private fun setupClickListener() {
        // TODO : buat handle component click
        binding.apply {
            btnLoginpageSignup.setOnClickListener {
                // TODO : if click sign in
                val username = (tietUsername.text).toString()
//                Toast.makeText(
//                    requireContext(),
//                    "$username anda berhasil register",
//                    Toast.LENGTH_SHORT
//                ).show()

                navigateToHome(username)
            }
        }
    }

    private fun navigateToHome(username: String) {
        val direction = LoginFragmentDirections.actionLoginFragmentToHomeFragment2(username)
        findNavController().navigate(direction)
    }
}