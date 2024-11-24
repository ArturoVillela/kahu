package com.firebaseapp.charlieandroidblog.utils

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.firebaseapp.charlieandroidblog.R
import java.util.concurrent.ThreadLocalRandom

class UtilsUi {

    companion object{

        fun getColorBlue1() = Color(0xFF2C2C81)
        fun getColorBlue2() = Color(0xFF3030AF)
        fun getColorBlue3() = Color(0xFF2828BA)
        fun getColorRed1() = Color(0xFF880D0D)
        fun getColorGreen1() = Color(0xFF315537)
        fun getLightBlue() = Color(0xFF5252FF)
        fun getColorWhite1() = Color(0xFFFFFFFF)
        fun getColorWhite2() = Color(0xFFD0D0D0)
        fun getColorAlmostWhite() = Color(0xFFE3E3E3)
        fun getColorAlmostBlue() = Color(0xFF8B9AFF)
        fun getColorAlmostBlack() = Color(0xFF2B2B2B)

        fun getColor4Layot(cont:Int): Color{

            when(cont){
                1-> return Color(0xFF7B1818)
                2-> return Color(0xFF151A80)
                3-> return Color(0xFF3C730E)
                4-> return Color(0xFF7A1F95)
                5-> return Color(0xFFB5820F)
                6-> return Color(0xFF206362)
                7-> return Color(0xFF354071)
                8-> return Color(0xFF632042)
                else -> return Color(0xFF633C20)
            }
        }

        fun getRandomColor(): Color{
            val randomNum = ThreadLocalRandom.current().nextInt(1, 10)
            return getColor4Layot(randomNum)
        }

        fun getResIdImageForLayout(cont:Int): Pair<Int,String> {
            when (cont){
                1->  return  Pair(R.drawable.imgf_breeds_w, UtilContext.getContext().getString(R.string.init_layout_breeds))
                2->  return  Pair(R.drawable.imgf_before, UtilContext.getContext().getString(R.string.init_layout_before))
                3->  return  Pair(R.drawable.imgf_trainning, UtilContext.getContext().getString(R.string.init_layout_training))
                4->  return  Pair(R.drawable.imgf_dont, UtilContext.getContext().getString(R.string.init_layout_dodont))
                5->  return  Pair(R.drawable.imgf_food, UtilContext.getContext().getString(R.string.init_layout_food))
                6->  return  Pair(R.drawable.imgf_qrc, UtilContext.getContext().getString(R.string.init_layout_qr))
                7->  return  Pair(R.drawable.imgf_read, UtilContext.getContext().getString(R.string.init_layout_read))
                8->  return  Pair(R.drawable.imgf_records2, UtilContext.getContext().getString(R.string.init_layout_record))
                else -> return  Pair(R.drawable.imgf_qrc, UtilContext.getContext().getString(R.string.init_layout_qr))
            }
        }

        fun getBrushGradient(): Brush {
            return Brush.horizontalGradient(
                colors = listOf(getLightBlue(),getColorRed1()),
                startX = 0.5f,
                endX = 1f
            )
        }
    }


}