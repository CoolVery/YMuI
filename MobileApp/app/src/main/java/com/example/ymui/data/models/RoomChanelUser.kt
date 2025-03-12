package com.example.ymui.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class RoomChanelUser (
    @SerialName("id")
    val id: String,
    @SerialName("id_user")
    val idUser: User,
    @SerialName("id_room_chanel")
    val idRoomChanel: RoomChanel,
)