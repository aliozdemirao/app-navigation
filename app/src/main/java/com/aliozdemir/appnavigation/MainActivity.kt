package com.aliozdemir.appnavigation

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        getNavControllerViaFragment1()
//        getNavControllerViaView1()

//        getNavControllerViaFragment2()
//        getNavControllerViaView2() // Error: does not have a NavController set (NavController'a erişim sorunu var demektir).
        // Sadece onCreate()'de çalışmaz. onResume() vb. de çalışır.
    }

    fun getNavControllerViaFragment1() {
        val navHostFragmentNotView =
            supportFragmentManager.findFragmentById(R.id.navHostFragmentNotView) as NavHostFragment
        val navControllerNotView = navHostFragmentNotView.navController
    }

    fun getNavControllerViaView1() {
        val navHostFragmentContainerView =
            supportFragmentManager.findFragmentById(R.id.navHostFragmentContainerView) as NavHostFragment
        val navControllerContainerView = navHostFragmentContainerView.navController
    }

    override fun onResume() {
        super.onResume()

//        getNavControllerViaView2()
    }

    fun getNavControllerViaFragment2() {
        val navHostFragmentNotView = findViewById<View>(R.id.navHostFragmentNotView)
        val navControllerNotView = navHostFragmentNotView.findNavController()
    }

    fun getNavControllerViaView2() {
        val navHostFragmentContainerView = findViewById<View>(R.id.navHostFragmentContainerView)
        val navControllerContainerView = navHostFragmentContainerView.findNavController()
    }
}
