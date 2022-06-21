class AccountBalance {
    fun main() : Double {
        val balance = 21000
        val interestPerYear = (balance/100) * 5.5
        val years = 5
        val interestAmountInXYear = interestPerYear * years
        val totalBalance = balance + interestAmountInXYear

        return totalBalance

    }
}