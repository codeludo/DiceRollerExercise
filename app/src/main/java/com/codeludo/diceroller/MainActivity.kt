package com.codeludo.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var resultText: TextView
    private lateinit var rollButton: Button
    private lateinit var countUpButton: Button
    private lateinit var resetButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultText = findViewById(R.id.result_text)
        rollButton = findViewById(R.id.roll_button)
        countUpButton = findViewById(R.id.countUp_button)
        resetButton = findViewById(R.id.reset_button)

        rollButton.setOnClickListener {
            rollDice()
        }

        countUpButton.setOnClickListener {
            countUp()
        }

        resetButton.setOnClickListener {
            reset()
        }
    }

    private fun reset() {
        resultText.text = 0.toString()
    }

    private fun rollDice(){
        // Toast.makeText(this, "button clicked...", Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }

    private fun countUp(){
        val currentVal = resultText.text.toString()

        if(currentVal == "Hello World!"){
            resultText.text = "1"
        }else if(currentVal.toInt() < 6){
            resultText.text = currentVal.toInt().inc().toString()
        }
    }
}