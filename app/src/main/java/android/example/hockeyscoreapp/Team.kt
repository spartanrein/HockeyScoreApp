package android.example.hockeyscoreapp

class Team {

    var shots = 0
    var goals = 0
    var missed = 0
    var blocked = 0

    enum class Stat {
        SHOTS, GOALS, MISSED, BLOCKED
    }

    fun incrementStat(stat :Stat) {
        when(stat) {
            Stat.GOALS -> goals++
            Stat.MISSED -> missed++
            Stat.BLOCKED -> blocked++
        }
        shots++
    }
}
