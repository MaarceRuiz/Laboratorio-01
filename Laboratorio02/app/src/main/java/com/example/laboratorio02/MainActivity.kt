package com.example.laboratorio02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var actionSentButton: Button
    private lateinit var rangeTextView: TextView
    private lateinit var classWeightTextView: TextView
    private lateinit var numberTextView: TextView
    private lateinit var heightEditText: EditText
    private lateinit var weightEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()

    }

    private fun initComponents() {
        actionSentButton = findViewById(R.id.action_sent_button)
        heightEditText = findViewById(R.id.height_edit_text)
        weightEditText = findViewById(R.id.weight_edit_text)
        rangeTextView = findViewById(R.id.range_text_view)
        classWeightTextView = findViewById(R.id.classWeight_text_view)
        numberTextView = findViewById(R.id.number_text_view)
    }

}