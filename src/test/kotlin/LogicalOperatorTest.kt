import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.string.shouldBeEqualIgnoringCase

class LogicalOperatorTest : StringSpec({
    "Test" {
        val obj = LogicalOperator()
        val cows = 3
        val milkCows = 1
        val children = 2
        val canGetFunding = ((cows <= 5) && (milkCows > 0)) || (children + 1 >= 3)
        obj.main() shouldBeEqualIgnoringCase("will the farmer receive Funding? $canGetFunding")
    }
})
