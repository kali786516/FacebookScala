package FaceBook.Udemy1.scalaalgo

/**
  * Created by kalit_000 on 4/29/17.
  */
object ScalaAlgo {

  def main(args: Array[String]): Unit = {

    val data=List(1,2,3,4,5,7,7,7,8,9,9,9,9,9)

    println(data.groupBy(identity).maxBy(x => x._2.size)._1)





  }



}
