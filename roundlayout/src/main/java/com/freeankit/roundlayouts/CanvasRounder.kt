package com.freeankit.roundlayouts

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF

/**
 * @author Ankit Kumar (ankitdroiddeveloper@gmail.com) on 02/04/2018 (MM/DD/YYYY)
 */
internal class CanvasRounder(cornerRadius: Float, cornerStrokeColor: Int = 0, cornerStrokeWidth: Float = 0F) {
    private val path = android.graphics.Path()
    private lateinit var rectF: RectF
    private var strokePaint: Paint?
    var cornerRadius: Float = cornerRadius
        set(value) {
            field = value
            resetPath()
        }

    init {
        if (cornerStrokeWidth <= 0)
            strokePaint = null
        else {
            strokePaint = Paint()
            strokePaint!!.style = Paint.Style.STROKE
            strokePaint!!.isAntiAlias = true
            strokePaint!!.color = cornerStrokeColor
            strokePaint!!.strokeWidth = cornerStrokeWidth
        }
    }

    fun round(canvas: Canvas, drawFunction: (Canvas) -> Unit) {
        val save = canvas.save()
        canvas.clipPath(path)
        drawFunction(canvas)
        if (strokePaint != null)
            canvas.drawRoundRect(rectF, cornerRadius, cornerRadius, strokePaint)
        canvas.restoreToCount(save)
    }

    fun updateSize(currentWidth: Int, currentHeight: Int) {
        rectF = android.graphics.RectF(0f, 0f, currentWidth.toFloat(), currentHeight.toFloat())
        resetPath()
    }

    private fun resetPath() {
        path.reset()
        path.addRoundRect(rectF, cornerRadius, cornerRadius, Path.Direction.CW)
        path.close()
    }

}