class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
){
    val isPopular: Boolean
    	get() = playCount >= 1000
    
    fun description(){
        println("$title, performed by $artist, was realeased in $yearPublished")
    }
}


fun main() {
    val bad = Song(
        title = "VeLDá",
        artist = "Bad Banney",
        yearPublished = 2025,
        playCount = 846419216
    )
    
    println(bad.isPopular)
    bad.description()
    
}