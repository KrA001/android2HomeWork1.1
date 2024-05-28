package com.example.android2homework11.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.android2homework11.R
import com.example.android2homework11.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding: FragmentSecondBinding get() = _binding!!
//    private val args by navArgs<SecondFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val name = it.getString("name")
            val email = it.getString("email")
            val password = it.getString("password")

            binding.tvName.text = name
            binding.tvEmail.text = email
            binding.tvPassword.text = password
        }

        //тут я оставил
//        getData()
    }

    //тут я оставил
//    private fun getData() {
//        binding.txtSecond.text = args.name
//    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}