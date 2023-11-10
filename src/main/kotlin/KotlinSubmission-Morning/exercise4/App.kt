package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

        // terdapat 5 buah elemen atau 4 indeks
        val numbers = arrayOf(1, 2, 3, 4, 5)

        // Mencoba mengakses elemen ke-6 atau indeks ke-5 yang tidak ada
        try {
            println(numbers[5])
        } catch (e: ArrayIndexOutOfBoundsException) {

        // Menangkap exception yang terjadi dan menampilkan pesan kesalahan
            println("\t\n Terjadi kesalahan, melampaui Indeks maksimal : ${e.message} !")
        }
        println("\t\n ----- Program selesai -----")

    }