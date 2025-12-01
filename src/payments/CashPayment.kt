package payments

import model.Order

class CashPayment: Payment {
    override fun pay(order: Order) {
        println("Processing Cash payment")
    }
}