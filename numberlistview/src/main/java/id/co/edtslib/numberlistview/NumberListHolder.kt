package id.co.edtslib.numberlistview

import androidx.core.text.HtmlCompat
import id.co.edtslib.baserecyclerview.BaseRecyclerViewAdapterDelegate
import id.co.edtslib.baserecyclerview.BaseViewHolder
import id.co.edtslib.numberlistview.databinding.AdapterNumberingListBinding

class NumberListHolder(private val viewBinding: AdapterNumberingListBinding,
                       private val numberListTextPadding: Float) : BaseViewHolder<String>(viewBinding) {
    override fun setData(
        list: MutableList<String>,
        position: Int,
        delegate: BaseRecyclerViewAdapterDelegate<String>?
    ) {
        val padding = numberListTextPadding.toInt()

        itemView.setPadding(padding, padding, padding, padding)

        viewBinding.tvNo.text = String.format("%d.", position+1)
        viewBinding.tvText.text =
            HtmlCompat.fromHtml(list[position],
                HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}