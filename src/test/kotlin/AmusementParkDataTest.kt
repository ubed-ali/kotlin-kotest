import io.kotest.core.spec.style.FunSpec
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.core.spec.style.StringSpec
import io.kotest.engine.launcher.main
import io.kotest.matchers.ints.shouldBeExactly
import io.kotest.matchers.shouldBe

class AmusementParkDataTest : ShouldSpec ({
  val obj = AmusementParkData()
  var attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
  attendance.put("26 Sept", 2369)
  should("Test") {
    obj.main() shouldBeExactly(attendance.getValue("25 Sept") + attendance.getValue("26 Sept"))

  }


})
