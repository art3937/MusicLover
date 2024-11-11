fun main() {
    val purchasePrice = 15000
    val percentTo10000 = 100
    val percentToMore10000 = purchasePrice / 100 * 5
    val regularCustomer = true
    var discountedPrice = 0

    if (purchasePrice in 1001..10000) {
        discountedPrice = purchasePrice - percentTo10000
    } else if (purchasePrice > 1000) {
        discountedPrice = purchasePrice - percentToMore10000
    }

    val discountToRegularCustomer = discountedPrice - discountedPrice / 100 * 1
    discountedPrice = if (regularCustomer) discountToRegularCustomer
    else discountedPrice

    println(discountedPrice)
}