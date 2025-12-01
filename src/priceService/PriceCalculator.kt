package priceService

import model.Order

interface PriceCalculator {
    fun calculate(order: Order): Double
}