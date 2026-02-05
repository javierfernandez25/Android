package com.example.fernandez_felipe_javier

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fernandez_felipe_javier.databinding.ActivityContactoBinding

class ContactoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContactoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSend.setOnClickListener {
            val name = binding.etName.text.toString()
            val email = binding.etEmail.text.toString()
            val message = binding.etMessage.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("NAME", name)
            resultIntent.putExtra("EMAIL", email)
            resultIntent.putExtra("MESSAGE", message)

            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }
}
