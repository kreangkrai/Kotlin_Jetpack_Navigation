package com.example.testjetpack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import java.lang.StringBuilder


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        retrieveArguments()
    }
    private fun retrieveArguments() {
        arguments?.let { arguments ->
            var str:String? = ""
            val args = FirstFragmentArgs.fromBundle(arguments)
            val message = args.message
            val number = args.number

            if (number != null) {
                for (i in number){
                    str +=  i.toString()
                }
            }
            Toast.makeText(activity, "$message, $str", Toast.LENGTH_SHORT).show()
        }
    }


}