package PetHoleBaby

fun AddAnimalList(list:ArrayList<PetDetails>,petDetails: PetDetails) {
    if( petDetails !in list){
        list.add(petDetails)
    }
}
fun <T> UserToPet(read:T,want:List<PetDetails>){
      for(pet in want){
          if(read == pet.age||read==pet.color||read==pet.name||read==pet.sex){
              println(pet)
          }
      }
}

fun main(PSM:Array<String>){

    //重载
    val pet_no1=Husky(1)
    val pet_no2=Poodle(2)
    val listDog= listOf<Dog>(pet_no1,pet_no2)
    for(puppy in listDog){
        puppy.feature()
    }

    //快捷初始化各个小动物的信息，并且排除掉一些重复的情况
    //以下案例初始化所有哈士奇小狗狗的信息
    val listHusky= arrayListOf<PetDetails>()
    val pet_no1_details=PetDetails("Bubu","female",2,"Black and White")
    AddAnimalList(listHusky,pet_no1_details)
    val pet_no2_details=PetDetails("Lily","female",2,"Gery")
    AddAnimalList(listHusky,pet_no2_details)
    val pet_no3_details=PetDetails("Lily","female",2,"Gery")
    AddAnimalList(listHusky,pet_no3_details)
    val pet_no4_details=PetDetails("Tom","male",1,"Yellow")
    AddAnimalList(listHusky,pet_no4_details)

    println("husky小狗狗的信息:")

    for((e,puppy)in listHusky.withIndex()){
        println("${e+1}号：$puppy")
    }

    //第三个问题没太看懂欸，我的理解是通过一个关键词，用户可以搜索到包含该关键词的所有动物的信息
     println("查询到的小动物有：")
    UserToPet(2,listHusky)

}



