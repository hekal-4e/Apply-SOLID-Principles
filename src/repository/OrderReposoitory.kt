package repository

import model.Order

class OrderRepository() {
    fun saveOrder(order: Order) {
        println("Saving order to database...")
        println("Saved successfully")
    }
}