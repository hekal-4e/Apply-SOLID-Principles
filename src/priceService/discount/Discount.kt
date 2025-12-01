package priceService.discount

interface Discount {
    fun applyDiscount(price: Double): Double
}