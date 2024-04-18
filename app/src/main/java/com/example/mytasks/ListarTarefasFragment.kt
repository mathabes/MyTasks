package com.example.mytasks

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytasks.databinding.ActivityMainBinding
import com.example.mytasks.databinding.FragmentListarTarefasBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListarTarefasFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListarTarefasFragment : Fragment() {

    private lateinit var binding: FragmentListarTarefasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListarTarefasBinding.inflate(inflater)

        binding.botaoNovaTarefa.setOnClickListener{
            criarTarefa.invoke()
        }
        return binding.root
    }

    companion object {
        private var criarTarefa: () -> Unit = {}

        @JvmStatic
        fun newInstance(criarTarefa: () -> Unit = {}, param2: String) =
            ListarTarefasFragment().apply {
                this@Companion.criarTarefa = criarTarefa
            }
    }
}