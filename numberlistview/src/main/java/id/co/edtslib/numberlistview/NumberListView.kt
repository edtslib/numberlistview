package id.co.edtslib.numberlistview

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NumberListView: FrameLayout {
    val adapter = NumberListAdapter()

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    init {
        val view = inflate(context, R.layout.view_numbering_list, this)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter
    }

    fun add(text: String) {
        adapter.list.add(text)
        adapter.notifyItemInserted(adapter.itemCount)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun add(texts: List<String>) {
        adapter.list.addAll(texts)
        adapter.notifyDataSetChanged()
    }
}