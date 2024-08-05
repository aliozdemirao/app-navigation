package com.aliozdemir.appnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        getNavControllerViaFragment1()
//        getNavControllerViaView1()
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
}
