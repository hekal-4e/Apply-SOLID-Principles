package priceService.discount

class NormalDiscount: Discount {
    override fun applyDiscount(price: Double): Double = price * 0.9
}