fun main() {
    /*
    Dibawah ini merupakan pendeklarasian array list yang memiliki tipe data String
    array list tersebut menampung nama bunga
     */
    var arrayList = arrayListOf<String>("Mawar", "Melati", "Anggrek", "Matahari")

    //menambahkan item baru kedalam array list dengan fungsi add
    arrayList.add("Kaktus")

    /*
    Dibawah ini merupakan penerapan lambda untuk mengurutkan data array list
    menggunakan comareBy. Pengurutan berdasarkan angka menggunakan capitalize()
     */
    val namedSortedByLength = arrayList.sortedWith(compareBy {
        it.capitalize()
    })

    println("Daftar Bunga Berdasarkan Array List :")
    //menampilkan keseluruhan data array list
    println(arrayList)

    println("\nDaftar Bunga Diurut Berdasarkan Abjad :")
    /*
    Dibawah ini merupakan perulangan untuk menampilkan data array list yang telah diurutkan
    dengan menambahkan index sebagai penomoran data item array list
     */
    for (index in 0..arrayList.size - 1) {
        //menampilkan data dengan nomor index yang diurutkan berdasarkan abjad item
        println("${index + 1}. Bunga ${namedSortedByLength.get(index)}")
    }
}