package com.example.layam12.model

import android.os.Parcel
import android.os.Parcelable

data class Mad(
    val name: String? = null,
    val adress: String? = null

):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(adress)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Mad> {
        override fun createFromParcel(parcel: Parcel): Mad {
            return Mad(parcel)
        }

        override fun newArray(size: Int): Array<Mad?> {
            return arrayOfNulls(size)
        }
    }
}