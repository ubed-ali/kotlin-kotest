import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe


internal class bunnyTest : StringSpec({
    "Test1" {
        var obj = bunny()
        var line1 = "(\\(\\"
        var line2 = "(-.-)"
        var line3 = "o_(\")(\")"
        var bunny = line1 + "\n" + line2 + "\n" + line3

        obj.main() shouldBe(bunny)
    }

})