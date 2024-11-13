package com.firebaseapp.charlieandroidblog.utils

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.firebaseapp.charlieandroidblog.R

class UtilsUi {

    companion object{

        fun getColorBlue1() = Color(0xFF2C2C81)
        fun getColorBlue2() = Color(0xFF3030AF)
        fun getColorBlue3() = Color(0xFF2828BA)
        fun getColorWhite1() = Color(0xFFFFFFFF)
        fun getColorWhite2() = Color(0xFFD0D0D0)

        fun getColor4Layot(cont:Int): Color{

            when(cont){
                1-> return Color(0xFF7B1818)
                2-> return Color(0xFF151A80)
                3-> return Color(0xFF3C730E)
                4-> return Color(0xFF7A1F95)
                5-> return Color(0xFFB5820F)
                6-> return Color(0xFF206362)
                else -> return Color(0xFF633C20)
            }
        }

        fun getResIdImageForLayout(cont:Int): Pair<Int,String> {
            when (cont){
                1->  return  Pair(R.drawable.imgf_breeds_w, UtilContext.getContext().getString(R.string.init_layout_breeds))
                2->  return  Pair(R.drawable.imgf_before, UtilContext.getContext().getString(R.string.init_layout_before))
                3->  return  Pair(R.drawable.imgf_trainning, UtilContext.getContext().getString(R.string.init_layout_training))
                4->  return  Pair(R.drawable.imgf_dont, UtilContext.getContext().getString(R.string.init_layout_dodont))
                5->  return  Pair(R.drawable.imgf_food, UtilContext.getContext().getString(R.string.init_layout_food))
                6->  return  Pair(R.drawable.imgf_qrc, UtilContext.getContext().getString(R.string.init_layout_qr))
                else -> return  Pair(R.drawable.imgf_qrc, UtilContext.getContext().getString(R.string.init_layout_qr))
            }
        }
    }


}