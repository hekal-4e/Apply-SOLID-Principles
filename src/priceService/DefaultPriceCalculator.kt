package priceService

import model.Order
import java.awt.MenuItem

class DefaultPriceCalculator: PriceCalculator {
    override fun calculate(order: Order): Double {
        var total = 0.0
        for (item in order.items)
            total += getItemPrice(item)

        return total
    }

    private fun getItemPrice(item: String): Double{
        return when (item) {
            "Laptop" -> 1200.0
            "Phone" -> 800.0
            "TV" -> 600.0
            else -> 10.0
        }
    }
}