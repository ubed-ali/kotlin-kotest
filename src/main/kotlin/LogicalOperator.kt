class LogicalOperator {
    fun main() : String {
        val cows = 3
        val milkCows = 1
        val children = 2

        val canGetFunding = ((cows <= 5) && (milkCows > 0) || (children + 1 >= 3))
        return "Will the farmer receive funding? $canGetFunding"
    }
}