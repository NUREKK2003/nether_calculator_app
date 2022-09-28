package com.jakubnurkiewicz.nethercalculatorapp.presentation.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.jakubnurkiewicz.nethercalculatorapp.databinding.FragmentMainBinding
import com.jakubnurkiewicz.nethercalculatorapp.presentation.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {
    private lateinit var binding:FragmentMainBinding


    private val viewModel by viewModels<MainViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ChangeTextListeners()

    }

    private fun ChangeTextListeners(){
        /*binding.etOverworldX.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(newCords: Editable?) {
                if(!viewModel.checkIfTextIsntEmpty(binding.etOverworldX.text.toString())){
                    binding.etNetherX.setText(viewModel.calculateNetherCords(binding.etOverworldX.text))
                }
            }
        })
        binding.etOverworldZ.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(newCords: Editable?) {
                if(!viewModel.checkIfTextIsntEmpty(binding.etOverworldZ.text.toString())){
                    binding.etNetherZ.setText(viewModel.calculateNetherCords(binding.etOverworldZ.text))
                }
            }
        })*/
        binding.etNetherX.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(newCords: Editable?) {
                if(!viewModel.checkIfTextIsntEmpty(binding.etNetherX.text.toString())){
                    binding.etOverworldX.setText(viewModel.calculateOverworldCords(binding.etNetherX.text))
                }
            }
        })
        binding.etNetherZ.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(newCords: Editable?) {
                if(!viewModel.checkIfTextIsntEmpty(binding.etNetherZ.text.toString())){
                    binding.etOverworldZ.setText(viewModel.calculateOverworldCords(binding.etNetherZ.text))
                }
            }
        })
    }


}