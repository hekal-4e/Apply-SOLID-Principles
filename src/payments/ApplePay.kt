package payments

import model.Order

class ApplePay : Payment {
    override fun pay(order: Order) {
        println("Processing Apple payment")
    }
}