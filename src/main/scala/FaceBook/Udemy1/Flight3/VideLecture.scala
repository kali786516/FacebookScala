package FaceBook.Udemy1.Flight3
import scala.io.Source


/**
  * Created by kalit_000 on 4/29/17.
  */
object VideLecture {

  def main(args: Array[String]): Unit = {

    val greetstring=new Array[String](3)


    greetstring(0)="Hello"
    greetstring(1)="kali"

    for(i <- 0 until greetstring.length)
      {
        print(greetstring(i))
      }

    greetstring.update(1,"fuck you kali charan")

    greetstring.apply(1)

    val numNames=Array.apply("kali",1,"sri",4.08)

    for( i <- 0 until numNames.length)
      {
        println(numNames(i))

      }

    // concatenating list
    val oneTwo=List(1,2)
    val threeFour=List(3,4)
    val oneTwoThreeFour=oneTwo:::threeFour

    println(oneTwoThreeFour)


    val nums=1::2::3::Nil

    print(nums)

    Array(1,2,3).toList

    List("a","b",1).toArray

    List(1,2,3).toVector

     //tuples
    val mytup=(1,2,3)

    mytup._1
    mytup._2
    mytup._3

    if (args.length > 0){

      for(line <- Source.fromFile(args(0)).getLines())
        {
          println(line.length + " : " + line)
        }
    }
    else Console.err.println("Please enter a filename")





  }


}
