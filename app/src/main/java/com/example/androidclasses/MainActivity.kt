package com.example.androidclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidclasses.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSubmit.setOnClickListener{
            var euro = 5.5
            var inuptValue = binding.inputTextIn.text.toString().replace(",",".").toDouble()
            var result = String.format("%.2f", euro * inuptValue).toDouble()
            var result2 = (euro * inuptValue * 100).roundToInt().toDouble() / 100
            binding.textViewOutput.setText("R$: ${result}\nR$: ${result2}");
        }

    }
}