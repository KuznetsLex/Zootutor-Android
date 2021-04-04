package `in`.blogspot.kmvignesh.calculator

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.tutorialwing.scrollview.*
import kotlinx.android.synthetic.main.activity_main.arrow
import kotlinx.android.synthetic.main.activity_main.vopros
import kotlinx.android.synthetic.main.activity_main_3.*

class MainActivity_3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_3)

        vopros.setOnClickListener {
            var resID = getResources().getIdentifier("main", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }


        arrow.setOnClickListener{
            val randomIntent = Intent(this, MainMenu::class.java)
            startActivity(randomIntent)
        }


        induck.setOnClickListener {
            var resID = getResources().getIdentifier("this_turkey", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, turkey::class.java)
            startActivity(randomIntent)
        }


        fazan.setOnClickListener {
            var resID = getResources().getIdentifier("this_pheasant", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, pheasant::class.java)
            startActivity(randomIntent)
        }

        petuh.setOnClickListener {
            var resID = getResources().getIdentifier("this_chicken", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, chicken::class.java)
            startActivity(randomIntent)
        }

        utka.setOnClickListener {
            var resID = getResources().getIdentifier("this_duck", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, duck::class.java)
            startActivity(randomIntent)
        }

        goose.setOnClickListener {
            var resID = getResources().getIdentifier("this_goose", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, goos::class.java)
            startActivity(randomIntent)
        }



        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Finduck.png?alt=media&token=544dd9fe-c7df-4e2f-95bd-d80a46964ed8").into(induck);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Ffazan.png?alt=media&token=3e44a9f0-764c-43b7-931a-0fb6eb1172e4").into(fazan);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fchickenpetux.png?alt=media&token=94f2afba-4a6d-4c90-ac16-428de0946810").into(petuh);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fduck.png?alt=media&token=21abdcf0-3a60-4817-82fc-c452d0784b06").into(utka);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fgoose.png?alt=media&token=66da773b-3502-4bd3-84f0-52b74573b791").into(goose);

        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fvopros.png?alt=media&token=87701bbc-0ed0-4948-8b23-0f4f8ca16139").into(vopros);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Farrow.png?alt=media&token=9a717b8e-6fe6-4c31-93cc-34226ae9339c").into(arrow);
        //Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fexam.png?alt=media&token=dabedfa3-91fb-4326-bf84-886e212a611a").into(exam);
    }
}
