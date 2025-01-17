package com.example.shop.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController


import com.example.shop.R
import com.example.shop.databinding.ActivityShoppingBinding

class ShoppingActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityShoppingBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val navController=findNavController(R.id.shoppingHostFragment)
        binding.bottomNavigation.setupWithNavController(navController)

    }
}