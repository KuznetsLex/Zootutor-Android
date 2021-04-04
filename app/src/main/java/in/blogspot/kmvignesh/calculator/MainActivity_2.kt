package `in`.blogspot.kmvignesh.calculator

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.tutorialwing.scrollview.*
import kotlinx.android.synthetic.main.activity_main.arrow
import kotlinx.android.synthetic.main.activity_main.vopros
import kotlinx.android.synthetic.main.activity_main_2.*

class MainActivity_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)

        vopros.setOnClickListener {
            var resID = getResources().getIdentifier("main", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }


        arrow.setOnClickListener{
            val randomIntent = Intent(this, MainMenu::class.java)
            startActivity(randomIntent)
        }



        pauk.setOnClickListener {
            var resID = getResources().getIdentifier("this_spider", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, spider::class.java)
            startActivity(randomIntent)
        }


        klop.setOnClickListener {
            var resID = getResources().getIdentifier("this_chinch", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, chinch::class.java)
            startActivity(randomIntent)
        }

        babochka.setOnClickListener {
            var resID = getResources().getIdentifier("this_butterfly", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, butterfly::class.java)
            startActivity(randomIntent)
        }

        pchela.setOnClickListener {
            var resID = getResources().getIdentifier("this_bee", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, bee::class.java)
            startActivity(randomIntent)
        }

        strekoza.setOnClickListener {
            var resID = getResources().getIdentifier("this_dragonfly", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, dragonfly::class.java)
            startActivity(randomIntent)
        }

        korovka.setOnClickListener {
            var resID = getResources().getIdentifier("this_ladybug", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, ladybug::class.java)
            startActivity(randomIntent)
        }





        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fspider.png?alt=media&token=75856521-6df2-460d-86e5-1b3caff39443").into(pauk);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fclop.png?alt=media&token=0b19bf49-b35c-47a6-99bb-3c50ead85a79").into(klop);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fbutterfly.png?alt=media&token=b3a0540b-5d7a-4150-a628-7d4f7cad0b8d").into(babochka);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fbee.png?alt=media&token=98ae8fae-3c95-457e-85a6-c2db591070c2").into(pchela);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fgodcow.png?alt=media&token=3ae49201-2131-4b37-a9da-9c39e30a8569").into(korovka);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fdragonfly.png?alt=media&token=b3b7951c-39af-4869-a0b1-7eed2c41009d").into(strekoza);

        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fvopros.png?alt=media&token=87701bbc-0ed0-4948-8b23-0f4f8ca16139").into(vopros);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Farrow.png?alt=media&token=9a717b8e-6fe6-4c31-93cc-34226ae9339c").into(arrow);
        //Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fexam.png?alt=media&token=dabedfa3-91fb-4326-bf84-886e212a611a").into(exam);
    }



}
