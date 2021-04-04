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


class chicken : AppCompatActivity() {

    private val imageUrls = arrayOf(
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2Fchicken_1.png?alt=media&token=40b09498-0558-4b3a-8ef7-666878c5e889",
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2Fchicken_2.png?alt=media&token=021ed52b-ba92-43f0-a252-7fd8f5e1408c",
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2Fchicken_3.png?alt=media&token=afd7341b-643b-4b28-8a95-b270298aab2a"

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
            var resID = getResources().getIdentifier("chicken_food", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        foot.setOnClickListener {
            var resID = getResources().getIdentifier("chicken_footprint", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        soundpic.setOnClickListener {
            var resID = getResources().getIdentifier("chicken", "raw", getPackageName())
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
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/footprints%2Fchickensteps.jpg?alt=media&token=011ccac9-02b5-4f89-8e1f-8aab1b84c7d0").into(foot);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/soundpick%2FChicken__soundpic.png?alt=media&token=41206a5e-d0ed-462f-8123-f92131e049de").into(soundpic);

        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fvopros.png?alt=media&token=87701bbc-0ed0-4948-8b23-0f4f8ca16139").into(vopros);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Farrow.png?alt=media&token=9a717b8e-6fe6-4c31-93cc-34226ae9339c").into(arrow);

        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fleft.png?alt=media&token=0c6e6294-0f43-47db-ad38-fcb226d7b321").into(left);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fright.png?alt=media&token=83571402-29e3-4e71-b55f-dbf266cf50e3").into(right);
    }

    fun rideOnMe(view: View) {
        val rideIntent = Intent(this, MainActivity_3::class.java)
        startActivity(rideIntent)
    }



}