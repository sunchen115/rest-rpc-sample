/**
 * Created by csun on 8/4/15.
 */
class SamplePlayer(val name: String, val age: Int) extends Player(name,age){
  def getInformation: String={
    return getFullInfo + MyRandom.getRandInt(age)
  }
}


object  Main extends App{
  val samplePlayer = new SamplePlayer("sc",56)
  println(samplePlayer.getInformation)
}