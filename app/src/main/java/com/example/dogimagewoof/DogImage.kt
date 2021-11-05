package com.example.dogimagewoof

import com.squareup.moshi.Json

data class Dog (
    @Json(name="message")
    val imgSrcUrl:String?,
    @Json(name="status")
    val status: String?,



    )