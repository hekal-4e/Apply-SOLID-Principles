package payments

import model.Order

class VisaPayment: Payment {
    override fun pay(order: Order) {
        println("Processing Visa payment")
    }
}