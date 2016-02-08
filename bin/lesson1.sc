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
  "Hello".apply(4)                                //> res11: Char = o
  // () is only required for mutators
  val b:BigInt = 21                               //> b  : scala.math.BigInt = 21
 	b.pow(100)                                //> res12: scala.math.BigInt = 1666976484396337359195972108050766529167300667828
                                                  //| 9510143313654693621330290703278666330330646324269063809009180450962126312063
                                                  //| 55582001
  sqrt(10)   * sqrt(10)                           //> res13: Double = 10.000000000000002
  1.to(10)                                        //> res14: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 
                                                  //| 7, 8, 9, 10)
  1.to(10).map(sqrt(_))                           //> res15: scala.collection.immutable.IndexedSeq[Double] = Vector(1.0, 1.4142135
                                                  //| 623730951, 1.7320508075688772, 2.0, 2.23606797749979, 2.449489742783178, 2.6
                                                  //| 457513110645907, 2.8284271247461903, 3.0, 3.1622776601683795)
  6.*(7)                                          //> res16: Int(42) = 42
  "bda".permutations.toArray                      //> res17: Array[String] = Array(bda, bad, dba, dab, abd, adb)
  "ABC".sum                                       //> res18: Char = Æ
  "A"+"B"+"C"                                     //> res19: String = ABC
  ("A"+"B"+"C")                                   //> res20: String = ABC
}