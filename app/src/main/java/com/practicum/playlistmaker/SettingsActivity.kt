package com.practicum.playlistmaker

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val backArrow = findViewById<TextView>(R.id.back_arrow_view)

        backArrow.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

    }
}