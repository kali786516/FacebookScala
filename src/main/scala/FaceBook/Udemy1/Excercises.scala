package FaceBook.Udemy1

import scala.collection.mutable


/**
  * Created by kalit_000 on 4/29/17.
  */
object Excercises {

  def main(args: Array[String]): Unit = {

    // 1
    println("Hello world")

    // 3 print string x times
    def test(a:String,b:Int): Unit = {
      for(i <- 1 to b){
        println(a)
      }
    }

    test("kali",4)

   // 4 reverse string
    def stringarguments(a:String,b:String,c:String): Unit ={
      println(a.reverse)
      println(b.reverse)
      println(c.reverse)

      println((for(i <- a.length - 1 to 0 by -1) yield a(i)).mkString)
      println((for(i <- b.length -1 to 0 by -1) yield b(i)).mkString)

    }

    // 5 argument to upper case
    def uppercase(a:String): Unit ={
        println((for(i <- 0 to a.length-1) yield a(i)).mkString.toUpperCase)
    }

    uppercase("kali")

    stringarguments("hari","sri","tummala")

    val testset=Set(1,"kali","kali")

    println(testset)

    val treasureMap=mutable.Map.empty[Int,String]

    treasureMap += (1 -> "go to island")
    treasureMap += (2 -> "Find big x")

    println(treasureMap(1))

    val romanNumeral=Map(1 -> "I",2 -> "II", 3 -> "III")

    val rn2=Map((1,"2"),(2 -> "3"))

    def printargs(args: Array[String]):Unit ={
      args.foreach(println)

    }


    }


}
