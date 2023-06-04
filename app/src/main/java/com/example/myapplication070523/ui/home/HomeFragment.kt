package com.example.myapplication070523.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.example.myapplication070523.databinding.FragmentHome2Binding


class HomeFragment : Fragment() {
    private var _binding: FragmentHome2Binding? = null
    val binding get() = _binding!!

    private val mArgs : HomeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //WAJIB PAKE _binding broo, klo ngga nanti hasilnya null dan malah ngga ke run/ketutup lagi app nya 😭
        _binding = FragmentHome2Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
    }

    private fun loadData(){
        val name = mArgs.nama
        Toast.makeText(requireContext(), "Hello, $name", Toast.LENGTH_SHORT).show()
        binding.apply {
            tvUsername.text = "Hello, $name"
        }
    }
}