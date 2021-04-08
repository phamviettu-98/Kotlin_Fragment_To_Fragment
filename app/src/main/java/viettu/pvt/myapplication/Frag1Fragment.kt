package viettu.pvt.myapplication

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class Frag1Fragment : Fragment() {


    lateinit var changeData:ChangeData
    lateinit var tv_frag:EditText

    lateinit var btn_change:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        changeData = activity as ChangeData


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_frag1, container, false)
        tv_frag = view.findViewById<EditText>(R.id.ed_frag1)
         btn_change = view.findViewById<Button>(R.id.btn_change1)
        var activity = activity as Context
        btn_change.setOnClickListener(){

            var textView:String = tv_frag.text.toString()
            changeData.ChangeDataFrag(textView)
        }


        return view
    }

    companion object {
        fun newInstance(): Frag1Fragment {

            return Frag1Fragment()
        }
    }
    fun RecivceDataFromFragment( data : String){
        tv_frag.setText(data)
    }
}