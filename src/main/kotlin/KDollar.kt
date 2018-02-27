class KDollar constructor(amount: Int) {
    private val amount = amount

    fun times(times: Int): KDollar {
        return KDollar(amount * times)
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is KDollar -> amount == other.amount
            else -> false
        }
    }
}