package com.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var operand1 : TextView
    lateinit var operand2 : TextView
    lateinit var anwserET : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operand1 = findViewById<TextView>(R.id.operant1)
        operand2 = findViewById<TextView>(R.id.operant2)
        anwserET = findViewById<EditText>(R.id.anwserET)
        var doneBTN = findViewById<Button>(R.id.Done_BTN)
        doneBTN.setOnClickListener {
            checkAnws()
        }
        newRound()


    }
    fun checkAnws() {
        val anws = anwserET.text.toString().toInt()
        val num1 = operand1.text.toString().toInt()
        val num2 = operand2.text.toString().toInt()
        if (anws == num1 * num2) {
            Toast.makeText(this@MainActivity, "The anwser is goooood!", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this@MainActivity, "Not so good, it would have been ${num1*num2}", Toast.LENGTH_SHORT).show()
        }
        newRound()
    }

    fun newRound() {
        
        val rand1 = (0..99).random()
        val rand2 = (0..99).random()
        operand1.text = rand1.toString()
        operand2.text = rand2.toString()




    }
}

