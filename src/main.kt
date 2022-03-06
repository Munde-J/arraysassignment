fun main(){
   places(arrayOf("Kisumu","Nakuru","Maseno","Nairobi"))
    city()
   namba()
   var girls=students(arrayOf("Naima","Tut","Esther") )
   println(girls)
}
fun places(names:Array<String>){
   println(names.contentToString())

}
fun city(){
   var cities = (arrayOf("harare","mumbai","dodoma","jakarta"))
   cities.sortedArray().forEach { joy ->
      println(joy.capitalize())

   }

}
fun namba(){
   var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
   var sum  =numbers[1].plus(numbers[4])
   println(sum)
   var index =numbers.indexOf(158)
   println(index)
   var sortedNums = numbers.sortedArray()
   println(sortedNums.contentToString())


}
fun students(names: Array<String>):String{
   var theirnames =names.contentToString()
   return(theirnames)
}