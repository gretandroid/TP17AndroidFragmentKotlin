package education.cccp.mobile.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import education.cccp.mobile.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Fragment1.Communication {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun send(name: String) {
        binding.textViewMainActivity.text = name
    }

}