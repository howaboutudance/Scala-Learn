package tech.hematite.scalaBook

class Rational(n: Int, d: Int){
    require(d != 0)

    private val g = gcd(n.abs, d.abs)
    val numerator = n / g
    val denom = d / g

    def this(n: Int)  =  this(n, 1)

    override def toString(): String ={ s"${numerator}/${denom}" }

    def + (that: Rational): Rational = {
        new Rational(
            numerator * that.denom + that.numerator * denom,
            this.denom * that.denom
        )
    }

    def - (that: Rational): Rational = {
        this + that.negate()
    }

    def * (that: Rational): Rational = {
        new Rational(
            this.numerator * that.numerator,
            this.denom * that.denom
        )
    }

    def / (that: Rational): Rational = {
        this * that.recip()
    }

    private  def recip(): Rational = {
        new  Rational(
            this.denom,
            this.numerator
        )
    }

    private def negate(): Rational = {
        new Rational(
            -this.numerator,
            this.denom
        )
    }
    private def gcd(a: Int, b: Int): Int = {
        if(b == 0) a else gcd(b, a % b)
    }
}


object Chapter6 {
    def runChapter6(){
        val res = new Rational(1, 2)
        println(res)
        assert(res.toString() == "1/2")

        val halfquart = res * (new Rational(1,4))
        println(halfquart)

        println(halfquart / res)

        println(new Rational(1,1) - halfquart)
    }
}