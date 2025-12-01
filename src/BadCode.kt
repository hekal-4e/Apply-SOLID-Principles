class BadOrderManager {

    fun validateOrder(order: Order): Boolean {
        if (order.items.isEmpty()) return false
        if (!order.userEmail.contains("@")) return false
        if (order.amount <= 0) return false

        if (order.country != "USA" && order.country != "UK") {
            println("Shipping not supported!")
            return false
        }

        return true
    }

    fun calculatePrice(order: Order): Double {
        var total = 0.0
        for (item in order.items) {
            total += getPrice(item)
        }

        if (order.items.size > 5) {
            total -= 20
        }

        return total
    }

    private fun getPrice(item: String): Double {
        return when(item) {
            "Laptop" -> 1200.0
            "Phone" -> 800.0
            "TV" -> 600.0
            else -> 10.0
        }
    }

    fun saveOrder(order: Order) {
        println("Order saved to SQL database")
    }

    fun sendEmail(order: Order) {
        println("Sending email to ${order.userEmail}")
    }

    fun generateInvoice(order: Order) {
        println("-----------INVOICE------------")
        println("Email: ${order.userEmail}")
        println("Items: ${order.items}")
        println("Amount: ${order.amount}")
        println("------------------------------")
    }

    fun calculateShipping(order: Order) {
        if (order.country == "USA") println("Shipping: free")
        else if (order.country == "UK") println("Shipping: 15$")
        else println("Not supported")
    }

    fun processPayment(order: Order, type: String) {
        if (type == "visa") println("Visa processed")
        else if (type == "paypal") println("Paypal processed")
        else if (type == "cash") println("Cash processed")
    }

    fun placeOrder(order: Order, type: String) {
        if (!validateOrder(order)) {
            println("Order invalid!")
            return
        }

        val total = calculatePrice(order)
        println("Total = $total")

        calculateShipping(order)
        processPayment(order, type)
        sendEmail(order)
        saveOrder(order)
        generateInvoice(order)

        println("Order complete")
    }
}

data class Order(
    val userEmail: String,
    val items: List<String>,
    val amount: Int,
    val country: String
)
