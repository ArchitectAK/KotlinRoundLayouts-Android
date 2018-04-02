package com.freeankit.roundlayouts

import android.os.Build
import android.view.View

/**
 * @author Ankit Kumar (ankitdroiddeveloper@gmail.com) on 02/04/2018 (MM/DD/YYYY)
 */
internal fun View.updateOutlineProvider(cornerRadius : Float){
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
        outlineProvider = RoundOutlineProvider(cornerRadius)
    }
}