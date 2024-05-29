package com.example.android2homework11.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android2homework11.data.models.Account
import com.example.android2homework11.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //тут я оставил
//        setupListener()

        goToFragment()
    }

    private fun goToFragment() = with(binding) {
        btnSignUp.setOnClickListener {
            val name = etName.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()
            val model = Account(
                name = name,
                email = email,
                password = password.toInt()
            )
            findNavController().navigate(
                MainFragmentDirections.actionMainFragmentToSecondFragment(
                    model
                )
            )

        }
    }

    //тут я оставил

//    private fun setupListener() {
//        binding.txtMain.setOnClickListener {
//            findNavController().navigate(
//                MainFragmentDirections.actionMainFragmentToSecondFragment(
//                    "Android 2 Lesen 1 save Args"
//                )
//            )
//        }
//    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        const val NAME = "name"
        const val EMAIL = "email"
        const val PASSWORD = "password"
    }

}