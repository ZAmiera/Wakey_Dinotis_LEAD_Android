package com.example.myapplication070523.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication070523.R
import com.example.myapplication070523.databinding.ActivityLogin2Binding
import android.widget.TextView
import android.widget.Toast


class LoginActivity : AppCompatActivity() {
    private var _binding: ActivityLogin2Binding? = null
    val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        _binding = ActivityLogin2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setupClickListener()
    }

    private fun setupClickListener() {
        // TODO : buat handle component click
        binding.apply {
            btnLoginpageSignin.setOnClickListener {
                // TODO : if click sign in
                val username = (tietUsername.text).toString()
                val password = (tietPassword.text).toString()
                val berhasilPass = "admin"
                val berhasilUserName = "Admin"
                if ((password == berhasilPass) && (username == berhasilUserName)) {
                    Toast.makeText(this@LoginActivity, "$username anda berhasil login", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this@LoginActivity, "anda gagal login, silahkan coba lagi", Toast.LENGTH_SHORT).show()
                }

            }
        }
    }
}