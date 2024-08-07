package com.aliozdemir.appnavigation

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

        btnOpenProfile.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_profileFragment)
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
    }
}
