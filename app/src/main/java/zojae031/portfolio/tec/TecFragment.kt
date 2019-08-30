package zojae031.portfolio.tec

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_tec.view.*
import zojae031.portfolio.R

class TecFragment : Fragment(),TecContract.View {


    private val adapter = TecAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_tec, container, false).apply {
            recycler.adapter = adapter
        }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }
    override fun showToast(text: String) {
        Toast.makeText(context,text,Toast.LENGTH_SHORT).show()
    }
}