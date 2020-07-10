package com.profitmobile.android.gamesofthronesbooks.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.profitmobile.android.gamesofthronesbooks.*
import com.profitmobile.android.gamesofthronesbooks.adapters.BookAdapter
import com.profitmobile.android.gamesofthronesbooks.database.Book
import kotlinx.android.synthetic.main.fragment_discovery.*

class FavoritesFragment : Fragment(), BookAdapter.BookClickListener {
  private val adapter =
    BookAdapter(this)
  private lateinit var viewModel: MainViewModel

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.fragment_favorites, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    list.layoutManager = LinearLayoutManager(requireContext())
    list.adapter = adapter
    list.addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))

    viewModel = mainViewModel(view.context)

    viewModel.favoriteBooksLiveData.observe(viewLifecycleOwner, Observer {
      adapter.submitList(it)
    })
  }

  override fun favoriteClicked(book: Book) {
    viewModel.favoriteClicked(book)
  }

  override fun alreadyReadClicked(book: Book) {
    viewModel.readClicked(book)
  }
}