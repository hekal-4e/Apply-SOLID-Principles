import confirmation.EmailService
import confirmation.SimpleEmailService
import model.Order
import orderReceipt.OrderReceipt
import payments.Payment
import priceService.PriceCalculator
import priceService.discount.Discount
import repository.OrderRepository
import validation.OrderValidation

class OrderManager(
    private val repository: OrderRepository,
    private val payment: Payment,
    private val emailService: EmailService,
    private val validator: OrderValidation,
    private val priceCalculator: PriceCalculator,
    private val discount: Discount,
    private val receipt: OrderReceipt
) {
    fun placeOrder(order: Order) {
        if (!validator.validate(order)) {
            println("model.Order is not valid!")
            return
        }

        var price = priceCalculator.calculate(order)
        price = discount.applyDiscount(price)
        println("Total price: $price")

        payment.pay(order)
        emailService.send(order)
        repository.saveOrder(order)
        println("model.Order is placed successfully!")
        receipt.printOrderReceipt(order)
    }
}