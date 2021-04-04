package `in`.blogspot.kmvignesh.calculator

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main_menu.*

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fplay_animal.png?alt=media&token=589af385-c90a-40e1-837f-91fc6c6d55ab").into(farm);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fplay_duck.png?alt=media&token=e3cfa6c5-c353-4970-b8d2-2e7f57238382").into(ptich);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fplay_insect.png?alt=media&token=1cf923d2-0d5d-40d8-ad91-aeb098d5a3c1").into(insect);
        //Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fexam.png?alt=media&token=0ced259f-6630-4f36-a647-b07e71704d9f").into(exam);
    }
    fun takeOnMe(view: View) {
        val randomIntent = Intent(this, MainActivity::class.java)
        startActivity(randomIntent)
    }

    fun takeOnBird(view: View) {
        val randomIntent = Intent(this, MainActivity_3::class.java)
        startActivity(randomIntent)
    }

    fun takeOnBug(view: View) {
        val randomIntent = Intent(this, MainActivity_2::class.java)
        startActivity(randomIntent)
    }
}