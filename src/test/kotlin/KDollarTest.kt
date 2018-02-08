import junit.framework.Assert.assertEquals
import org.junit.Test

class KDollarTest {
    @Test
    fun test_times() {
        val five = KDollar(5)
        var prod = five.times(2)
        assertEquals(10, prod.amount)
        prod = five.times(3)
        assertEquals(15, prod.amount)
    }
}