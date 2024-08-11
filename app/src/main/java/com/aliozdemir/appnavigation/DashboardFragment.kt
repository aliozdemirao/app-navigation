package com.aliozdemir.appnavigation

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class DashboardFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? = inflater.inflate(R.layout.fragment_dashboard, container, false)

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        super.onViewCreated(view, savedInstanceState)

        val btnOpenProfile = view.findViewById<Button>(R.id.btnOpenProfile)
        val btnOpenSettingsDialog = view.findViewById<Button>(R.id.btnOpenSettingsDialog)
        val btnOpenSecondActivity = view.findViewById<Button>(R.id.btnOpenSecondActivity)
        val btnOpenBottomSheetDialogFragment = view.findViewById<Button>(R.id.btnOpenBottomSheetDialogFragment)
        val btnOpenPaymentFragment = view.findViewById<Button>(R.id.btnOpenPaymentFragment)
        val btnOpenTransferFragment = view.findViewById<Button>(R.id.btnOpenTransferFragment)

        val btnOpenConfirmationFragment = view.findViewById<Button>(R.id.btnOpenConfirmationFragment)
        val btnOpenCurrencyFragment = view.findViewById<Button>(R.id.btnOpenCurrencyFragment)

        btnOpenProfile.setOnClickListener {
            val userId = 123
            val deepLinkUri = Uri.parse("https://www.example.com/profile/$userId")
            findNavController().navigate(deepLinkUri)

//            findNavController().navigate(R.id.action_dashboardFragment_to_profileFragment)
//            findNavController().navigate(R.id.profileFragment)
        }

        btnOpenSettingsDialog.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_settingsDialogFragment)
        }

        btnOpenSecondActivity.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_secondActivity)
        }

        btnOpenBottomSheetDialogFragment.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_someBottomSheetFragment)
        }

        btnOpenPaymentFragment.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_navGraphPayment)
        }

        btnOpenTransferFragment.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_navGraphTransfer)
        }

        btnOpenConfirmationFragment.setOnClickListener {
            val userId = 123
            val deepLinkUri = Uri.parse("https://www.example.com/confirmation/$userId")
            findNavController().navigate(deepLinkUri)
        }

        btnOpenCurrencyFragment.setOnClickListener {
            val userId = 123
            val deepLinkUri = Uri.parse("https://www.example.com/currency/$userId")
            findNavController().navigate(deepLinkUri)
        }
    }
}
