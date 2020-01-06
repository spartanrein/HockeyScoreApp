package android.example.hockeyscoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var team1 = Team()
        var team2 = Team()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
