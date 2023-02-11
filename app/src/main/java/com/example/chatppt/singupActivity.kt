package com.example.chatppt

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.random.Random
import kotlinx.android.synthetic.main.activity_singup.*

class singupActivity : AppCompatActivity() {
    var avatr="profiledefault"
    var avatrColor="[0.5,0.5,0.5,1]"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singup)
    }
    fun avatarOnClick(view: View)
    {
      val random= Random
        val color=random.nextInt(2)
        val avatrNo=random.nextInt(28)
        if(color==0)
        {
            avatr="light$avatrNo"
        }
        else
            avatr="dark$avatrNo"

        val resourceId=resources.getIdentifier(avatr,"drawable",packageName)
        avatarbtn.setImageResource(resourceId)


    }
    fun avatarBackground(view: View)
    {
       val random=Random
        val r=random.nextInt(255)
        val g=random.nextInt(255)
        val b=random.nextInt(255)
        avatarbtn.setBackgroundColor(Color.rgb(r,g,b))
        val saveR=r.toDouble()/255
        val saveG=g.toDouble()/255
        val saveB=b.toDouble()/255
        avatrColor="[$saveR,$saveG,$saveB,1]"

    }
    fun createAcountClicked(view: View)
    {

    }
}