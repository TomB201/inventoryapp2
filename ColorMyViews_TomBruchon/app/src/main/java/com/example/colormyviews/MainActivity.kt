package com.example.colormyviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.graphics.Color
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews : List<View> =
            listOf(Box_one_text, Box_two_text,Box_three_text,Box_four_text,Box_five_text,
                Constraint_layout, button_red, button_yellow, button_green)

        for (item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.Box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.Box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.Box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.Box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.Box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.button_red -> Box_three_text.setBackgroundResource(android.R.color.holo_red_light)
            R.id.button_yellow -> Box_four_text.setBackgroundResource(android.R.color.holo_blue_light)
            R.id.button_green -> Box_five_text.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}