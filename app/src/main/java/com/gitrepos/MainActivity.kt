package com.gitrepos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//botão reset
        bt_reset1.setOnClickListener {
            text_vsouza.text = "ADD ..."
            text_awersome.text = "ADD ..."
            text_31254.text = "ADD ..."

        }
        bt_reset2.setOnClickListener {
            text_Alamofire1.text = "ADD ..."
            text_Alamofire2.text = "ADD ..."
            text_30744.text = "ADD ..."
        }
        bt_reset3.setOnClickListener {
            text_danielgindi.text = "ADD ..."
            textView12.text = "ADD ..."
            text_20781.text = "ADD ..."
        }
        bt_reset4.setOnClickListener {
            textView14.text = "ADD ..."
            text_swift_algorithm_club.text = "ADD ..."
            text_20046.text = "ADD ..."
        }

//botão editar
        bt_edit1.setOnClickListener {
            text_vsouza.text = "EDITAR ..."
            text_awersome.text = "EDITAR ..."
            text_31254.text = "EDITAR ..."
        }
        bt_edit2.setOnClickListener {
            text_Alamofire1.text = "EDITAR ..."
            text_Alamofire2.text = "EDITAR ..."
            text_30744.text = "EDITAR ..."
        }
        bt_edit3.setOnClickListener {
            text_danielgindi.text = "EDITAR ..."
            textView12.text = "EDITAR ..."
            text_20781.text = "EDITAR ..."
        }
        bt_edit4.setOnClickListener {
            textView14.text = "EDITAR ..."
            text_swift_algorithm_club.text = "EDITAR ..."
            text_20046.text = "EDITAR ..."
        }

//Botão recharge

        bt_recharge1.setOnClickListener {
            text_vsouza.text = "vsouza"
            text_awersome.text = "awersome-ios"
            text_31254.text = "Stars: 31254"
        }
        bt_recharge2.setOnClickListener {
            text_Alamofire1.text = "Alamofire"
            text_Alamofire2.text = "Alamofire"
            text_30744.text = "Stars: 30744"
        }
        bt_recharge3.setOnClickListener {
            text_danielgindi.text = "danielgindi"
            textView12.text = "Charts"
            text_20781.text = "Stars: 20781"
        }
        bt_rechange4.setOnClickListener {
            textView14.text = "raywenderlich"
            text_swift_algorithm_club.text = "swift-algorithm-club"
            text_20046.text = "Stars: 20046"
        }
    }
}
