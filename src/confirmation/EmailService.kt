package confirmation

import model.Order

interface EmailService {
    fun send(order: Order)
}