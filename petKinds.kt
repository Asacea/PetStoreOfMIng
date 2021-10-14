package PetHoleBaby

abstract class Dog(var petIndex:Int){
    abstract fun feature()
}
 class Husky(petIndex: Int):Dog(petIndex){
    override fun feature() {
        println("${petIndex}号小动物是一只捣蛋的哈士奇\n")
    }
}
 class Poodle(petIndex: Int):Dog(petIndex){
    override fun feature() {
        println("${petIndex}号小动物是一只可爱的贵宾犬\n")
    }
}