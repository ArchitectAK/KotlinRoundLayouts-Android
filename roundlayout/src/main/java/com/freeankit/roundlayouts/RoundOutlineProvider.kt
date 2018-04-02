package com.freeankit.roundlayouts

import android.graphics.Outline
import android.graphics.Rect
import android.os.Build
import android.support.annotation.RequiresApi
import android.view.View
import android.view.ViewOutlineProvider

/**
 * @author Ankit Kumar (ankitdroiddeveloper@gmail.com) on 02/04/2018 (MM/DD/YYYY)
 */
internal class RoundOutlineProvider(private val cornerRadius: Float) : ViewOutlineProvider() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun getOutline(view: View, outline: Outline) {
        val rect = Rect(0, 0, view.measuredWidth, view.measuredHeight)
        outline.setRoundRect(rect, cornerRadius)
    }
}