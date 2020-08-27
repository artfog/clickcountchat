package com.example.clickcount

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import kotlinx.android.synthetic.main.activity_chat2.*
import kotlinx.android.synthetic.main.activity_chat_replay.*

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat2)
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        message?.let { textViewMR.text = "Replay Received" }
        textChatMessage.text = message
    }

    fun sendMessagetoRelay(view: View){
        val message = chatMainInput.text.toString()
        val intent = Intent(this, ChatReplay::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}