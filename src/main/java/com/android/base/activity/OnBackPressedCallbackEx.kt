package com.android.base.activity

import androidx.activity.OnBackPressedCallback

fun OnBackPressedCallback.enable() {
    isEnabled = true
}

fun OnBackPressedCallback.disable() {
    isEnabled = false
}