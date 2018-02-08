
class KDollar constructor(amount:Int){
    val amount = amount

    fun times(times:Int):KDollar {
        return KDollar(amount * times)
    }

}