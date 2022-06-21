class RemoveItems {
    fun main() : ArrayList<String> {
        val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
        val removeditems = listOf("pen", "paper", "mug", "phone")
        items.removeAll(removeditems)

        return items
    }
}