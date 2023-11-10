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
    val nama_depan : String = "Dicki M"
    val nama_belakang : String = "Fauzi"
    val umur : Int = 25
    val status : Boolean = true

    println("First Name: $nama_depan")
    println("Last Name: $nama_belakang")
    println("Age: $umur Years Old")
    println("Status: ${if (status) "Single" else "open"} \n")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    val groupId = "LogicLiberators"
    val groupMember = listOf("Dicki", "Fathiya", "Putu", "Fajar", "Aziz",
        "Tengku", "Marissa", "Farida", "Malik", "Hafizh")
    val session = "Morning"

    println("Group ID: $groupId")
    println("Group Members : $groupMember")
    println("Session: $session \n")

    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val teamMembers = listOf("Dicki", "Fathiya", "Putu", "Fajar", "Aziz",
        "Tengku", "Marissa", "Farida", "Malik", "Hafizh")
    val myName = teamMembers[0]

    println("My Team Members: $teamMembers")
    println("My Name: $myName \n")

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
    val mentor = arrayOf<String>("Kak Shania", "Kak Kelfin", "Kak Ifan")
    val countOfGroup = arrayOf<String>("Dicki", "Fathiya", "Putu", "Fajar", "Aziz",
        "Tengku", "Marissa", "Farida", "Malik", "Hafizh")

    val total = mentor.size + countOfGroup.size

    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember \n")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("LogicLiberators", listOf("Dicki", "Fathiya", "Putu", "Fajar", "Aziz",
        "Tengku", "Marissa", "Farida", "Malik", "Hafizh"), "Morning")

}