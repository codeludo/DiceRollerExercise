package com.codeludo.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // best way
    private lateinit var diceImage: ImageView
    private lateinit var rollButton: Button
    private lateinit var countUpButton: Button
    private lateinit var resetButton: Button

    /*
    // complicate code because is necessary check nullity every time we use it
    private var diceImage: ImageView? = null
    private var rollButton: Button? = null
    private var countUpButton: Button? = null
    private var resetButton: Button? = null
    */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
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
        TODO()
    }

    private fun rollDice(){
        // Toast.makeText(this, "button clicked...", Toast.LENGTH_SHORT).show()
        val drawableResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

    }

    private fun countUp(){
        TODO()
        /*val currentVal = resultText.text.toString()

        if(currentVal == "Hello World!"){
            resultText.text = "1"
        }else if(currentVal.toInt() < 6){
            resultText.text = currentVal.toInt().inc().toString()
        }*/
    }
}