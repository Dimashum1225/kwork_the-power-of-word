package com.example.kwork_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textQuotes: TextView
    private lateinit var changeButton: Button
    private lateinit var exitButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        changeButton = findViewById(R.id.button)
        textQuotes = findViewById(R.id.qoutestext)
        exitButton = findViewById(R.id.exitbutton)

        val inputStream = resources.openRawResource(R.raw.quotes)
        val quotes = inputStream.bufferedReader().use{it.readLines()}
        var randomQoute = quotes.random()
        textQuotes.text = randomQoute

        changeButton.setOnClickListener{
            randomQoute = quotes.random()
            textQuotes.text = randomQoute
        }
        exitButton.setOnClickListener{finish()}

    }
}