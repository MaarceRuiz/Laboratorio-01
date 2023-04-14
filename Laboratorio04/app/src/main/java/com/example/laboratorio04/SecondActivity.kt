package com.example.laboratorio04


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {


    private lateinit var shareInformationButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        val  emailTextView = findViewById<TextView>(R.id.emailTextView)
        val numberTextView = findViewById<TextView>(R.id.numberTextView)
        shareInformationButton = findViewById(R.id.ShareInformation)


        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val number = intent.getStringExtra("number")

        nameTextView.text = name
        emailTextView.text = email
        numberTextView.text = number

        shareInformationButton.setOnClickListener{

            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT,"Name: $name\nEmail: $email\nCellphone: $number\n")
            startActivity(Intent.createChooser(shareIntent, "Share to:"))
        }
    }


    override fun onResume() {
        super.onResume()



    }
}