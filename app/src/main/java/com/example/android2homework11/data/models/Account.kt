package com.example.android2homework11.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Account(
    val name: String,
    val password: Int,
    val email: String
) : Parcelable