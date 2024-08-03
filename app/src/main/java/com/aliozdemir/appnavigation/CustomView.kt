package com.aliozdemir.appnavigation

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.navigation.findNavController

class CustomView
    @JvmOverloads
    constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0,
    ) : LinearLayout(context, attrs, defStyleAttr) {
        private lateinit var textViewTitle: TextView
        private lateinit var textViewDescription: TextView

        init {
            orientation = VERTICAL
            LayoutInflater.from(context).inflate(R.layout.view_custom, this, true)

            textViewTitle.text = findViewById(R.id.textViewTitle)
            textViewDescription.text = findViewById(R.id.textViewDescription)

            // Default degerleri ayarla
            textViewTitle.text = "Custom View Title"
            textViewDescription.text = "This is a custom description."

            // Eğer attrs ile özelleştirilebilir yapmak isterseniz:
            attrs?.let {
//                val typedArray = context.obtainStyledAttributes(it, R.styleable.CustomView, 0, 0)
//                val title = typedArray.getString(R.styleable.CustomView_titleText)
//                val description = typedArray.getString(R.styleable.CustomView_descriptionText)
//
//                title?.let {
//                    textViewTitle.text = it
//                }
//                description?.let {
//                    textViewDescription.text = it
//                }
//
//                typedArray.recycle()
            }

            // TODO-5 findNavController() ile navController'a ulaş.
            val navController = findNavController()
        }
    }
