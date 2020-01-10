package com.mlsdev.templates.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.mlsdev.templates.R
import com.mlsdev.templates.databinding.ActivityMainBinding
import com.mlsdev.templates.features.FeaturesFragment
import com.mlsdev.templates.placeholders.PlaceholdersFragment
import com.mlsdev.templates.widgets.WidgetsFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(
                this,
                R.layout.activity_main
            )
        setSupportActionBar(binding.toolbar)
        binding.navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_features -> {
                    openFragment(FeaturesFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navigation_widgets -> {
                    openFragment(WidgetsFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navigation_placeholders -> {
                    openFragment(PlaceholdersFragment())
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
        openFragment(FeaturesFragment())
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container_fragments, fragment)
            .commit()
    }
}
