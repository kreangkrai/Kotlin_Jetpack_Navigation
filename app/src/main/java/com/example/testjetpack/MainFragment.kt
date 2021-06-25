package com.example.testjetpack

import android.os.Bundle
import android.renderscript.Sampler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener { buttonView ->
            navigateByDirection(buttonView)
        }
        button1.setOnClickListener { buttonView ->
            navigateByActionId(buttonView);
        }
        button2.setOnClickListener { buttonView ->
            navigateByDirectionForThrid(buttonView)
        }
    }

    private fun navigateByActionId(view: View) {
        view.findNavController().navigate(R.id.action_mainFragment_to_secondFragment2)
    }


    private fun navigateByDirection(view: View) {
        val arrInt:IntArray = intArrayOf(1,2,3)
        val direction = MainFragmentDirections.actionMainFragmentToFirstFragment(
            message = "Main Fragment",
            number = arrInt
        )
        view.findNavController().navigate(direction)
    }

    private fun navigateByDirectionForThrid(view: View) {
        val direction = MainFragmentDirections.actionMainFragmentToThirdFragment(
            message = "Main Fragment",
            value = 9
        )
        view.findNavController().navigate(direction)
    }
}




