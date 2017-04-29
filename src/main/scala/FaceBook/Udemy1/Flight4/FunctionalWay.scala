package FaceBook.Udemy1.Flight4

import java.io._
import java.net.{MalformedURLException, URL}

/**
  * Created by kalit_000 on 4/29/17.
  */
object FunctionalWay {

  def main(args: Array[String]): Unit = {

    def gcd(x : Long,y: Long): Long={
      if (y == 0) x

      else gcd(y,x%y)
    }

   for (i <- 1 to 4) yield i * i

   for(i <- 1 to 20 by 4) yield  i

   for ( j <- 20 to 1 by 2) yield j

    def fileLines(file: File)={
        scala.io.Source.fromFile(file).getLines().toList
    }

    val filesHere=(new File(".")).listFiles()

    def grep(pattern:String)={
      for (
        file <- filesHere
        if file.getName.endsWith(".scala");
        line <- fileLines(file)
        if line.trim.matches(pattern)
      ) yield (file + ":" + line.trim)
    }

    def half(n:Int):Int={
      require(n % 2 == 0 , "must be even mother fucker")
      n/2
    }

    def urlFor(path:String):URL ={
      try new URL(path)
      catch {
        case e: MalformedURLException => new URL("http://xnxx.com")
      }
    }

    urlFor("nlmnlmnl")

     def matchThis(somestring:String)={

       somestring match {
         case "salt"  => println("salt on sperm")
         case "chips" => println("shit with chips")
         case "Guava" => println("do shit with eating guava")
         case _ => println("just wank")

       }


     }

    val firstargs="hi kali"

    val kalitest=
      firstargs match {
        case "hi kali" => "positive match"
        case "hi sri" => "not a match"
        case _ => "nothing bro"
      }

    // 10 * 10 matrix
     //returns a row as  a sequence
    def makeRowSeq(row:Int): Seq[String]={
      for (col <- 1 to 10) yield f"${row * col}%4d"
    }

    def makRow(row:Int):String =makeRowSeq(row).mkString

    def multiTable(): String ={
      val tableseq=for(row <- 1 to 10) yield makRow(row)
      tableseq.mkString("\n")
    }




  }


}
