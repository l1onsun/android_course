class ArrayList<T> {
    private var size: Int = 0
    private var buff_size: Int = 8
    private var buff = arrayOfNulls<Any>(buff_size)

    operator fun get(i: Int): T {
        if (i < 0 || i >= size) {
            throw IndexOutOfBoundsException()
        }
        return buff[i] as T
    }

    private fun increaseBuff() {
        buff_size *= 2
        buff = buff.copyOf(buff_size)
    }

    fun add(value : T) {
        if (size == buff_size)
            increaseBuff()
        buff[size] = value;
        size++;
    }

    fun delete(index: Int) {
        if (index >= buff_size || index < 0){
            throw IndexOutOfBoundsException();
        }

        for (j in index + 1 until size){
            buff[j - 1] = buff[j]
        }

        buff[size - 1] = null
        size--
    }

    fun insert(value: T, index: Int) {
        if (index < 0 || index > size) {
            throw IndexOutOfBoundsException()
        }

        if (buff_size == size) {
            increaseBuff()
        }

        for (j in size downTo index + 1) {
            buff[j] = buff[j - 1]
        }

        buff[index] = value
        size++
    }

    fun getSize(): Int {
        return size
    }

    fun getBufferSize(): Int {
        return buff_size
    }
}