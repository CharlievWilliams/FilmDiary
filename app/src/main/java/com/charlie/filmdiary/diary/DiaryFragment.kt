package com.charlie.filmdiary.diary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.charlie.filmdiary.databinding.FragmentDiaryBinding
import com.charlie.filmdiary.diary.DiaryViewEvent.ScreenLoadEvent
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DiaryFragment @Inject constructor(
    private val viewModelFactory: ViewModelProvider.Factory
) : Fragment() {

    private var _binding: FragmentDiaryBinding? = null

    private val binding get() = _binding!!

    private val viewModel by activityViewModels<DiaryViewModel> { viewModelFactory }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDiaryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewState()
        setupViewEvents()
    }

    private fun setupViewState() {
        viewModel.viewState().observe(viewLifecycleOwner, Observer {

        })
    }

    private fun setupViewEvents() {
        viewModel.onEvent(ScreenLoadEvent)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}