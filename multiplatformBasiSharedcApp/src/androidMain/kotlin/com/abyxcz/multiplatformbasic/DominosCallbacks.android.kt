import com.abyxcz.multiplatformbasic.data.DominoTile

actual interface DominosCallbacks {
    actual fun onTileClick(tile: DominoTile)
}