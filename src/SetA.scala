object SetA {
  def main(args: Array[String]): Unit = {
    val nums: List[Int] = List(1, 2, 3, 4)
    val lastnumber = nums.last
    println("A "+lastnumber)
    
    def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }
    println("B " +lastRecursive(nums))
  
    def last_a(L:List[Int]) = L(L.size-1)
    println("C " +last_a(nums))
    
    
    
  }
  

}