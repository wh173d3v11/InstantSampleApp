package com.fierydev.instantsampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var selectedCharacterTextView: TextView
    private lateinit var showChocolateButton: Button

    private val characterLessons = hashMapOf<String, String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectedCharacterTextView = findViewById(R.id.selectedCharacterTextView)
        showChocolateButton = findViewById(R.id.showChocolateButton)

        // Associate lessons with characters
        characterLessons["Willy Wonka"] = "Lesson: Embrace creativity and imagination!"
        characterLessons["Charlie Bucket"] = "Lesson: Be kind and grateful for what you have!"
        characterLessons["Grandpa Joe"] = "Lesson: Age is just a number; you can still have fun!"
        characterLessons["Veruca Salt"] = "Lesson: Greediness can lead to trouble!"
        characterLessons["Violet Beauregarde"] = "Lesson: Avoid being obsessed with yourself!"
        characterLessons["Augustus Gloop"] = "Lesson: Moderation is key in all things!"
        characterLessons["Mike Teavee"] = "Lesson: Don't get addicted to technology!"
        characterLessons["Oompa-Loompas"] = "Lesson: Teamwork and hard work pay off!"

        // Set click listener for the "Show Me Chocolate" button
        showChocolateButton.setOnClickListener {
            showRandomCharacterLesson()
        }
    }

    private fun showRandomCharacterLesson() {
        // Get a random character from the list
        val randomIndex = (0 until characterLessons.size).random()
        val selectedCharacter = characterLessons.keys.toList()[randomIndex]

        // Get the lesson associated with the selected character
        val lesson = characterLessons[selectedCharacter]

        // Show the selected character and lesson in the TextView
        val message = "Selected Character: $selectedCharacter\n$lesson"
        selectedCharacterTextView.text = message
    }
}