
case class SDollar(amount: Double) {
  def times(times: Int): SDollar = {
    SDollar(amount * times)
  }

  override def equals(obj: Any): Boolean = {
    obj match {
      case dollar: SDollar => dollar.amount == amount
      case _ => false
    }
  }
}
