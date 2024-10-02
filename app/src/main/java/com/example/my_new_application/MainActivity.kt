package com.example.my_new_application

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var stringAction = ""
        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val button0: Button = findViewById(R.id.button0)

        val buttonPlus: Button = findViewById(R.id.buttonplus)
        val buttonMinus: Button = findViewById(R.id.buttonminus)
        val buttonClear: Button = findViewById(R.id.buttonclear)
        val buttonMultiply: Button = findViewById(R.id.buttonmultiplication)
        val buttonDivision: Button = findViewById(R.id.buttondivision)
        val buttonDot : Button = findViewById(R.id.buttondot)

        var checkOptions= true
        var num1 = ""
        var num2 = ""
        var result = ""


        buttonMinus.setOnClickListener {
            textView.text = textView.text.toString() + "-"
            stringAction = "-"
            checkOptions = false
        }
        buttonPlus.setOnClickListener {
            textView.text = textView.text.toString() + "+"

            stringAction = "+"
            checkOptions = false
        }
        buttonDivision.setOnClickListener {
            textView.text = textView.text.toString() + "/"

            stringAction = "/"
            checkOptions = false
        }
        buttonMultiply.setOnClickListener {
            textView.text = textView.text.toString() + "*"

            stringAction = "*"
            checkOptions = false
        }
        buttonDot.setOnClickListener{
            textView.text = textView.text.toString() + "."

            if (checkOptions) num1 += "."
            else num2 += "."
        }
        button1.setOnClickListener {
            textView.text = textView.text.toString() + "1"

            if (checkOptions) num1 += "1"
            else num2 += "1"
        }
        button2.setOnClickListener {
            textView.text = textView.text.toString() + "2"

            if (checkOptions) num1 += "2"
            else num2 += "2"
        }
        button3.setOnClickListener {
            textView.text = textView.text.toString() + "3"

            if (checkOptions) num1 += "3"
            else num2 += "3"
        }
        button4.setOnClickListener {
            textView.text = textView.text.toString() + "4"

            if (checkOptions) num1 += "4"
            else num2 += "4" }
        button5.setOnClickListener {
            textView.text = textView.text.toString() + "5"
            if (checkOptions) num1 += "5"
            else num2 += "5" }
        button6.setOnClickListener {
            textView.text = textView.text.toString() + "6"
            if (checkOptions) num1 += "6"
            else num2 += "6" }
        button7.setOnClickListener {
            textView.text = textView.text.toString() + "7"

            if (checkOptions) num1 += "7"
            else num2 += "7" }
        button8.setOnClickListener {
            textView.text = textView.text.toString() + "8"

            if (checkOptions) num1 += "8"
            else num2 += "8" }
        button9.setOnClickListener {
            textView.text = textView.text.toString() + "9"

            if (checkOptions) num1 += "9"
            else num2 += "9" }
        button0.setOnClickListener {
            textView.text = textView.text.toString() + "0"

            if (checkOptions) num1 += "0"
            else num2 += "0" }

        button.setOnClickListener {

            result += Function(num1, num2, stringAction)
            textView.text = textView.text.toString() + result
            result =""
        }
        buttonClear.setOnClickListener {
            try {
                num1 = ""
                num2 = ""
                stringAction = ""
                textView.text = ""
                checkOptions = true
            } catch (e: Exception) {
                Toast.makeText(this, "Dont touch this", Toast.LENGTH_SHORT).show()
            }

        }
    }
    private fun Function(Num1: String, Num2: String, FunctionAll: String): String {
        val result: Double
        val char1  ="="
        val ErrorBad = "You didnt choose action "
        val Num1ToInt = Num1.toDouble()
        val Num2ToInt = Num2.toDouble()

        try {
            result = when (FunctionAll) {
                "*" -> (Num1ToInt * Num2ToInt)
                "/" -> (Num1ToInt / Num2ToInt)
                "+" -> (Num1ToInt + Num2ToInt)
                "-" -> (Num1ToInt - Num2ToInt)
                else -> {
                    return ErrorBad
                }
            }
        } catch (e: Exception) {
            return "Error dont touch this "
        }

        return char1 +result.toString()


    }


}


