fun println(arr: ArrayList<Int>) {
    for (i in 0 until arr.getSize()) {
        print(arr[i])
        print(' ')
    }
    println()
}

fun main(args: Array<String>) {
    val arr = ArrayList<Int>();
    println("Buffer size: " + arr.getBufferSize())
    for (i in 0 until 10) {
        arr.add(i)
    }
    println("Buffer size: " + arr.getBufferSize())
    println(arr)
    arr.delete(7);
    arr.insert(100, 5)
    println(arr)
}