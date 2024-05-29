package com.example.android2homework11.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.android2homework11.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding: FragmentSecondBinding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getArgs()

    }

    private fun getArgs() = with(binding) {
        try {
            val args: SecondFragmentArgs by navArgs()
            tvName.text = args.model.name
            tvEmail.text = args.model.email
            tvPassword.text = args.model.password.toString()
        } catch (_: Exception) {

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}