package com.example.clickcount

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import kotlinx.android.synthetic.main.activity_chat2.*
import kotlinx.android.synthetic.main.activity_chat_replay.*

class ChatReplay() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_replay)
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        Replaytext.text = message
    }


    fun sendMessagetoChat(view: View){
        val message = textReplayChat.text.toString()
        val intent = Intent(this, ChatActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ChatReplay> {
        override fun createFromParcel(parcel: Parcel): ChatReplay {
            return ChatReplay(parcel)
        }

        override fun newArray(size: Int): Array<ChatReplay?> {
            return arrayOfNulls(size)
        }
    }

}