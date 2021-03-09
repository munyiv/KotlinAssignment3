fun main() {
    school()
    Intro("Audrey",19)

    var results=message("i live in Nakuru")
    println(results.length)

   name("Audrey")
    name("Dennis")








}
fun school() {
    val a="AkiraChix"
    print(a[0])
    print(a[2])
    print(a[3])


}
fun Intro(name:String,age:Int) {
    println("Hi, my name is $name and i am $age years old.")

}
fun message(text:String):String {
    return text

}
fun name(name: String) {
    if (name=="Audrey"){
        println("Thats me!")
    }else {
        println("I dont know who that is")
    }
}









