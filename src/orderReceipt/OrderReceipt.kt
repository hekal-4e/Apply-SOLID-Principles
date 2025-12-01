package orderReceipt

import model.Order

class OrderReceipt {
    fun printOrderReceipt(order: Order) {
        println("------- RECEIPT -------")
        println("User: ${order.userEmail}")
        println("Items: ${order.items}")
        println("Amount: ${order.amount}")
        println("-----------------------")
    }
}