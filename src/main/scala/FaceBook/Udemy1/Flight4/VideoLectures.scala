package FaceBook.Udemy1.Flight4

/**
  * Created by kalit_000 on 4/29/17.
  */

class ChecksumAccumulator {

  private var sum=0

  def add(b:Byte):Unit ={
    sum +=b
  }

  def checksum():Int ={
    return ~(sum & 0xFF) + 1
  }
}

object VideoLectures {

  def main(args: Array[String]): Unit = {



  }



}
