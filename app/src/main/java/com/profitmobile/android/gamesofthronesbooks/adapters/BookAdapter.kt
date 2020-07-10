package com.profitmobile.android.gamesofthronesbooks.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.profitmobile.android.gamesofthronesbooks.R
import com.profitmobile.android.gamesofthronesbooks.database.Book
import kotlinx.android.synthetic.main.adapter_book_row.view.*

class BookAdapter(private val bookClickListener: BookClickListener) : ListAdapter<Book, BookViewHolder>(
    getDiffUtil()
) {

  companion object {
    fun getDiffUtil(): DiffUtil.ItemCallback<Book> {
      return object : DiffUtil.ItemCallback<Book>() {
        override fun areItemsTheSame(oldItem: Book, newItem: Book): Boolean {
          return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: Book, newItem: Book): Boolean {
          return oldItem == newItem
        }
      }
    }
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_book_row, parent, false)
    return BookViewHolder(
        view
    )
  }

  override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
    val book = getItem(position)
    holder.itemView.title.text = book.title
    holder.itemView.author.text = book.authorName
    holder.itemView.subject.text = book.subject
    holder.itemView.publisher.text = book.publisher
    holder.itemView.favorite.setOnClickListener { bookClickListener.favoriteClicked(book) }
    holder.itemView.already_read.setOnClickListener { bookClickListener.alreadyReadClicked(book) }

    val starResource = if (book.isFavorited) R.drawable.ic_star_black_24dp else R.drawable.ic_star_border_black_24dp
    holder.itemView.favorite.setImageResource(starResource)

    val readResource = if (book.isAlreadyRead) R.drawable.ic_markunread_black_24dp else R.drawable.ic_mail_outline_black_24dp
    holder.itemView.already_read.setImageResource(readResource)
  }

  interface BookClickListener {
    fun favoriteClicked(book: Book)
    fun alreadyReadClicked(book: Book)
  }
}