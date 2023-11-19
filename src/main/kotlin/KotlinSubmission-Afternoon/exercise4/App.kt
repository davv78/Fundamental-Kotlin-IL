package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try-catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini


    val numerator = 10
    val denominator = 3.0

    try {
        val result = numerator / denominator
        println("Hasil pembagian: $result")
    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan aritmatika: ${e.message}")
    }


}

