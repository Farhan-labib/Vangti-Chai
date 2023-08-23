package com.example.vangtichai

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.floor
class MainActivity : AppCompatActivity() {
    var output:String=""
    var o:Double=0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun buttonclick0(view: View) {
        output+= "0"
        var d : TextView = findViewById<TextView>(R.id.tv)
        d.setText(output.toString())
        calculation();
        }

    fun buttonclick1(view: View) {
        output+= "1"
        var d : TextView = findViewById<TextView>(R.id.tv)
        d.setText(output.toString())
        calculation();}

    fun buttonclick2(view: View) {
        output+= "2"
        var d : TextView = findViewById<TextView>(R.id.tv)
        d.setText(output.toString())
        calculation();}

    fun buttonclick3(view: View) {
        output+= "3"
        var d : TextView = findViewById<TextView>(R.id.tv)
        d.setText(output.toString())
        calculation();}

    fun buttonclick4(view: View) {
        output+= "4"
        var d : TextView = findViewById<TextView>(R.id.tv)
        d.setText(output.toString())
        calculation();}

    fun buttonclick5(view: View) {
        output+= "5"
        var d : TextView = findViewById<TextView>(R.id.tv)
        d.setText(output.toString())
        calculation();}

    fun buttonclickc(view: View) {
        output=""
        var tv : TextView = findViewById<TextView>(R.id.tv)
        tv.setText(output.toString())
        var a : TextView = findViewById<TextView>(R.id.a)
        a.setText((0).toString())
        var b : TextView = findViewById<TextView>(R.id.b)
        b.setText((0).toString())
        var c : TextView = findViewById<TextView>(R.id.c)
        c.setText((0).toString())
        var d : TextView = findViewById<TextView>(R.id.d)
        d.setText((0).toString())
        var e : TextView = findViewById<TextView>(R.id.e)
        e.setText((0).toString())
        var f : TextView = findViewById<TextView>(R.id.f)
        f.setText((0).toString())
        var g : TextView = findViewById<TextView>(R.id.g)
        g.setText((0).toString())
        var h : TextView = findViewById<TextView>(R.id.h)
        h.setText((0).toString())}

    fun buttonclick6(view: View) {
        output+= "6"
        var d : TextView = findViewById<TextView>(R.id.tv)
        d.setText(output.toString())
        calculation();}

    fun buttonclick7(view: View) {
        output+= "7"
        var d : TextView = findViewById<TextView>(R.id.tv)
        d.setText(output.toString())
        calculation();}

    fun buttonclick8(view: View) {
        output+= "8"
        var d : TextView = findViewById<TextView>(R.id.tv)
        d.setText(output.toString())
        calculation();}

    fun buttonclick9(view: View) {
        output+= "9"
        var d : TextView = findViewById<TextView>(R.id.tv)
        d.setText(output.toString())
        calculation();}

    fun calculation(){
        var a : TextView = findViewById<TextView>(R.id.a)
        a.setText((0).toString())
        var b : TextView = findViewById<TextView>(R.id.b)
        b.setText((0).toString())
        var c : TextView = findViewById<TextView>(R.id.c)
        c.setText((0).toString())
        var d : TextView = findViewById<TextView>(R.id.d)
        d.setText((0).toString())
        var e : TextView = findViewById<TextView>(R.id.e)
        e.setText((0).toString())
        var f : TextView = findViewById<TextView>(R.id.f)
        f.setText((0).toString())
        var g : TextView = findViewById<TextView>(R.id.g)
        g.setText((0).toString())
        var h : TextView = findViewById<TextView>(R.id.h)
        h.setText((0).toString())


        o=output.toDouble()

        if(o>=500){
        a.setText(floor(o/500).toString().substringBefore("."))
        o=o-(floor(o/500)*500)}

        if(o>=100){
            b.setText(floor(o/100).toString().substringBefore("."))
            o=o-(floor(o/100)*100)}
        if(o>=50){
            c.setText(floor(o/50).toString().substringBefore("."))
            o=o-(floor(o/50)*50)}
        if(o>=20){
            d.setText(floor(o/20).toString().substringBefore("."))
            o=o-(floor(o/20)*20)}
        if(o>=10){
            e.setText(floor(o/10).toString().substringBefore("."))
            o=o-(floor(o/10)*10)}
        if(o>=5){
            f.setText(floor(o/5).toString().substringBefore("."))
            o=o-(floor(o/5)*5)}
        if(o>=2){
            g.setText(floor(o/2).toString().substringBefore("."))
            o=o-(floor(o/2)*2)}
        if(o>=1){
            h.setText(floor(o/1).toString().substringBefore("."))
            o=o-(floor(o/1)*1)}


    }
    public override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        savedInstanceState.putString("output",output)
        savedInstanceState.putDouble("o",o)


        Log.d("mainActivity", "in onSaveInstanceState \"output\","+output)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        //get value
        val fn = savedInstanceState.getString("output")
        val ln = savedInstanceState.getDouble("o")
        var tv : TextView = findViewById<TextView>(R.id.tv)
        tv.setText(fn.toString())
        o= ln
        output=fn.toString()
        calculation()
        Log.d("mainActivity", "in onRestoreInstanceState output: " +fn.toString())

    }
}




