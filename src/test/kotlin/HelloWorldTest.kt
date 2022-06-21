import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class HelloWorldTest : StringSpec ({
  "Test" {
      var obj = HelloWorld()
      obj.main() shouldBe ("Hello World")
  }
})

