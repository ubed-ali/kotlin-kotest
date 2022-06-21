import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.comparables.shouldBeEqualComparingTo

class AccountBalanceTest : StringSpec ({
    "Test" {
        val obj = AccountBalance()
        val balance = 21000
        val interestPerYear = (balance/100) * 5.5
        val years = 5
        val interestAmountInXYear = interestPerYear * years
        val totalBalance = balance + interestAmountInXYear

        obj.main() shouldBeEqualComparingTo(totalBalance)
    }
})