package tech.hematite.scalaBook

object Chapter5 {
    private val strDecimal = 1.0
    private val strExample = "StrDecimal"
    def runChapter5(): Unit = {
        // String & Character Literals
        characterLiterals()
    }

    private def characterLiterals(): Unit = {
        val a = 'A'
        println(a.getClass())

        val block = '\u25A4'
        println(block)
        println(block.getClass())
    }

    private def stringLiterals(): Unit = {
        // string literals like emoji
        println("👨🏿‍💻")
        println("Chapter 5 complete!")


    }

    private def stringInterpolation(): Unit = {
        val symIdent = 'Identity
        // using string interpolation
        println(s"${strExample}")

        // using string format interpoliation
        println(f"$strExample\t$strDecimal")

        //using an identfier
        println(f"$symIdent")
    }
}