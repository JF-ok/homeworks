package example.jf.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/*  О, рассмейтесь, смехачи!
    О, засмейтесь, смехачи!
    Что смеются смехами, что смеянствуют смеяльно,
    О, засмейтесь усмеяльно!
    О, рассмешищ надсмеяльных — смех усмейных смехачей!
    О, иссмейся рассмеяльно, смех надсмейных смеячей!
    Смейево, смейево!
    Усмей, осмей, смешики, смешики!
    Смеюнчики, смеюнчики.
    О, рассмейтесь, смехачи!
    О, засмейтесь, смехачи! */

const val TAG="MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"О, рассмейтесь, смехачи!\n" +
                "О, засмейтесь, смехачи!")
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG,"Что смеются смехами, что смеянствуют смеяльно,\n" +
                "О, засмейтесь усмеяльно!")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG,"О, рассмешищ надсмеяльных — смех усмейных смехачей!")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG,"О, иссмейся рассмеяльно, смех надсмейных смеячей!\n")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG,"Смейево, смейево!\n" +
                "Усмей, осмей, смешики, смешики!")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG,"Смеюнчики, смеюнчики.")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG,"О, рассмейтесь, смехачи!\n" +
                "О, засмейтесь, смехачи!")
    }
}