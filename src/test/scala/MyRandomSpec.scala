import org.specs2.mutable.Specification

class MyRandomSpec extends Specification {

  "getRandIntBetween" should {
    "return random int between low and high" in {
//      5 must beBetween(3, 6)
      MyRandom.getRandIntBetween(10,50) must beBetween(10, 50)

    }

    "throw exception when low more than high" in {
      MyRandom.getRandIntBetween(5,1) must throwA[IllegalArgumentException]
    }

  }
  "getRandInt" should {
    "return random int less than high" in {
      MyRandom.getRandInt(3) must beLessThan(3)
    }

  }

}