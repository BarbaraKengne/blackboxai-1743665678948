package com.example.bookexchange.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bookexchange.models.Book
import com.example.bookexchange.ui.components.BookItem
import com.example.bookexchange.ui.theme.BookExchangeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val books = listOf(
        Book(
            id = "1",
            title = "Clean Code",
            author = "Robert C. Martin",
            coverUrl = "",
            condition = "Like New",
            owner = "John Doe",
            location = "Paris"
        ),
        Book(
            id = "2",
            title = "Design Patterns",
            author = "Erich Gamma",
            coverUrl = "",
            condition = "Good",
            owner = "Jane Smith",
            location = "Lyon"
        )
    )

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Book Exchange") },
                actions = {
                    IconButton(onClick = { /* TODO */ }) {
                        Icon(Icons.Default.Search, contentDescription = "Search")
                    }
                }
            )
        }
    ) { padding ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.padding(padding),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(books) { book ->
                BookItem(book = book)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    BookExchangeTheme {
        HomeScreen()
    }
}