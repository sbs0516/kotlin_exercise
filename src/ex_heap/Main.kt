package ex_heap

fun main() {
    val product:Product
    product=createProduct()
    printProductInfo(product)
    processProduct(product)
    printProductInfo(product)

}
fun createProduct():Product{
    val apple=Product()
    apple.name="Apple"
    apple.price=1000
    return apple
}
fun processProduct(product: Product){
    product.price+=500
}
fun printProductInfo(product: Product){
    println(product.name)
    println(product.price)
}