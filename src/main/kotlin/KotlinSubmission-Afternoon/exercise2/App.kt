package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    val listNumber = mutableListOf<Int>()

    for (i in 1..100) {
        if (i % 2 == 0) {
            listNumber.add(i)
        }
    }


    println("List of even numbers from 1 to 100: $listNumber")

    println("======================================================================")

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    // Buat di bawah sini
     */
    val namaBulan = mapOf(
        "Jan" to "Januari",
        "Feb" to "Februari",
        "Mar" to "Maret",
        "Apr" to "April",
        "Mei" to "Mei",
        "Jun" to "Juni",
        "Jul" to "Juli",
        "Agu" to "Agustus",
        "Sep" to "September",
        "Okt" to "Oktober",
        "Nov" to "November",
        "Des" to "Desember"
    )

    // Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    // - Jan -> January
    // - Feb -> February
    // - Dst...
    // Buat di bawah sini
    namaBulan.forEach { (key, value) ->
        println("$key -> $value ")
    }
    println("======================================================================")
    // Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    // - "It's {$monthNow} now, I was born in {$birthMonth}"
    // Buat di bawah sini
    val bulanIni = "Nov" // Ganti dengan inisial bulan sekarang (misalnya "Nov" untuk November)
    val bulanLahir = "Okt" // Ganti dengan inisial bulan lahir kamu
    println("sekarang adalah bulan $bulanIni , sedangkan saya lahir di bulan  $bulanLahir")

}
