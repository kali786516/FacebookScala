package FaceBook.Udemy1.Flight4

/**
  * Created by kalit_000 on 4/29/17.
  */
class Rational(n:Int,d:Int) {
  require(d != 0 , "zero denominator")

   val numer:Int=n
   val denom:Int=d

  override def toString: String = n + "/" + d
  def add(that:Rational):Rational =
  new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
}