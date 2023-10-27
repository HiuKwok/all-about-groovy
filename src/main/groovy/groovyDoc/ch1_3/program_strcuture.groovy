package groovyDoc.ch1_3

// Normal import as Java.
import groovy.xml.MarkupBuilder

// One of the interesting property is that Groovy allow dev to rename the import.
import static java.util.Calendar.getInstance as now

class program_strcuture {

    static void main(String[] args) {
        // Following package are imported by default for Groovy by default.
        //        import java.lang.*
        //        import java.util.*
        //        import java.io.*
        //        import java.net.*
        //        import groovy.lang.*
        //        import groovy.util.*
        //        import java.math.BigInteger
        //        import java.math.BigDecimal

        assert now().class == Calendar.getInstance().class
    }
}
