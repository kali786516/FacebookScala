package FaceBook.Udemy1

/**
  * Created by kalit_000 on 4/29/17.
  */
object FunctionsExamples {

  def main(args: Array[String]): Unit = {

    def max(x:Int,y:Int):Int ={
      if (x > y) x else y
    }


    println(max(1,2))

    def greet()=println("Hello World")

    println(greet())


    val data="hi kali how are you"

     for(i <- data.split(" ")){
       println(i)
     }

    data.foreach(x => println(x))


  }


}
