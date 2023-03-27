package com.example.lostdogapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ContactDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)
        val contact = findViewById<Button>(R.id.button2)
        val email = findViewById<Button>(R.id.button3)
        contact.setOnClickListener {
            val phoneUri = Uri.parse("tel:0773239412")
            val i = Intent(Intent.ACTION_DIAL, phoneUri)
            startActivity(i)
        }
        email.setOnClickListener {
            val i = Intent(Intent.ACTION_SEND)
            i.setType("text/plain")
            i.putExtra(Intent.EXTRA_EMAIL, arrayOf("recipient@my.westminster.ac.uk"))
            i.putExtra(Intent.EXTRA_TEXT, "Hello, I think I found your dog")
            i.putExtra(Intent.EXTRA_SUBJECT, "Your lost dog")
            startActivity(i)
        }
    }
}