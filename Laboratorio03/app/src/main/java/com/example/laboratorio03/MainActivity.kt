package com.example.laboratorio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var fiveCentsImagenView: ImageView
    private lateinit var dollarImagenView: ImageView
    private lateinit var quarterImagenView: ImageView
    private lateinit var tenCentsImagenView: ImageView
    private lateinit var calculateTextView: TextView

    private var cashCalculate = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fiveCentsImagenView = findViewById(R.id.five_cents_image_view)
        dollarImagenView = findViewById(R.id.one_dollar_image_view)
        quarterImagenView = findViewById(R.id.quarter_image_view)
        tenCentsImagenView = findViewById(R.id.ten_cents_imagen_view)
        quarterImagenView = findViewById(R.id.quarter_image_view)
        calculateTextView = findViewById(R.id.calculate_text_view)

        dollarImagenView.setOnClickListener{
            cashCalculate += 1.0
                    cashCalculate = String.format("%.2f", cashCalculate).toDouble()
                calculateTextView.text = "${cashCalculate}"

        }
        tenCentsImagenView.setOnClickListener{
            cashCalculate += 0.10
            cashCalculate = String.format("%.2f", cashCalculate).toDouble()
            calculateTextView.text = "${cashCalculate}"

        }
        fiveCentsImagenView.setOnClickListener{
            cashCalculate += 0.05
            cashCalculate = String.format("%.2f", cashCalculate).toDouble()
            calculateTextView.text = "${cashCalculate}"

        }
        quarterImagenView.setOnClickListener{
            cashCalculate += 0.25
            cashCalculate = String.format("%.2f", cashCalculate).toDouble()
            calculateTextView.text = "${cashCalculate}"

        }
    }
}


