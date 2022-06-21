import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.collections.shouldNotContain

class RemoveItemsTest : ShouldSpec({
    val obj = RemoveItems()
    val removedItems = listOf("pen", "paper", "mug", "phone")
    should("Removing Items") {
        obj.main() shouldNotContain (removedItems)
    }

})
