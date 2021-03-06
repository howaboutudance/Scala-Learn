package tech.hematite.scalaBook

object Chapter5 {
    private val strDecimal = 1.0
    private val strExample = "StrDecimal"

    def runChapter5(): Unit = {
        // String & Character Literals
        characterLiterals()
        stringLiterals()
        stringInterpolation()

        // operator eqilvancy  that foo.bar(0) is equiv to foo bar 0
        operatorEquilvancy()
        implictConversion()
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
    }

    private def stringInterpolation(): Unit = {
        val symIdent = 'Identity
        // using string interpolation
        println(s"${strExample}")

        // using string format interpoliation
        println(f"$strExample\t$strDecimal.8")

        //using an identfier
        println(f"$symIdent")
    }

    private def operatorEquilvancy(): Unit = {
        val valArray: Array[Int] = Array(1, 2, 3)
        if(valArray.indexOf(3) >= 0){
            println("index found")
        } else {
            println("index not found")
        }

        if((valArray indexOf 3) >= 0 ){
            println(s"index found in op notation: ${valArray indexOf 3}")
        }
    }

    private def implictConversion(): Unit = {
        println(0 max 5)
        println(0 min 5)
        println("bob".capitalize)

        println(4 to 6)

        // rich wrappers
        // each base type has a corresponding documentation of a rich wrapper

        //contains for stringops
        if(strExample contains 'c'){
            println("found c")
        }

        
    }
}