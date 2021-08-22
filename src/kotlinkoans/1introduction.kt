package kotlinkoans

fun Shop.getSetOfCustomers(): Set<Customer> =
    this.customers.toSet()
