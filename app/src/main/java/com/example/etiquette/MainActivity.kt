package com.example.etiquette

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btnAstatick(view: View) {
        val intent:Intent=Intent(this@MainActivity,AstetickActivity::class.java)
        startActivity(intent)
    }

    fun btnGr(view: View) {
        val intent:Intent=Intent(this@MainActivity,GrActivity::class.java)
        startActivity(intent)
    }
    fun btnSoc(view: View) {
        val intent:Intent=Intent(this@MainActivity,SocActivity::class.java)
        startActivity(intent)
    }
    fun btnPris(view: View) {
        val intent:Intent=Intent(this@MainActivity,PrisActivity::class.java)
        startActivity(intent)
    }
    fun btnRel(view: View) {
        val intent:Intent=Intent(this@MainActivity,RelActivity::class.java)
        startActivity(intent)
    }
    fun btnPech(view: View) {
        val intent:Intent=Intent(this@MainActivity,PechActivity::class.java)
        startActivity(intent)
    }
    fun btnPut(view: View) {
        val intent:Intent=Intent(this@MainActivity,PutActivity::class.java)
        startActivity(intent)
    }
    fun btnSport(view: View) {
        val intent:Intent=Intent(this@MainActivity,SportActivity::class.java)
        startActivity(intent)
    }
    fun btnGender(view: View) {
        val intent:Intent=Intent(this@MainActivity,GenderActivity::class.java)
        startActivity(intent)
    }
    fun btnBrak(view: View) {
        val intent:Intent=Intent(this@MainActivity,BrakActivity::class.java)
        startActivity(intent)
    }
    fun btnDel(view: View) {
        val intent:Intent=Intent(this@MainActivity,DelActivity::class.java)
        startActivity(intent)
    }
    fun btnDip(view: View) {
        val intent:Intent=Intent(this@MainActivity,DipActivity::class.java)
        startActivity(intent)
    }
    fun btnKorp(view: View) {
        val intent:Intent=Intent(this@MainActivity,KorpActivity::class.java)
        startActivity(intent)
    }
    fun btnSer(view: View) {
        val intent:Intent=Intent(this@MainActivity,SerActivity::class.java)
        startActivity(intent)
    }

    fun btnVoin(view: View) {
        val intent:Intent=Intent(this@MainActivity,VoinActivity::class.java)
        startActivity(intent)}
}