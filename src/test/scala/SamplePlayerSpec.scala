import org.specs2.mutable.Specification

class SamplePlayerSpec extends Specification {

  "getInformation" should {
    "return information contains name" in {
      val samplePlayer= new SamplePlayer("sc",3)
      samplePlayer.getInformation must contain("sc")
    }



  }


}