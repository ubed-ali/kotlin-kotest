import io.kotest.core.spec.style.StringSpec
import io.kotest.engine.launcher.main
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain

class purchaseValueTest : StringSpec({
    "Test" {
        val obj = purchaseValue()
        val productPrice = 29.99
        val totalNoOfItems = 3

        obj.main() shouldContain ("${productPrice*totalNoOfItems}")
    }
})
