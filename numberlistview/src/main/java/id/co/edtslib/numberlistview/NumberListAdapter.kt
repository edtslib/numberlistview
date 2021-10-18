package id.co.edtslib.numberlistview

import android.view.LayoutInflater
import android.view.ViewGroup
import id.co.edtslib.baserecyclerview.BaseRecyclerViewAdapter
import id.co.edtslib.numberlistview.databinding.AdapterNumberingListBinding

class NumberListAdapter: BaseRecyclerViewAdapter<AdapterNumberingListBinding, String>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> AdapterNumberingListBinding
        get() = AdapterNumberingListBinding::inflate

    override fun clickable() = false
    override fun createHolder() = NumberListHolder(binding)

}