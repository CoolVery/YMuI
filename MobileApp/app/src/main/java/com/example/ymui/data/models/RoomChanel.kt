package com.example.ymui.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class RoomChanel (
    @SerialName("id")
    val id: String,
    @SerialName("password")
    val password: String?
)