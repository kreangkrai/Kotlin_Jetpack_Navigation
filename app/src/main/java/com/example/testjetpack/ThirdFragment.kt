package com.example.testjetpack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast


class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        retrieveArguments()
    }

    private fun retrieveArguments() {
        arguments?.let { arguments ->
            val args = ThirdFragmentArgs.fromBundle(arguments)
            val message = args.message
            val value = args.value

            Toast.makeText(activity, "$message, $value", Toast.LENGTH_SHORT).show()
        }
    }

}