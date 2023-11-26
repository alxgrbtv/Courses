package com.alxgrbdev.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val numberResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
