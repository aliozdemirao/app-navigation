package com.aliozdemir.appnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class TransferFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? = inflater.inflate(R.layout.fragment_transfer, container, false)

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        super.onViewCreated(view, savedInstanceState)

        val btnOpenCurrencyFragment = view.findViewById<Button>(R.id.btnOpenCurrencyFragment)

        btnOpenCurrencyFragment.setOnClickListener {
            findNavController().navigate(R.id.action_transferFragment_to_currencyFragment)
        }
    }
}
