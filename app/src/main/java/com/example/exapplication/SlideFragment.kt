package com.example.exapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class SlideFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
           return inflater.inflate(R.layout.fragment_slide, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val PereHod = view.findViewById<Button>(R.id.perehod)
        val visibilityDate = view.findViewById<Button>(R.id.VisibilDate)

        PereHod?.setOnClickListener{

            val builder = AlertDialog.Builder(requireActivity())
            builder.setTitle("Переход в другое активити")
                .setMessage("Для перехода нажмите ОК")
                .setPositiveButton("OK") { _, _ ->
                    val intent = Intent(requireContext(), Window::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("Отмена", null)
                .create()

            val dialog = builder.create()
            dialog.show()
        }

        visibilityDate?.setOnClickListener {
            val builder = AlertDialog.Builder(requireActivity())
            builder.setTitle("Вы уверены что хотите перейти?")
                .setMessage("Для перехода нажмите ОК")
                .setPositiveButton("OK") { _, _ ->
                    val intent = Intent(requireContext(),DialogDate::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("Отмена",null)
                .create()

            val dialog = builder.create()
            dialog.show()
        }

    }
}

