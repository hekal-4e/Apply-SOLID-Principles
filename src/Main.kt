import confirmation.SimpleEmailService
import model.Order
import orderReceipt.OrderReceipt
import payments.VisaPayment
import priceService.DefaultPriceCalculator
import priceService.discount.NormalDiscount
import repository.OrderRepository
import validation.OrderValidation


fun main() {
    val order = Order(listOf("Phone"), "test@mail.com", 200)

    val orderManager = OrderManager(
        OrderRepository(),
        VisaPayment(),
        SimpleEmailService(),
        OrderValidation(),
        DefaultPriceCalculator(),
        NormalDiscount(),
        OrderReceipt()
    )

    orderManager.placeOrder(order)
}