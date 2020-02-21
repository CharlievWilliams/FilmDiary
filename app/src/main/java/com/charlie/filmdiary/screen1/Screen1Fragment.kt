package com.charlie.filmdiary.screen1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import butterknife.BindView
import butterknife.ButterKnife
import com.charlie.filmdiary.R

class Screen1Fragment : Fragment() {

    @BindView(R.id.button)
    lateinit var button: AppCompatButton

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_screen1, container, false)
        ButterKnife.bind(this, view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener {
            view.findNavController().navigate(R.id.action_screen1Fragment_to_screen2Fragment)
        }
    }
}
