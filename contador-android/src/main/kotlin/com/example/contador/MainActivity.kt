package com.example.contador

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.contador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAumentar.setOnClickListener {
            contador++
            atualizarTela()
        }

        binding.btnDiminuir.setOnClickListener {
            if (contador > 0) {
                contador--
                atualizarTela()
            }
        }

        binding.btnResetar.setOnClickListener {
            contador = 0
            atualizarTela()
        }
    }

    private fun atualizarTela() {
        binding.tvContador.text = contador.toString()
    }
}
