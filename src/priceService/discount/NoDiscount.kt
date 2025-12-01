package priceService.discount

class NoDiscount : Discount {
    override fun applyDiscount(price: Double): Double = price
}