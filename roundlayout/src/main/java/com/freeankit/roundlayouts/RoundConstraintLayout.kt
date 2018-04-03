package com.freeankit.roundlayouts

import android.content.Context
import android.graphics.Canvas
import android.os.Build
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.widget.FrameLayout

/**
 * @author Ankit Kumar (ankitdroiddeveloper@gmail.com) on 03/04/2018 (MM/DD/YYYY)
 */
class RoundConstraintLayout  : ConstraintLayout {
    private lateinit var canvasRounder: CanvasRounder

    constructor(context: Context) : super(context) {
        init(context, null, 0)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context, attrs, 0)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init(context, attrs, defStyle)
    }

    private fun init(context: Context, attrs: AttributeSet?, defStyle: Int) {
        val array = context.obtainStyledAttributes(attrs, R.styleable.RoundedCornersView, 0, 0)
        val cornerRadius = array.getDimension(R.styleable.RoundedCornersView_corner_radius, 0f)
        val cornerStrokeColor = array.getColor(R.styleable.RoundedCornersView_corner_stroke_color, 0)
        val cornerStrokeWidth = array.getDimension(R.styleable.RoundedCornersView_corner_stroke_width, 0f)
        array.recycle()
        canvasRounder = CanvasRounder(cornerRadius,cornerStrokeColor,cornerStrokeWidth)
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN_MR2) {
            setLayerType(FrameLayout.LAYER_TYPE_SOFTWARE, null)
        }
    }

    override fun onSizeChanged(currentWidth: Int, currentHeight: Int, oldWidth: Int, oldheight: Int) {
        super.onSizeChanged(currentWidth, currentHeight, oldWidth, oldheight)
        canvasRounder.updateSize(currentWidth, currentHeight)
    }

    override fun draw(canvas: Canvas) = canvasRounder.round(canvas) { super.draw(canvas) }

    override fun dispatchDraw(canvas: Canvas) = canvasRounder.round(canvas) { super.dispatchDraw(canvas) }

}