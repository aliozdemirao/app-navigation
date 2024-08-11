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

//        getNavControllerViaFragment3()
//        getNavControllerViaView3() // Error: does not have a NavController set (NavController'a erişim sorunu var demektir).
        // Sadece onCreate()'de çalışmaz. onResume() vb. de çalışır.

        /*
        val pendingIntent =
            NavDeepLinkBuilder(this)
                .setGraph(R.navigation.nav_graph_transfer) // Açmak istediğimiz graph
                .setDestination(R.id.currencyFragment) // O graphta direkt açmak istediğimiz ekran
//                .setArguments(bundleOf()) // argument var ise
//                .setComponentName(DestinationActivity::class.java) // NavHost başka bir activity üzerinde ise
                .createPendingIntent() // pendingIntent ile Deeplink oluşturma.  */
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
//        getNavControllerViaView3()
    }

    fun getNavControllerViaFragment2() {
        val navHostFragmentNotView = findViewById<View>(R.id.navHostFragmentNotView)
        val navControllerNotView = navHostFragmentNotView.findNavController()
    }

    fun getNavControllerViaView2() {
        val navHostFragmentContainerView = findViewById<View>(R.id.navHostFragmentContainerView)
        val navControllerContainerView = navHostFragmentContainerView.findNavController()
    }

    fun getNavControllerViaFragment3() {
        findNavController(R.id.navHostFragmentNotView)
    }

    fun getNavControllerViaView3() {
        findNavController(R.id.navHostFragmentContainerView)
    }
}
