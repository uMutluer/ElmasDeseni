fun main(args: Array<String>) {
    println("Kaç satır çizmek istersiniz?")

    var rows = readLine()!!.toInt()
    for (i in 1..rows) {

        for (j in i..rows) {
            print(" ")
        }
        for (p in 1..i) {
            print("*")
        }
        for (p in 1..i-1) {
            print("*")
        }
        println()
    }
    for (i in 1..rows-1) {

        for (j in 0..i) {
            print(" ")
        }
        for (p in i..rows-2) {
            print("*")
        }
        for (p in i..rows-1) {
            print("*")
        }
        println()
    }

}