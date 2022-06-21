import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.collections.shouldBeIn
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldContainAll
import io.kotest.matchers.collections.shouldNotContain
import io.kotest.matchers.shouldBe

class ZooListTest : ShouldSpec({
    val obj = ZooList()
    val compareAnimals = listOf("elephant", "zebra")
    should("Checking Animals") {
        obj.main() shouldContainAll(compareAnimals)
    }

    val comparingMoreAnimals = listOf("monkey", "rhino", "wolf")
    should("Checking Animals 2") {
        obj.main() shouldNotContain(comparingMoreAnimals)
    }

})
