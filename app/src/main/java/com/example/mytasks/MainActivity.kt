package com.example.mytasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytasks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        abrirListaTarefas()
    }

    private fun abrirListaTarefas(){
        val fragmentListarTarefas = ListarTarefasFragment.newInstance({
            abrirCriarTarefa()
        },"")

        supportFragmentManager.beginTransaction().replace(
            binding.frameLayout.id,
            fragmentListarTarefas
        ).commit()
    }

    private fun abrirCriarTarefa(){
        val fragmentCriarTarefa = CriarTarefaFragment.newInstance("","")

        supportFragmentManager.beginTransaction().replace(
            binding.frameLayout.id,
            fragmentCriarTarefa
        ).commit()
    }
}