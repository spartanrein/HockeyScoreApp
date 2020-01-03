package android.example.hockeyscoreapp

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

class TeamTest {

    private val team: Team = Team()

    @Test
    fun `should increment shots to 1`() {
        team.incrementStat(Team.Stat.SHOTS)
        assertEquals(1,team.shots)
    }

    @Test
    fun `should increment shots to 2`() {
        println(team.shots)
        team.incrementStat(Team.Stat.SHOTS)
        team.incrementStat(Team.Stat.SHOTS)
        assertEquals(2,team.shots)
    }
}
