import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class ClientBillTest : StringSpec ({
   "Test" {
       var obj = clientBill()
       val clientName = "Mary"
       val totalItem = 3
       val price = 30

        obj.main() shouldBe("Hello $clientName your total amount is ${totalItem * price}")
    }

})