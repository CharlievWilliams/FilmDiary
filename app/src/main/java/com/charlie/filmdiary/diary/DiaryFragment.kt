package com.charlie.filmdiary.diary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.charlie.filmdiary.api.MovieApiService
import com.charlie.filmdiary.api.MovieRepo
import com.charlie.filmdiary.databinding.FragmentDiaryBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class DiaryFragment : Fragment() {

    private var _binding: FragmentDiaryBinding? = null

    private val binding get() = _binding!!

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
//        getMovie()
    }

    private val parentJob = Job()
    private val coroutineContext: CoroutineContext get() = parentJob + Dispatchers.Default
    private val scope = CoroutineScope(coroutineContext)
    private val movieRepository: MovieRepo = MovieRepo(MovieApiService.movieApi)

    private fun getMovie() {
        scope.launch {
            val movieTitle = movieRepository.getMovie()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}