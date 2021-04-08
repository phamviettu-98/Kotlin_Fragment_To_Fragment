package viettu.pvt.myapplication

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Frag2Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Frag2Fragment : Fragment() {
      lateinit var ed_change2:EditText
      lateinit var btn_chang2:Button
      lateinit var ItemChange: ChangeData2


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_frag2, container, false)

         ed_change2 = view.findViewById<EditText>(R.id.ed_frag2)
        btn_chang2 = view.findViewById<Button>(R.id.btn_change2)
        btn_chang2.setOnClickListener(){
            var text:String = ed_change2.text.toString()
            ItemChange.ChangeDataFrag2(text)
        }
        return  view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
       ItemChange = activity as ChangeData2
    }

    companion object {
        fun newInstance(): Frag2Fragment {
            return Frag2Fragment()
        }
    }
    fun ReciceDataFromFragment(data:String){
        ed_change2.setText(data)

    }
}