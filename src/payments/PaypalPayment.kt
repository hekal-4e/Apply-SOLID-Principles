package payments

import model.Order

class PaypalPayment: Payment {
    override fun pay(order: Order) {
        println("Processing paypal payment")
    }
}