package com.example.exapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class SlideFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val PereHod = view?.findViewById<Button>(R.id.perehod)

        PereHod?.setOnClickListener{
            val intent = Intent(this, Window::class.java)
            startActivity(intent)
        }
//        return inflater.inflate(R.layout.fragment_slide, container, false)
        return view
    }

    private fun Intent(slideFragment: SlideFragment, java: Class<Window>): Intent {
        return TODO("Provide the return value")
    }
}