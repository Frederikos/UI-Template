package com.mlsdev.templates.widgets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableBoolean
import androidx.fragment.app.Fragment
import com.mlsdev.templates.R
import com.mlsdev.templates.databinding.FragmentRecyclerViewBinding

class WidgetsFragment : Fragment() {

    lateinit var viewDataBinding: FragmentRecyclerViewBinding
        private set
    val isNoItems = ObservableBoolean(false)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_recycler_view, container, false)
        viewDataBinding = DataBindingUtil.bind(rootView)!!
        return rootView
    }

}