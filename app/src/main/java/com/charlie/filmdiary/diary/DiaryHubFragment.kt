package com.charlie.filmdiary.diary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import butterknife.BindView
import butterknife.ButterKnife
import com.charlie.filmdiary.R
import com.charlie.filmdiary.api.TheMovieDatabaseAPIService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class DiaryHubFragment : Fragment() {

    @BindView(R.id.filmTextView)
    lateinit var textview: AppCompatTextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_diary_hub, container, false)
        ButterKnife.bind(this, view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val apiService = TheMovieDatabaseAPIService()
        GlobalScope.launch(Dispatchers.Main) {
            val movieResponse = apiService.getMovieAsync().await()
            textview.text = movieResponse.title
        }

    }
}