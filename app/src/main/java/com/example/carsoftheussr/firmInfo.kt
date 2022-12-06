package com.example.carsoftheussr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class firmInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firm_info)
        zavod = intent.getStringExtra("zavod").toString()
        var history = findViewById<TextView>(R.id.historyFirm)
        var picture = findViewById<ImageView>(R.id.firmImage)
        picture.setImageResource(intent.getIntExtra("foto", R.drawable.whitefon))
        history.text = resources.getString(resources.getIdentifier("${zavod}Info", "string", packageName))
        setTitle(resources.getString(resources.getIdentifier("${zavod}Name", "string", packageName)))
        val spinner = findViewById<Spinner>(R.id.modelrid)
        var information: Array<out String> = resources.getStringArray(resources.getIdentifier("${zavod}Model","array", packageName))
        var spinnerArrayAdapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, information)
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = spinnerArrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener
        {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long)
            {
                var model = parent?.getItemAtPosition(position).toString()
                model = model.replace("-", "")
                if (model == "Модельный ряд" || model == "Информация по моделям временно отсутствует") return
                val intent: Intent = Intent(this@firmInfo, com.example.carsoftheussr.model::class.java)
                intent.putExtra("model", model)
                startActivity(intent)
                spinner.setSelection(0)
            }

            override fun onNothingSelected(parent: AdapterView<*>?)
            {

            }
        }
    }
    lateinit var zavod: String
}