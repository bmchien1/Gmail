package com.example.gmail

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gmail.adapters.EmailAdapter
import com.example.gmail.models.Email
import java.util.ArrayList;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Dữ liệu giả cho danh sách email
        val emailList = listOf(
            Email("Edurila.com", "Special Offer", "$19 Only (First 10 spots) - Bestselling...", "12:34 PM", R.drawable.ic_email1),
            Email("Chris Abad", "Feedback Needed", "Help make Campaign Monitor better...", "11:22 AM", R.drawable.ic_email1),
            Email("Tuto.com", "Free Courses", "8h de formation gratuite et les nouvea...", "11:04 AM", R.drawable.ic_email1),
            Email("support", "Service Update", "Société Ovh : suivi de vos services...", "10:26 AM", R.drawable.ic_email1),
            Email("Matt from Ionic", "New Release", "The New Ionic Creator Is Here!", "9:52 AM", R.drawable.ic_email1),
            Email("Chien", "New Release", "The New Ionic Creator Is Here!", "9:52 AM", R.drawable.ic_email1),
            Email("Hoang", "New Release", "The New Ionic Creator Is Here!", "9:52 AM", R.drawable.ic_email1),
            Email("Hello", "New Release", "The New Ionic Creator Is Here!", "9:52 AM", R.drawable.ic_email1),
            Email("Dear", "New Release", "The New Ionic Creator Is Here!", "9:52 AM", R.drawable.ic_email1),
            Email("Facebook.com", "New Release", "The New Ionic Creator Is Here!", "9:52 AM", R.drawable.ic_email1),
            Email("Youtube", "New Release", "The New Ionic Creator Is Here!", "9:52 AM", R.drawable.ic_email1),
            Email("Spotify", "New Release", "The New Ionic Creator Is Here!", "9:52 AM", R.drawable.ic_email1),
        )

        recyclerView.adapter = EmailAdapter(emailList)
    }
}