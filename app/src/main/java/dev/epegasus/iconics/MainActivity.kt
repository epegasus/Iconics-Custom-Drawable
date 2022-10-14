package dev.epegasus.iconics

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mikepenz.iconics.IconicsDrawable
import com.mikepenz.iconics.typeface.library.fontawesome.FontAwesome
import com.mikepenz.iconics.utils.colorInt
import com.mikepenz.iconics.utils.sizeDp
import dev.epegasus.iconics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setIcon()
    }

    private fun setIcon() {
        // Access specific icon by reference
        val iconicsById = IconicsDrawable(this, FontAwesome.Icon.faw_home).apply {
            colorInt = Color.BLACK
            sizeDp = 80
        }

        // Access specific icon by its name
        val iconicsByName = IconicsDrawable(this, FontAwesome.getIcon("faw_lock")).apply {
            colorInt = Color.BLACK
            sizeDp = 80
        }

        // Access specific icon by its index from iconsList
        val iconicsByIndex = IconicsDrawable(this, FontAwesome.icons[1]).apply {
            sizeDp = 80
        }
        binding.sivIconMain.setImageDrawable(iconicsByIndex)
    }
}