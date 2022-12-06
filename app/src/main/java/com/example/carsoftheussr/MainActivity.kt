package com.example.carsoftheussr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_CarsOfTheUSSR)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Автомобили СССР")
    }
    fun onNames (view:View)
    {
        val intent: Intent = Intent(this@MainActivity, Names::class.java)
        startActivity(intent)
    }
}