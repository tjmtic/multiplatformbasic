package com.abyxcz.multiplatformbasic.android.example

import DominosCallbacks
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
fun PlayerHand(
    modifier: Modifier = Modifier,
    hand: List<DominoTile>,
    callbacks: DominosCallbacks
) {
    LazyRow(modifier = modifier) {
        items(hand) { tile ->
            Card(
                modifier = Modifier
                    .padding(4.dp)
                    .clickable { callbacks.onTileClick(tile) }
                    .background(Color.LightGray),
            ) {
                Text(text = "${tile.left}|${tile.right}")
            }
        }
    }
}