class AmusementParkData {
  fun main() : Int {
    var attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
    attendance.put("26 Sept", 2369)
    val peopleAttended = attendance.getValue("25 Sept") + attendance.getValue("26 Sept")

    return peopleAttended
  }
}
