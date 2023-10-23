package com.example.azeriqazib

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.last_application.R
import com.example.last_application.databinding.Fragment1Binding


class Fragment1 : Fragment() {
    private lateinit var binding: Fragment1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = Fragment1Binding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.xidmetler.setOnClickListener {
            binding.xidmetler.text = "done"
        }


    }
}