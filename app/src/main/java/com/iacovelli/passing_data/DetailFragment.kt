package com.iacovelli.passing_data

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_detail.*

class DetailFragment: Fragment() {

    private val name by lazy { arguments!!.getString(NAME)!! }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setText(name)
    }

    private fun setText(text: String) {
        detailText.text = text
    }

    companion object {
        private const val NAME = "name"

        fun newInstance(name: String): DetailFragment {
            val arguments = Bundle().apply {
                putString(NAME, name)
            }

            return DetailFragment().apply {
                setArguments(arguments)
            }
        }
    }
}