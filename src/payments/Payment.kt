package payments

import model.Order

interface Payment {
    fun pay(order: Order)
}