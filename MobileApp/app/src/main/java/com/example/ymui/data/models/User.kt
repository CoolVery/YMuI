package com.example.ymui.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class User (
    @SerialName("id")
    val id: String,
    @SerialName("name")
    val name: String,
)
