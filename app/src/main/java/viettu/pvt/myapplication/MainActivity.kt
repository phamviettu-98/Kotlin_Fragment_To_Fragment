package viettu.pvt.myapplication

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ChangeData, ChangeData2 {
    var isFragmentonLoad = true
    val manager= supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var transtion = manager.beginTransaction()
        var fragment1  = Frag1Fragment()

        var  fragment2 = Frag2Fragment()
        transtion.add(R.id.fragment_change1, fragment1)
        transtion.add(R.id.fragment_change2, fragment2)
        transtion.commit()





    }

    override fun ChangeDataFrag(data: String) {
      var frag2: Frag2Fragment = manager.findFragmentById(R.id.fragment_change2) as Frag2Fragment
        frag2.ReciceDataFromFragment(data)

    }

    override fun ChangeDataFrag2(data: String) {
        var frag1 : Frag1Fragment = manager.findFragmentById(R.id.fragment_change1) as  Frag1Fragment
        frag1.RecivceDataFromFragment(data)
    }


}