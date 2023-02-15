import java.awt.SystemColor.text

fun main() {
    campus()
    var X= sentence("Mary",45)
    length()
    interesting()


}
fun campus() {
    var campus= "akirachix"
    println(campus[0])
    println(campus[2])
    println(campus[3])
}
fun sentence(name:String,age:Int):String{
    var sentence= "Hi,my name is $name and I am $age years old."
    return(sentence)
}
fun length(){
    var text = "beautiful"
    return(println( "The length of the string is" + text.length))
}
fun interesting(){
    val name =("Jemima")
    if( name == "Jemima"){
        println("That's me.")}
        else if (name != "Jemima"){
            println("That's not me.")
    }
     }
