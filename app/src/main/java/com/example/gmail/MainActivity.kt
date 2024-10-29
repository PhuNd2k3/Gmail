package com.example.gmail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Tạo danh sách email mẫu
    val emails = listOf(
        Email("Edurila.com", "Subject Line 1", "This is a snippet of email content...", "12:34 PM", true),
        Email("Chris Abad", "Subject Line 2", "This is another email snippet...", "11:22 AM", false),
        Email("Tuto.com", "Subject Line 3", "Here is more email content...", "10:04 AM", true),
        Email("Support", "Subject Line 4", "Support email snippet here...", "9:45 AM", false),
        Email("Matt from Ionic", "Subject Line 5", "Snippet of last email...", "8:15 AM", true)
    )

        val adapter = EmailAdapter(emails)
        recyclerView.adapter = adapter
    }
}
