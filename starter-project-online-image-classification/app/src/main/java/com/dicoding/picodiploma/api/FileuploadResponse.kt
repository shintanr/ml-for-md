package com.dicoding.picodiploma.api

import com.google.gson.annotations.SerializedName

data class FileuploadResponse {
    @SerializedName("message")
    var message: String? = null
    @SerializedName("data")
    var data: Data = Data()
}

data class Data{
    @SerializedName("id")
    var id: String?  = null
    @SerializedName("result")
    var result: String?  = null
    @SerializedName("confidentScore")
    var confidentScore: Double? = null
    @SerializedName("isAboveTreshold")
    var isAboveTreshold: Boolean? = null
    @SerializedName("createAt")
    var createAt: String? = null
}