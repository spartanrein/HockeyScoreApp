package android.example.hockeyscoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var team1 = Team()
        var team1ScoreText = findViewById<TextView>(R.id.team_1_score)
        val team1GoalButton = findViewById<Button>(R.id.Team_1_goal_button)

        team1GoalButton.setOnClickListener {
            buttonClick(team1ScoreText, Team.Stat.GOALS, team1)
        }
    }

    private fun buttonClick(textView: TextView, stat: Team.Stat, team: Team) {
        team.incrementStat(stat)
        textView.text = team.goals.toString()
    }
}
