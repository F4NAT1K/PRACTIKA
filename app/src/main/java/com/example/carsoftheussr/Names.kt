package com.example.carsoftheussr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class Names : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_names)
        setTitle("Заводы СССР")
    }
    fun nextNames (view: View)
    {
        val intent: Intent = Intent(this, NamesNext::class.java)
        startActivity(intent)
    }

    fun onFullInfo (view: View)
    {
        var button = view as ImageButton
        var intent: Intent = Intent(this, firmInfo::class.java)
        intent.putExtra ("zavod", button.tag.toString())
        when(view.id)
        {
            R.id.bazButton -> intent.putExtra("foto", R.drawable.bazlogo)
            R.id.belazButton -> intent.putExtra("foto", R.drawable.belazlogo)
            R.id.yaazButton -> intent.putExtra("foto", R.drawable.yaazlogo)
            R.id.vazButton -> intent.putExtra("foto", R.drawable.vazlogo)
            R.id.gazButton -> intent.putExtra("foto", R.drawable.gazlogo)
            R.id.erazButton -> intent.putExtra("foto", R.drawable.erazlogo)
            R.id.zazButton -> intent.putExtra("foto", R.drawable.zazlogo)
            R.id.zilButton -> intent.putExtra("foto", R.drawable.zillogo)
            R.id.ziuButton -> intent.putExtra("foto", R.drawable.trolzalogo)
            R.id.ijButton -> intent.putExtra("foto", R.drawable.ijlogo)
            R.id.kavzButton -> intent.putExtra("foto", R.drawable.kavzlogo)
            R.id.kazButton -> intent.putExtra("foto", R.drawable.kazlogo)
            R.id.uazButton -> intent.putExtra("foto", R.drawable.uazlogo)
            R.id.uralButton -> intent.putExtra("foto", R.drawable.urallogo)
            R.id.seazButton -> intent.putExtra("foto", R.drawable.seazlogo)
        }
        startActivity(intent)
    }
}