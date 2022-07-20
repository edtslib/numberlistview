package id.co.edtslib.numberlistview

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NumberListView: FrameLayout {
    val adapter = NumberListAdapter()

    constructor(context: Context) : super(context) {
        init(null)
    }
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(attrs)
    }
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(attrs)
    }

    private fun init(attrs: AttributeSet?) {
        val view = inflate(context, R.layout.view_numbering_list, this)

        if (attrs != null) {
            val a = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.NumberListView,
                0, 0
            )

            val symbol = a.getString(R.styleable.NumberListView_symbol)
            if (symbol != null) {
                adapter.symbol = symbol
            }

            adapter.space = a.getDimension(R.styleable.NumberListView_space, 0f)

            a.recycle()
        }

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