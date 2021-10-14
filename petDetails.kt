package PetHoleBaby

data class PetDetails(val name:String,val sex:String,val age:Int,val color:String)
data class AnimalDetails(val animalIndex:Int,val petDails:PetDetails)