package com.tutorialwing.scrollview


import `in`.blogspot.kmvignesh.calculator.MainActivity_3
import `in`.blogspot.kmvignesh.calculator.R
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
import com.codinginflow.picassoimagesliderexample.ViewPagerAdapter
import kotlinx.android.synthetic.main.layout_cow.*


class pheasant : AppCompatActivity() {

    private val imageUrls = arrayOf(
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Ffazanch.jpg?alt=media&token=4e4f9778-7401-446f-b26b-4d26d2a4b4e1",
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2Fkakaya-poroda-fazanov-samaya-krupnaya-i-kakie-u-nee-osobennosti.jpg?alt=media&token=270cdd85-3f37-4b26-9f03-8acb8754b478",
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2Fgoldenfazan.jpg?alt=media&token=27ab73aa-de2f-416e-82ab-146f302642dc"

    )
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_cow)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val adapter = ViewPagerAdapter(this, imageUrls)
        viewPager.adapter = adapter

        //radioButton1 = findViewById(R.id.radioButton1) as RadioButton




        vopros.setOnClickListener {
            var resID = getResources().getIdentifier("main_2", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        food.setOnClickListener {
            var resID = getResources().getIdentifier("pheasant_food", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        foot.setOnClickListener {
            var resID = getResources().getIdentifier("pheasant_footprint", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        soundpic.setOnClickListener {
            var resID = getResources().getIdentifier("pheasant", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }




        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            if(checkedId ==R.id.radioFoot) {

                foot.visibility = (View.VISIBLE)
                food.visibility = (View.GONE)
                soundpic.visibility = (View.GONE)
                viewPager.visibility = (View.GONE)
            }
            else if(checkedId ==R.id.radioFood) {

                food.visibility = (View.VISIBLE)
                foot.visibility = (View.GONE)
                soundpic.visibility = (View.GONE)
                viewPager.visibility = (View.GONE)
            }
            else if(checkedId ==R.id.radioSound) {

                soundpic.visibility = (View.VISIBLE)
                food.visibility = (View.GONE)
                foot.visibility = (View.GONE)
                viewPager.visibility = (View.GONE)
            }
            else if(checkedId ==R.id.radioFace) {

                soundpic.visibility = (View.GONE)
                food.visibility = (View.GONE)
                foot.visibility = (View.GONE)
                viewPager.visibility = (View.VISIBLE)
            }
        }





        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/food%2FChicken_food.png?alt=media&token=b8c75604-5dea-4211-aea5-d3c2f9657a66").into(food);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/footprints%2Ffazanfoot.png?alt=media&token=cb92c686-78f9-4755-8067-03817e9e1c96").into(foot);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/soundpick%2Ffazan_soundpic.png?alt=media&token=910c7923-2919-4cc1-a33d-3576df49bd9f").into(soundpic);

        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fvopros.png?alt=media&token=87701bbc-0ed0-4948-8b23-0f4f8ca16139").into(vopros);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Farrow.png?alt=media&token=9a717b8e-6fe6-4c31-93cc-34226ae9339c").into(arrow);
        //Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fexam.png?alt=media&token=0ced259f-6630-4f36-a647-b07e71704d9f").into(exam);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fleft.png?alt=media&token=0c6e6294-0f43-47db-ad38-fcb226d7b321").into(left);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fright.png?alt=media&token=83571402-29e3-4e71-b55f-dbf266cf50e3").into(right);
    }

    fun rideOnMe(view: View) {
        val rideIntent = Intent(this, MainActivity_3::class.java)
        startActivity(rideIntent)
    }



}