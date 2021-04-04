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


class ladybug : AppCompatActivity() {

    private val imageUrls = arrayOf(
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fbojyacorova.jpg?alt=media&token=be3f6b65-8599-480f-bb6f-c2fc5dec28ed",
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2F1575534050_3.jpg?alt=media&token=6f0726c7-d199-4b29-be29-d08b48fd730a",
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2F7b3b3cf67445cc1eac5feae04ab9e32e.jpg?alt=media&token=4082cad7-3639-46cc-bb92-188bd4fc6b58"
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
            var resID = getResources().getIdentifier("ladybug_food", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        vopros1.setOnClickListener {
            var resID = getResources().getIdentifier("ladybug_1", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        vopros2.setOnClickListener {
            var resID = getResources().getIdentifier("ladybug_2", "raw", getPackageName())
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





        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/food%2Fnvk10.png?alt=media&token=de9a87f6-84f5-45c7-b693-da8439157713").into(food);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2Flady.jpg?alt=media&token=306f01a4-25b1-43fb-8a33-73eea39cd711").into(vopros1);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2Fladybug-leaf.jpg?alt=media&token=a18f01ed-b907-4a5f-87b6-ca28681ca4a3").into(vopros2);

        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fvopros.png?alt=media&token=87701bbc-0ed0-4948-8b23-0f4f8ca16139").into(vopros);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Farrow.png?alt=media&token=9a717b8e-6fe6-4c31-93cc-34226ae9339c").into(arrow);
       // Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fexam.png?alt=media&token=0ced259f-6630-4f36-a647-b07e71704d9f").into(exam);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fleft.png?alt=media&token=0c6e6294-0f43-47db-ad38-fcb226d7b321").into(left);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fright.png?alt=media&token=83571402-29e3-4e71-b55f-dbf266cf50e3").into(right);
    }

    fun rideOnMe(view: View) {
        val rideIntent = Intent(this, MainActivity_2::class.java)
        startActivity(rideIntent)
    }



}