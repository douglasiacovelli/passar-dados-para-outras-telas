package com.iacovelli.passing_data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val name: String,
    val age: Int,
    val favoriteColor: String
): Parcelable