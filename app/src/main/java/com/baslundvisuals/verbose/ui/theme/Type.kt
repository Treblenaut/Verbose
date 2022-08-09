package com.baslundvisuals.verbose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.baslundvisuals.verbose.R

val JosefinSans = FontFamily(
    Font(R.font.josefin_sans_regular),
    Font(R.font.josefin_sans_light, FontWeight.Light),
    Font(R.font.josefin_sans_bold, FontWeight.Bold)
)

val Raleway = FontFamily(
    Font(R.font.raleway_light, FontWeight.Light)
)

val EncodeSansSemiCondensed = FontFamily(
    Font(R.font.encode_sans_semicondensed_extralight, FontWeight.ExtraLight)
)

// HEADINGS
val headingFontFamilyRegular = JosefinSans
val headingFontFamilyLight = JosefinSans
val headingFontFamilyBold = JosefinSans

// BODY
val bodyFontFamily = Raleway

// TIMER
val timerFontFamily = EncodeSansSemiCondensed

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = EncodeSansSemiCondensed,
        fontWeight = FontWeight.ExtraLight,
        fontSize = 53.sp
    ),
    h2 = TextStyle(
        fontFamily = headingFontFamilyLight,
        fontWeight = FontWeight.Light,
        fontSize = 45.sp
    ),
    h3 = TextStyle(
        fontFamily = headingFontFamilyLight,
        fontWeight = FontWeight.Light,
        fontSize = 32.sp
    ),
    h4 = TextStyle(
        fontFamily = headingFontFamilyLight,
        fontWeight = FontWeight.Light,
        fontSize = 27.sp
    ),
    h5 = TextStyle(
        fontFamily = headingFontFamilyBold,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    h6 = TextStyle(
        fontFamily = headingFontFamilyBold,
        fontWeight = FontWeight.Bold,
        fontSize = 19.sp
    ),
    body1 = TextStyle(
        fontFamily = Raleway,
        fontWeight = FontWeight.Light,
        fontSize = 19.sp
    ),
    button = TextStyle(
        fontFamily = Raleway,
        fontWeight = FontWeight.Light,
        fontSize = 19.sp,
        letterSpacing = 1.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = Raleway,
        fontWeight = FontWeight.Light,
        fontSize = 16.sp
    ),

)