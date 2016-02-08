object lesson1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  8 + 5                                           //> res0: Int(13) = 13
  8 * 5 + 2                                       //> res1: Int = 42
  val ans = 8+ 1                                  //> ans  : Int = 9
  ans                                             //> res2: Int = 9
  // ans = 32
  // val is immutable
  var res = 12                                    //> res  : Int = 12
  res = 43
  res                                             //> res3: Int = 43
  // var can be changed
  var greet: String = null                        //> greet  : String = null
  greet = "bye"
  // Use val as often as possible
  // Int double byte Char Short Long Float Boolean
  1.to(10)                                        //> res4: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7
                                                  //| , 8, 9, 10)
  "Hello".intersect("World")                      //> res5: String = lo
  val x : BigInt = 123542                         //> x  : BigInt = 123542
  x*x*x                                           //> res6: scala.math.BigInt = 1885575312136088
  1 to 10                                         //> res7: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7
                                                  //| , 8, 9, 10)
  val result = 1.+(10)                            //> result  : Int = 11
  
  // Scala has functiona and methods
  import scala.math._
  sqrt(2)                                         //> res8: Double = 1.4142135623730951
  
  "Hello".distinct                                //> res9: String = Helo
  "Hello".length                                  //> res10: Int = 5
  // () is only required for mutators
  
}