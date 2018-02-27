import junit.framework.Assert.assertEquals
import org.junit.Test

class KDollarTest {
    @Test
    fun test_times() {
        val five = KDollar(5)
        assertEquals(KDollar(10), five.times(2))
        assertEquals(KDollar(15), five.times(3))
    }
}