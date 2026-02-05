package com.example.fernandez_felipe_javier

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fernandez_felipe_javier.databinding.ActivitySobreNosotrosBinding

class SobreNosotrosActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySobreNosotrosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySobreNosotrosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
