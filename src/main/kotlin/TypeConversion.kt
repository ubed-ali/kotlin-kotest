class TypeConversion {
    fun main(): Class<out Double> {
        var number = 20.09090.toDouble()
        var pi = 3.14159
        val result = number * pi
        val resultType = result::class.java
        return resultType
    }
}