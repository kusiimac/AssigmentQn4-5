/**
 * A person is moving to his village with a car moving at 20km/h, and he has many alternative routes.
 * If he uses route1, he'll move a distance of 5000km
 * If he uses route2, he'll move a distance of 25000km
 * If he uses route3, he'll move a distance of 50000km
 * If he uses another, he'll move a distance of 10000km
 * Find the time it will take him to reach the village using the separate routes
 * -using a when statement
 */
fun main (){
    // This program will find the tine it takes him to reach the village using separate
    // time = distance/speed
    println("Enter the route to be used")
    val speed = 20
    val route1 = 5000
    val route2 = 25000
    val route3 = 50000
    val another = 10000
    val distance = readln()
    when (distance) {
        "route1" -> {
            val time = route1 / speed
            print("He will take $time hours to reach the village")
        }
        "route2" -> {
            val time = route2 / speed
            print("He will take $time hours to reach the village")
        }
        "route3" -> {
            val time = route3 / speed
            print("He will take $time hours to reach the village")
        }
        else -> {
            val time = another / speed
            print("He will take $time hours to reach the village")
        }
    }
}