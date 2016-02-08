object Set2 {

  /*
    scala> penultimate(List(1, 1, 2, 3, 5, 8))
    res0: Int = 5
   */
  
  def main(args: Array[String]): Unit = {
    def penultimate(L:List[Int]) = L(L.size-2)
    val pen = penultimate(List(1, 1, 2, 3, 5, 8))
    println(pen)
    
    def penultimateRecursive[A](ls: List[A]): A = ls match {
    case h :: _ :: Nil => h
    case _ :: tail     => penultimateRecursive(tail)
    case _             => throw new NoSuchElementException
  }
    
    val a =penultimate(List(1, 1, 2, 3, 5, 8))
    println(a)
  }
}