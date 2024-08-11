package com.aliozdemir.appnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class PaymentFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? = inflater.inflate(R.layout.fragment_payment, container, false)

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        super.onViewCreated(view, savedInstanceState)

        val btnOpenConfirmationFragment =
            view.findViewById<Button>(R.id.btnOpenConfirmationFragment)

        btnOpenConfirmationFragment.setOnClickListener {
            findNavController().navigate(R.id.action_paymentFragment_to_confirmationFragment)
        }
    }
}
