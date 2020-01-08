package com.asoit.attendance

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplaceScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splace_screen)

        val background = object : Thread() {
            override fun run() {
                try {

                    Thread.sleep(400)

                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception) {

                }
            }
        }

        background.start()
    }
}
