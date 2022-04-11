package education.cccp.mobile.fragment

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import education.cccp.mobile.fragment.databinding.Fragment1Binding


class Fragment1 : Fragment() {
    private lateinit var binding: Fragment1Binding
    private lateinit var activity: Activity
    private var communication: Communication? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment1Binding.inflate(
            inflater,
            container,
            false
        )
        val view = binding.root
        return view
    }

    interface Communication {
        fun send(name: String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        // le cast se fait avec "as"
        activity = context as Activity
        // is est l'équivlent de instanceOf
        if (activity is Communication) {
            communication = activity as Communication
        }
    }
}