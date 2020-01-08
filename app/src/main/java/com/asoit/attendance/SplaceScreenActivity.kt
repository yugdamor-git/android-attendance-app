package com.asoit.attendance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception

class SplaceScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splace_screen)

        val background = object :Thread()
        {
            override fun run() {
                try {

                    Thread.sleep(400)

                    val intent = Intent(baseContext,MainActivity::class.java)
                    startActivity(intent)
                }
                catch (e:Exception)
                {

                }
            }
        }

        background.start()
    }
}
