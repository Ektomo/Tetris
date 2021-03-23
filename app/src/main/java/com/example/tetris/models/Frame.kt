package com.example.tetris.models
import com.example.tetris.helper.array2dOfByte

class Frame(private val width: Int) {
    val data: ArrayList<ByteArray> = ArrayList()

    fun addRow(byteStr: String): Frame{
        val row = ByteArray(byteStr.length)

        for (idx in byteStr.indices) {
            row[idx] = "${byteStr[idx]}".toByte()
        }
        data.add(row)
        return this
    }

    fun as2dByteArray(): Array<ByteArray> {
        val bytes = array2dOfByte(data.size, width)
        return data.toArray(bytes)
    }
}