package com.ebookfrenzy.tablayoutdemo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 */
 class Tab4Fragment : Fragment() {


public override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                                 savedInstanceState: Bundle?): View? {
 // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_tab4, container, false)
}

}