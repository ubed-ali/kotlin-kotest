import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class TypeConversionTest : StringSpec({
    "Test" {
        val obj = TypeConversion()
        val number = 20.09090.toDouble()
        val pi = 3.14159
        val result = number * pi
        obj.main() shouldBe(result::class.java)
    }
})
