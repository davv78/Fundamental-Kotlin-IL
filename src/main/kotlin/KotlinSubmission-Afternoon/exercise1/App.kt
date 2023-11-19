package id.infinitelearning.KotlinSubmission.exercise1

/**
 * Latihan 1
 * Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
 * - Variable bertipe data string yang menyimpan nilai nama depan Anda.
 * - Variable bertipe data string yang menyimpan nilai nama belakang Anda.
 * - Variable bertipe data number yang menyimpan nilai umur Anda.
 * - Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
 * Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    // Mendefinisikan variabel dengan nilai yang sesuai
    val namaDepan: String = "Octavian Dava"
    val namaBelakang: String = "Putra Cahyono"
    val umur: Int = 19
    val status: Boolean = true

    // Mencetak nilai variabel ke layar
    println("Nama Depan: $namaDepan")
    println("Nama Belakang: $namaBelakang")
    println("Nama Lengkap : $namaDepan $namaBelakang")
    println("Umur: $umur tahun")
    println("Status: ${if (status) "Single" else "Tidak Single"}")
    println("========================================================")
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    // Mencetak nilai parameter ke layar
    println("ID Grup: $groupId")
    println("Anggota Grup: $groupMember")
    println("Sesi: $session")

    return groupId // Jika Anda ingin mengembalikan nilai lain, sesuaikan di sini
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 */
fun myTeam(): List<Any> {
    // Mendefinisikan daftar anggota group
    return listOf(
        "Arid Amiludin",
        "Muhammad Nasir Nasution",
        "Octavian Dava Putra Cahyono",
        "Husna Sabila",
        "Abdurrahman Al Aziz"
    )
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 * total mentor + jumlah anggota group
 */
fun totalMember(): Int {
    // Mendefinisikan daftar mentor dan menghitung jumlah anggota group
    val mentor = arrayOf("Hasan","Reza","Raihan","Megy","Reynaldi")
    val countOfGroup = myTeam().size

    return mentor.size + countOfGroup
}

fun main() {
    // Memanggil fungsi myProfile untuk mencetak informasi profil
    myProfile()

    // Mengakses dan mencetak daftar anggota group
    val myTeamMembers = myTeam()
    println("My team is: $myTeamMembers")
    println("=======================================================================")

    // Menghitung dan mencetak total anggota group
    val totalMembers = totalMember()
    println("Total Member group : $totalMembers")
    println("=======================================================================")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     */
    groupDetail("IL007", myTeamMembers, " B CLASS MASSIVE PROJECT AFTERNOON")
}
