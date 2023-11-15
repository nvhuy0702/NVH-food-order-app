package com.example.foodorderingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.example.foodorderingapp.databinding.ActivitySelectLocationBinding

class SelectLocationActivity : AppCompatActivity() {
    private val binding: ActivitySelectLocationBinding by lazy {
        ActivitySelectLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val locations:Array<String> = arrayOf("Ho Chi Minh", "Ha Noi", "Da Nang", "Dong Thap")
        val adapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1,locations)
        val autoCompleteTextView: AutoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)
    }
}