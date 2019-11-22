package com.example.advancedrecyclerview

class ColorRepository {
    fun getColorItems(): List<ColorItem> {
        return arrayListOf(
            ColorItem("000000", "Black"),
            ColorItem("FF0000", "Red"),
            ColorItem("008000", "Green"),
            ColorItem("0000FF", "Blue"),
            ColorItem("00FFFF", "Cyan"),
            ColorItem("FFFF00", "Yellow"),
            ColorItem("FF00FF", "Magenta"),
            ColorItem("660066", "Purple"),
            ColorItem("00ff00", "Lime"),
            ColorItem("008081", "Teal"),
            ColorItem("ff6699", "Pink"),
            ColorItem("663300", "Brown")
        )
    }
}