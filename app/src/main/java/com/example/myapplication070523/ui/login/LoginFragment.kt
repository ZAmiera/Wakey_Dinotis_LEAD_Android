package com.example.myapplication070523.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication070523.databinding.FragmentLogin2Binding
import com.example.myapplication070523.databinding.FragmentSplashBinding

class LoginFragment : Fragment() {
    private var _binding: FragmentLogin2Binding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLogin2Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupClickListener()
    }

    private fun setupClickListener() {
        // TODO : buat handle component click
        binding.apply {
            btnLoginpageSignin.setOnClickListener {
                // TODO : if click sign in
                val username = (tietUsername.text).toString()
                val password = (tietPassword.text).toString()
                if (isValid(username, password)) {
                    Toast.makeText(
                        requireContext(),
                        "$username anda berhasil login",
                        Toast.LENGTH_SHORT
                    ).show()

                    navigateToHome(username)
                } else {
                    Toast.makeText(
                        requireContext(),
                        "anda gagal login, silahkan coba lagi",
                        Toast.LENGTH_SHORT
                    ).show()
                }

            }
        }
    }

    private fun navigateToHome(username: String) {
        val direction = LoginFragmentDirections.actionLoginFragmentToHomeFragment2(username)
        findNavController().navigate(direction)
    }

    fun isValid(username: String, pass: String): Boolean =
        (username == "Admin") && (pass == "admin")


}