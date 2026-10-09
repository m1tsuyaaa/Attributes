package com.example.attributes

import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)

        // Цвет текста
        findViewById<Button>(R.id.btnBlack).setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }
        findViewById<Button>(R.id.btnRed).setOnClickListener {
            editText.setTextColor(Color.RED)
        }

        // Размер текста
        findViewById<Button>(R.id.btn8sp).setOnClickListener {
            editText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8f)
        }
        findViewById<Button>(R.id.btn24sp).setOnClickListener {
            editText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)
        }

        // Фон
        findViewById<Button>(R.id.btnWhite).setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }
        findViewById<Button>(R.id.btnYellow).setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW)
        }
    }
}