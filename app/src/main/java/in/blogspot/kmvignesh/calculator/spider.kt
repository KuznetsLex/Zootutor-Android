package com.tutorialwing.scrollview


import `in`.blogspot.kmvignesh.calculator.MainActivity_2
import `in`.blogspot.kmvignesh.calculator.R
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
import com.codinginflow.picassoimagesliderexample.ViewPagerAdapter
import kotlinx.android.synthetic.main.layout_cow.arrow
import kotlinx.android.synthetic.main.layout_cow.food
import kotlinx.android.synthetic.main.layout_cow.left
import kotlinx.android.synthetic.main.layout_cow.radioGroup
import kotlinx.android.synthetic.main.layout_cow.right
import kotlinx.android.synthetic.main.layout_cow.vopros
import kotlinx.android.synthetic.main.layout_insect.*


class spider : AppCompatActivity() {

    private val imageUrls = arrayOf(
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fpauk.jpg?alt=media&token=fad7b4d0-3e68-42a2-b60c-5a6d086c9501",
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2F4-35_block.jpg?alt=media&token=28300c85-1238-46cb-989c-6a7bdf7ea69b",
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2Fspidernexus.jpg?alt=media&token=774049a0-22f0-4241-8daa-3a00c19101e4"
    )
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_insect)

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
            var resID = getResources().getIdentifier("spider_food", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        vopros1.setOnClickListener {
            var resID = getResources().getIdentifier("spider_1", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        vopros2.setOnClickListener {
            var resID = getResources().getIdentifier("spider_2", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }




        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            if(checkedId ==R.id.radioFood) {

                food.visibility = (View.VISIBLE)
                vopros1.visibility = (View.GONE)
                vopros2.visibility = (View.GONE)
                viewPager.visibility = (View.GONE)
            }
            else if(checkedId ==R.id.radioFace) {

                viewPager.visibility = (View.VISIBLE)
                food.visibility = (View.GONE)
                vopros1.visibility = (View.GONE)
                vopros2.visibility = (View.GONE)
            }
            else if(checkedId ==R.id.radioVopros1) {

                vopros1.visibility = (View.VISIBLE)
                food.visibility = (View.GONE)
                vopros2.visibility = (View.GONE)
                viewPager.visibility = (View.GONE)
            }
            else if(checkedId ==R.id.radioVopros2) {

                vopros2.visibility = (View.VISIBLE)
                food.visibility = (View.GONE)
                vopros1.visibility = (View.GONE)
                viewPager.visibility = (View.GONE)
            }
        }





        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/food%2F147164986013185423.jpg?alt=media&token=dec88836-4c9b-47a7-9c28-ce5bb571a38c").into(food);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2Ffb63f39c04bae45a96e897fdcea6aeed.jpg?alt=media&token=8613ae4a-9581-493d-b209-a02fcf353d56").into(vopros1);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2Fspid.jpg?alt=media&token=6393f610-7d3f-4819-aff8-5006951e1b7f").into(vopros2);

        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fvopros.png?alt=media&token=87701bbc-0ed0-4948-8b23-0f4f8ca16139").into(vopros);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Farrow.png?alt=media&token=9a717b8e-6fe6-4c31-93cc-34226ae9339c").into(arrow);
        //Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fexam.png?alt=media&token=0ced259f-6630-4f36-a647-b07e71704d9f").into(exam);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fleft.png?alt=media&token=0c6e6294-0f43-47db-ad38-fcb226d7b321").into(left);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fright.png?alt=media&token=83571402-29e3-4e71-b55f-dbf266cf50e3").into(right);
    }

    fun rideOnMe(view: View) {
        val rideIntent = Intent(this, MainActivity_2::class.java)
        startActivity(rideIntent)
    }



}