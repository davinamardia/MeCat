package com.example.mecatfix.model

import android.provider.ContactsContract.CommonDataKinds.Photo

data class Cats(
    val id: Int,
    val jenis: String,
    val ciri_khas : String,
    val deskripsi: String,
    val photo: Int
)
