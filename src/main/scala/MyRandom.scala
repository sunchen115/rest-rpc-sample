/**
 * Created by csun on 8/4/15.
 */

import util.Random

object MyRandom {

  def getRandInt(high: Int): Int = {
    val r = Random
    return r.nextInt(high)
  }

  def getRandIntBetween(low:Int, high:Int): Int={
    if (low >= high ) throw new IllegalArgumentException
    var r = getRandInt(high)
    while (r < low) {
      r  = getRandInt(high)
    }
    return r

  }

}

//object  Main extends App{
//  println(MyRandom.getRandInt(10))
//  println(MyRandom.getRandIntBetween(50,60))
//}