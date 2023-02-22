package com.example.chatme

import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.getValue

class ReadData: ValueEventListener {
    override fun onDataChange(snapshot: DataSnapshot) {
        val value = snapshot.getValue<String>()
        Log.d("KotlinActivity", "Value is: $value")
    }

    override fun onCancelled(error: DatabaseError) {
        Log.w("KotlinActivity", "Failed to read value.", error.toException())
    }
}