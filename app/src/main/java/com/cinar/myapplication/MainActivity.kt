package com.cinar.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cinar.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var number1 : Double? = null
    var number2 : Double? = null
    var result : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun topla(view: View) {
        number1 = binding.numberText.text.toString().toDoubleOrNull()
        number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 == null || number2 == null ) {

            binding.textView.text = "Error!"

        } else {
            result = number1!! + number2!!
            binding.textView.text = "Result: $result"
        }
    }

    fun cikar( view: View){
        number1 = binding.numberText.text.toString().toDoubleOrNull()
        number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 == null || number2 == null){
            binding.textView.text = "Error !"
        }
        else {
            result = number1!! - number2!!
            binding.textView.text = "Result ${result}"
        }
    }
    fun carp( view: View){
        number1 = binding.numberText.text.toString().toDoubleOrNull()
        number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 == null || number2 == null){
            binding.textView.text = "Error !"
        }
        else {
            result = number1!! * number2!!
            binding.textView.text = "Result ${result}"
        }
    }
    fun bol( view: View){
        number1 = binding.numberText.text.toString().toDoubleOrNull()
        number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 == null || number2 == null){
            binding.textView.text = "Error !"
        }
        else {
            result = number1!! / number2!!
            binding.textView.text = "Result ${result}"
        }
    }
}