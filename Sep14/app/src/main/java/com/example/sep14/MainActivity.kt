package com.example.sep14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var a = "A"
    var b = "B"
    var c = "C"
    var num = 0
    var stack = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        buttonAdd.setOnClickListener {
            if (stack == ""){
                Toast.makeText(applicationContext, "Addition", Toast.LENGTH_LONG).show()
            }


    val buttona = findViewById<Button>(R.id.button)
    buttona.setOnClickListener{
        stack += a
        Toast.makeText(applicationContext, stack, Toast.LENGTH_LONG).show()
    }
        val buttonb = findViewById<Button>(R.id.button2)
        buttonb.setOnClickListener{
            stack += b
            Toast.makeText(applicationContext, stack, Toast.LENGTH_LONG).show()
        }

        val buttonc = findViewById<Button>(R.id.button3)
        buttonc.setOnClickListener{
            stack += c
            Toast.makeText(applicationContext, stack, Toast.LENGTH_LONG).show()
        }

        val button1 = findViewById<Button>(R.id.button4)
        button1.setOnClickListener{
            num = num + 1
            Toast.makeText(applicationContext, num.toString(), Toast.LENGTH_LONG).show()
        }

        val button2 = findViewById<Button>(R.id.button6)
        button2.setOnClickListener{
            num = num + 2
            Toast.makeText(applicationContext, num.toString(), Toast.LENGTH_LONG).show()
        }

        val button3 = findViewById<Button>(R.id.button5)
        button3.setOnClickListener{
            num = num + 3
            Toast.makeText(applicationContext, num.toString(), Toast.LENGTH_LONG).show()
        }
    }
        val buttonSub = findViewById<Button>(R.id.buttonSub)
        buttonSub.setOnClickListener {
            if (stack == ""){
                Toast.makeText(applicationContext, "Subtraction", Toast.LENGTH_LONG).show()
            }

            val buttona = findViewById<Button>(R.id.button)
            buttona.setOnClickListener {
                stack = stack.dropLast(1)
                Toast.makeText(applicationContext, stack, Toast.LENGTH_LONG).show()
            }

            val buttonb = findViewById<Button>(R.id.button2)
            buttonb.setOnClickListener{
                stack = stack.dropLast(1)
                Toast.makeText(applicationContext, stack, Toast.LENGTH_LONG).show()
            }
            val buttonc = findViewById<Button>(R.id.button3)
            buttonc.setOnClickListener{
                stack = stack.dropLast(1)
                Toast.makeText(applicationContext, stack, Toast.LENGTH_LONG).show()
            }

            val button1 = findViewById<Button>(R.id.button4)
            button1.setOnClickListener {
                var checker = num - 1
                if (checker<0){
                    num = 0
                    Toast.makeText(applicationContext, "Sum must not be less than 0", Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }
                num = checker
                Toast.makeText(applicationContext, num.toString(), Toast.LENGTH_LONG).show()
            }

            val button2 = findViewById<Button>(R.id.button6)
            button2.setOnClickListener {
                var checker = num - 2
                if (checker<0){
                    num = 0
                    Toast.makeText(applicationContext, "Sum must not be less than 0", Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }
                num = checker
                Toast.makeText(applicationContext, num.toString(), Toast.LENGTH_LONG).show()
            }

            val button3 = findViewById<Button>(R.id.button5)
            button3.setOnClickListener {
                var checker = num - 3
                if (checker<0){
                    num = 0
                    Toast.makeText(applicationContext, "Sum must not be less than 0", Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }
                num = checker
                Toast.makeText(applicationContext, num.toString(), Toast.LENGTH_LONG).show()
            }
        }


    }
}