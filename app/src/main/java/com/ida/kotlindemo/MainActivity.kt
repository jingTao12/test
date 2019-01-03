package com.ida.kotlindemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ida.kotlindemo.R.id.show
import com.ida.kotlindemo.model.Bean
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {//extends ：

    //定义一个集合
    val list = arrayListOf<Bean>()
    //define list<Int>
    val listInt: List<Int> = listOf(0, 1, 2)

    //define int
    val a: Int = 1
    //define string
    val b: String = "ida"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //instead of findViewById(R.id.xxx)
        show.text = "hello world!"
        initData()
    }

    fun initData() {
        val bean1 = Bean("ida", 18, "nv")
        val bean2 = Bean("hui", 20, "man")
        list.add(bean1)
        list.add(bean2)

    }

    override fun onResume() {
        super.onResume()
        //inn----------------if(x!=null)
        //ifn----------------if(x==null)
        if (show != null) {
            show.setText("update again")
//            show.visibility= View.GONE
//            show.text="help"
        }
        show.setOnClickListener{
            Toast.makeText(this@MainActivity, "hello", Toast.LENGTH_SHORT).show()
            //startActivity
            val intent= Intent()
            intent.setClass(this@MainActivity,SecondActivity::class.java)
            startActivity(intent)
        }





    }
}
