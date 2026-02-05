package com.example.fernandez_felipe_javier

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.fernandez_felipe_javier.databinding.ActivityInicioBinding

class InicioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInicioBinding

    private val contactLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data = result.data
            val name = data?.getStringExtra("NAME")
            val email = data?.getStringExtra("EMAIL")
            val message = data?.getStringExtra("MESSAGE")

            binding.tvContactInfo.text = "Datos recibidos:\nNombre: $name\nEmail: $email\nMensaje: $message"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("USERNAME") ?: "Usuario"
        binding.tvWelcome.text = "Bienvenido, $username"

        binding.btnContacto.setOnClickListener {
            val intent = Intent(this, ContactoActivity::class.java)
            contactLauncher.launch(intent)
        }

        binding.btnSobreNosotros.setOnClickListener {
            val intent = Intent(this, SobreNosotrosActivity::class.java)
            startActivity(intent)
        }

        binding.btnLocalizacion.setOnClickListener {
            val intent = Intent(this, LocalizacionActivity::class.java)
            startActivity(intent)
        }
    }
}
