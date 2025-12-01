package validation

import model.Order

class OrderValidation {
    fun validate(order: Order): Boolean {
        return order.items.isNotEmpty() && order.amount > 0
                && order.userEmail.isNotBlank() && order.userEmail.contains("@")
    }
}