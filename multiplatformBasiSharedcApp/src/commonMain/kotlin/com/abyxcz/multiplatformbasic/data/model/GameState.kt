package com.abyxcz.multiplatformbasic.data.model

import kotlinx.serialization.Serializable

@Serializable
data class GameState(
    val level: Int,
    val score: Int
)