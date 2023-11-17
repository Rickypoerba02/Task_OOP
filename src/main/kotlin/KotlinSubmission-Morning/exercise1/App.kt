package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    println("===Isi Data Diri====")
    println("Nama Depan:")
    val  namadp = readLine()

    println("Nama Belakang:")
    val namablk = readLine()

    println("Umur:")
    val umur = readLine()

    println("Status (single/ tidak):")
    val status = readLine()?.toBoolean() ?: false


    //Menampilkan cetak
    println("\nMy Profil:")
    println("Nama Depan    : $namadp")
    println("Nama Belakang : $namablk")
    println("Umur          : $umur")
    println("Status        : $status")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {

    println("Detail Grup:")
    println("ID Grup: $groupId")


    println("\nAnggota Grup:")
    for ((index, member) in groupMember.withIndex()) {
        println("${index + 1}. $member")
    }

    // Mencetak informasi sesi
    println("\nSesi Grup: $session")


    val groupData = mapOf(
        "groupId" to groupId,
        "groupMembers" to groupMember,
        "sessionInfo" to session
    )

    return groupData
}



/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
val teamMembers = listOf("Gita","Ricky","willy","Dede","Miftu","Akmal","Nabila","Nurul","Prasdiantama","Carlos")
    return teamMembers
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Kak sarif","Kak Megy","kak Raihan","kak Reza", "kak Renaldi", "kak maul","Kak Hassan", "kak jovian")
    val countOfGroup = 10

    return mentor.size + countOfGroup
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */

    val groupId = "Freiwilliger 11"
    val groupMembers = listOf("willy", "ricky", "gita", "dede","Miftu","Akmal","Nabila","Nurul","Prasdiantama","Carlos")
    val sessionInfo = "Sesi pagi"

    groupDetail(groupId, groupMembers, sessionInfo)
}