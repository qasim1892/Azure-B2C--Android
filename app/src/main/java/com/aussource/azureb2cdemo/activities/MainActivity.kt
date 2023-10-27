package com.aussource.azureb2cdemo.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.aussource.azureb2cdemo.B2CModeFragment
import com.aussource.azureb2cdemo.SingleAccountModeFragment
import com.aussource.azureb2cdemo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null

    // must be public as its used from another refs
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        attachFragment(B2CModeFragment())

    }

    private fun attachFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .replace(binding.contentMain.id, fragment).commit()
    }
}