package model

data class Order(
    val items: List<String>,
    val userEmail: String,
    val amount: Int
)
