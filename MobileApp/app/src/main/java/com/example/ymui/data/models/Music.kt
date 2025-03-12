package com.example.ymui.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class Music (
    @SerialName("id")
    val id: String,
    @SerialName("name")
    val name: String,
    @SerialName("image")
    val image: String
)