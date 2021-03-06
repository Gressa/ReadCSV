package com.example.readcsvfileapp.main

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import androidx.annotation.RequiresApi
import com.example.readcsvfileapp.R
import kotlinx.android.synthetic.main.user_item_view.view.*
import java.text.SimpleDateFormat
import java.util.*

open class UserItemView : RelativeLayout, ItemView {

    companion object {
        private const val DATE_FORMAT = "dd MMMM yyyy"
    }

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(
        context,
        attrs,
        defStyleAttr,
        defStyleRes
    ) {
        init()
    }

    private fun init() {
        LayoutInflater.from(context).inflate(R.layout.user_item_view, this, true)
    }


    override fun setName(name: String?) {
        name_txt.text = name
    }

    override fun setSurname(surname: String?) {
        surname_txt.text = surname
    }

    override fun setIssueCount(issue: Int?) {
        issue_count.text = issue.toString()
    }

    override fun setBirthDate(date: Date?) {
        date?.let {
            val formattedDate = SimpleDateFormat(DATE_FORMAT, Locale.getDefault()).format(it)
            date_of_birth.text = formattedDate
        } ?: run {
            date_of_birth.text = ""
        }
    }

}