package com.example.carsoftheussr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class NamesNext : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_names_next)
        setTitle("Заводы СССР")
    }
    fun onFullInfo (view: View)
    {
        var button = view as ImageButton
        var intent: Intent = Intent(this, firmInfo::class.java)
        intent.putExtra ("zavod", button.tag.toString())
        when(view.id)
        {
            R.id.kamazButton -> intent.putExtra("foto", R.drawable.kamazlogo)
            R.id.krazButton -> intent.putExtra("foto", R.drawable.krazlogo)
            R.id.lazButton -> intent.putExtra("foto", R.drawable.lazlogo)
            R.id.liazButton -> intent.putExtra("foto", R.drawable.liazlogo)
            R.id.luazButton -> intent.putExtra("foto", R.drawable.lyazlogo)
            R.id.mazButton -> intent.putExtra("foto", R.drawable.mazlogo)
            R.id.mzktButton -> intent.putExtra("foto", R.drawable.mzktlogo)
            R.id.moazButton -> intent.putExtra("foto", R.drawable.moazlogo)
            R.id.moskvichButton -> intent.putExtra("foto", R.drawable.moskvichlogo)
            R.id.namiButton -> intent.putExtra("foto", R.drawable.namilogo)
            R.id.pazButton -> intent.putExtra("foto", R.drawable.pazlogo)
            R.id.rafButton -> intent.putExtra("foto", R.drawable.raflogo)
        }
        startActivity(intent)
    }
}