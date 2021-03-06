package com.smlnskgmail.jaman.randomnotes.components

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.ViewGroup

abstract class BaseDialog(context: Context) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResId())
        window!!.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    }

    abstract fun layoutResId(): Int

}
