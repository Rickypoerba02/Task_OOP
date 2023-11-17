package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

        try {
            // Mengambil input dari pengguna untuk nilai
            print("Masukkan nilai: ")
            val userInput = readLine() ?: throw NullPointerException("Input tidak boleh kosong")

            // Mengonversi input ke dalam tipe data Int
            val nilai = userInput.toInt()

            // Menampilkan nilai yang telah dikonversi
            println("Nilai yang dimasukkan: $nilai")
        } catch (e: NumberFormatException) {
            // Menangani pengecualian jika konversi ke Int gagal
            println("Error: ${e.message}. Masukkan harus berupa bilangan bulat.")
        } catch (e: NullPointerException) {
            // Menangani pengecualian jika input kosong
            println("Error: ${e.message}")
        } catch (e: Exception) {
            // Menangani pengecualian umum
            println("Error: ${e.message}")
        }
    }
