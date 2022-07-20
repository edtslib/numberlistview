package id.co.edtslib.numberlistview

import androidx.core.text.HtmlCompat
import id.co.edtslib.baserecyclerview.BaseRecyclerViewAdapterDelegate
import id.co.edtslib.baserecyclerview.BaseViewHolder
import id.co.edtslib.numberlistview.databinding.AdapterNumberingListBinding

class NumberListHolder(private val viewBinding: AdapterNumberingListBinding,
                       private var symbol: String, private var space: Float) :
    BaseViewHolder<String>(viewBinding) {
    override fun setData(
        list: MutableList<String>,
        position: Int,
        delegate: BaseRecyclerViewAdapterDelegate<String>?
    ) {
        if (space > 0f) {
            itemView.setPadding(itemView.paddingLeft, itemView.paddingTop, itemView.paddingRight,
            space.toInt())
        }
        viewBinding.tvNo.text = if (symbol.isEmpty()) String.format("%d.", position+1) else symbol
        viewBinding.tvText.text =
            HtmlCompat.fromHtml(list[position],
                HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}