import io.kotest.core.spec.style.ShouldSpec
import io.kotest.engine.launcher.main
import io.kotest.matchers.shouldBe

class calculateAgeTest : ShouldSpec({
    var obj = calculateAge()
    val currentYear = 2022
    val birthYear = 1999
    val age = currentYear - birthYear

    should("Current Age...") {
        obj.main() shouldBe(age)
    }
})


