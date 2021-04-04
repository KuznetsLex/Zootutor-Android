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


class bee : AppCompatActivity() {

    private val imageUrls = arrayOf(
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fbee.jpg?alt=media&token=c9c19e8c-7916-4dd4-aad9-79b29f001c3b",
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2F35bb30b015f2f9324d5366da015365b6.jpg?alt=media&token=55770f38-5819-42f1-b6fc-1a733c591e57",
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2Funnamed%20(2).jpg?alt=media&token=f1bec9f8-11da-47cd-8841-ad2cca7d3f86"
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
            var resID = getResources().getIdentifier("bee_food", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        vopros1.setOnClickListener {
            var resID = getResources().getIdentifier("bee_1", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        vopros2.setOnClickListener {
            var resID = getResources().getIdentifier("bee_2", "raw", getPackageName())
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





        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/food%2Funnamed%20(3).jpg?alt=media&token=90b06d34-1344-4f77-a75f-691be15ed2a0").into(food);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/footprints%2Fuley.jpg?alt=media&token=3e3e600a-2738-4f65-b568-7d856befc3dc").into(vopros1);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/footprints%2Fuley2.jpeg?alt=media&token=40bb6b7d-d550-49bf-a42c-d3b981d99bd0").into(vopros2);

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