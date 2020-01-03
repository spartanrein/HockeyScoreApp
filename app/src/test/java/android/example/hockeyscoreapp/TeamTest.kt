package android.example.hockeyscoreapp

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

class TeamTest {

    private val team: Team = Team()

    @Test
    fun `should increment goals, missed, and blocked to 1, and shots to 3`() {
        team.incrementStat(Team.Stat.GOALS)
        team.incrementStat(Team.Stat.MISSED)
        team.incrementStat(Team.Stat.BLOCKED)
        assertEquals(1,team.goals)
        assertEquals(1,team.missed)
        assertEquals(1,team.blocked)
        assertEquals(3,team.shots)

    }
}
