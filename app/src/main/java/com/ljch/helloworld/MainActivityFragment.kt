package com.ljch.helloworld

import android.app.Fragment
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.rdf.cdk.CodeUtil

import kotlinx.android.synthetic.main.fragment_main.*
/**
 * A placeholder fragment containing a simple view.
 */
class MainActivityFragment : Fragment() {

    val data:Array<String> =  arrayOf("imageLoader", "glide")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myAdapter : ArrayAdapter<String> = ArrayAdapter(context,android.R.layout.simple_list_item_1,data)
        list_view.adapter = myAdapter
        list_view.onItemClickListener = AdapterView.OnItemClickListener{parent, view, position, id -> goToPage(position) }
    }

    //点击跳转页面
    private fun goToPage(position:Int){
        Log.i("MainActivityFragment", "position = $position")
        when(position) {
            0 -> {
                val str = "kKETPG6oRbCjwwsYkQEDrQvPvu85UgiGq+Bt6Xwb3McEfpjKKfnBc9iX05akWkuRyLK2XFNgLesmwiepR7y7M7zA2DnaTsnh5IvsTDrAojs="
                val result = CodeUtil.decodeQrCode(str)
                Log.i("MainActivityFragment", result)
            }
            1 -> {
                val intent = Intent(activity, NDKActivity::class.java)
                startActivity(intent)
            }
        }
    }

}
