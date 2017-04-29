package FaceBook.Udemy1.Flight3

/**
  * Created by kalit_000 on 4/29/17.
  */
object Excercise {

  def main(args: Array[String]): Unit = {

    var test=List(1,2,3,4,5)

    def sumList(x:List[Int]):Int ={
      x match {
        case head::tail => head + sumList(tail)
        case Nil => 0
      }
    }

    println(sumList(test))



  }

}
