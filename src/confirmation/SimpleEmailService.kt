package confirmation

import model.Order

class SimpleEmailService : EmailService {
    override fun send(order: Order) {
        println("Sending order confirmation email to ${order.userEmail}")
        println("Email sent!")
    }
}