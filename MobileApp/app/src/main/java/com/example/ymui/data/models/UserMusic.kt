package com.example.ymui.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class UserMusic (
    @SerialName("id")
    val id: String,
    @SerialName("id_user")
    val idUser: User,
    @SerialName("id_music")
    val idMusic: Music,
)