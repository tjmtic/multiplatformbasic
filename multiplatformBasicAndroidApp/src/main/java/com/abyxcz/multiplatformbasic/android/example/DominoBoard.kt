package com.abyxcz.multiplatformbasic.android.example

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.abyxcz.multiplatformbasic.data.DominoTile

@Composable
fun DominoBoard(
    modifier: Modifier = Modifier,
    board: List<DominoTile>
) {
    LazyRow(modifier = modifier) {
        items(board) { tile ->
            Card(
                modifier = Modifier.padding(4.dp).background(Color.LightGray),
                //containerColor = Color.LightGray
            ) {
                Text(text = "${tile.left}|${tile.right}")
            }
        }
    }
}