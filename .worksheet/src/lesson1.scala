object lesson1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  println("Welcome to the Scala worksheet");$skip(8); val res$0 = 
  8 + 5;System.out.println("""res0: Int(13) = """ + $show(res$0));$skip(12); val res$1 = 
  8 * 5 + 2;System.out.println("""res1: Int = """ + $show(res$1));$skip(17); 
  val ans = 8+ 1;System.out.println("""ans  : Int = """ + $show(ans ));$skip(6); val res$2 = 
  ans;System.out.println("""res2: Int = """ + $show(res$2));$skip(51); 
  // ans = 32
  // val is immutable
  var res = 12;System.out.println("""res  : Int = """ + $show(res ));$skip(11); 
  res = 43;$skip(6); val res$3 = 
  res;System.out.println("""res3: Int = """ + $show(res$3));$skip(51); 
  // var can be changed
  var greet: String = null;System.out.println("""greet  : String = """ + $show(greet ));$skip(16); 
  greet = "bye";$skip(96); val res$4 = 
  // Use val as often as possible
  // Int double byte Char Short Long Float Boolean
  1.to(10);System.out.println("""res4: scala.collection.immutable.Range.Inclusive = """ + $show(res$4));$skip(29); val res$5 = 
  "Hello".intersect("World");System.out.println("""res5: String = """ + $show(res$5));$skip(26); 
  val x : BigInt = 123542;System.out.println("""x  : BigInt = """ + $show(x ));$skip(8); val res$6 = 
  x*x*x;System.out.println("""res6: scala.math.BigInt = """ + $show(res$6));$skip(10); val res$7 = 
  1 to 10;System.out.println("""res7: scala.collection.immutable.Range.Inclusive = """ + $show(res$7));$skip(23); 
  val result = 1.+(10)
  
  // Scala has functiona and methods
  import scala.math._;System.out.println("""result  : Int = """ + $show(result ));$skip(72); val res$8 = 
  sqrt(2);System.out.println("""res8: Double = """ + $show(res$8));$skip(22); val res$9 = 
  
  "Hello".distinct;System.out.println("""res9: String = """ + $show(res$9));$skip(17); val res$10 = 
  "Hello".length;System.out.println("""res10: Int = """ + $show(res$10));$skip(19); val res$11 = 
  "Hello".apply(4);System.out.println("""res11: Char = """ + $show(res$11));$skip(58); 
  // () is only required for mutators
  val b:BigInt = 21;System.out.println("""b  : scala.math.BigInt = """ + $show(b ));$skip(13); val res$12 = 
 	b.pow(100);System.out.println("""res12: scala.math.BigInt = """ + $show(res$12));$skip(24); val res$13 = 
  sqrt(10)   * sqrt(10);System.out.println("""res13: Double = """ + $show(res$13));$skip(11); val res$14 = 
  1.to(10);System.out.println("""res14: scala.collection.immutable.Range.Inclusive = """ + $show(res$14));$skip(24); val res$15 = 
  1.to(10).map(sqrt(_));System.out.println("""res15: scala.collection.immutable.IndexedSeq[Double] = """ + $show(res$15));$skip(9); val res$16 = 
  6.*(7);System.out.println("""res16: Int(42) = """ + $show(res$16));$skip(29); val res$17 = 
  "bda".permutations.toArray;System.out.println("""res17: Array[String] = """ + $show(res$17));$skip(12); val res$18 = 
  "ABC".sum;System.out.println("""res18: Char = """ + $show(res$18));$skip(14); val res$19 = 
  "A"+"B"+"C";System.out.println("""res19: String = """ + $show(res$19));$skip(16); val res$20 = 
  ("A"+"B"+"C");System.out.println("""res20: String = """ + $show(res$20))}
}
