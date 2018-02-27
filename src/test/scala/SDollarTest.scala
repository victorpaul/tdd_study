import org.scalatest.{FreeSpec, Matchers}
import Matchers._

class SDollarTest extends FreeSpec {

  "SDollarTest times" in {
    val five = SDollar(5)

    five.times(2) should equal(SDollar(10))
    five.times(3) should equal(SDollar(15))

  }

}
