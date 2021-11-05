package com.example.dogimagewoof
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.viewModels
import com.squareup.picasso.Picasso
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val changeDogButton: Button = findViewById(R.id.button2)


        viewModel.currentlyDisplayedDog.observe(this)
        {
            val mainImage: ImageView = findViewById(R.id.DogImage)
            Picasso.get().load ( it.imgSrcUrl).into(mainImage)

            changeDogButton.setOnClickListener {
                viewModel.getNewDog()
            }

        }
    }
}