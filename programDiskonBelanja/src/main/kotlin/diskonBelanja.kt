fun main() {
    // memamgil method belanja untuk menjalankan program
    belanja()
}

fun belanja() {

    /**
     *  Program awal yang akan menampilkan perintah kepada pengguna untuk memasukan jumlah bayar
     */
    print("Masukan total belanja : ")
    val input = readLine()?.toInt()


    /** pengecekan kondisi, ketika pengguna sudah memasukan jumlah bayar*/
    when {
        input != null -> {
            print("kamu mendapat diskon 20% apakah kamu mau memakainya [ya/tidak] ")

            val inputDiskon = readLine()

            val ya = "ya"
            val tidak = "tidak"


            /**
             *   jika 'ya' maka program akan menghitung total belanja kemudian dipotong dengan
             *   diskon 20%   */

            if (inputDiskon != null) {
                if (inputDiskon.equals(ya)) {

                    // 20 merupakan jumlah diskon
                    val diskon = 20 // 20%
                    val totalDiskon = (input / 100) * 20
                    println("\nPotongan diskon anda, $input.000 - $diskon%")
                    println("Total pembayaran anda : ${input - totalDiskon}.000\n")
                    println("--------------------------------------")
                }


                /**
                 *  dan jika mengetikan 'tidak' maka program akan langsung menampilkan
                 *   jumlah total bayaran, tanpa diskon */

                else if (inputDiskon.equals(tidak)) {
                    println("Total pembayaran anda : $input.000\n")
                    println("--------------------------------------")
                }

            }

            /**
             *  ketika program selesai dijalankan maka program akan bertanya apakah ingin
             *  menjalankan kembali program?
             *  jika 'ya' maka program akan  memangil kembali method belanja
             *  namun jika tidak program akan berhenti */

            print("Apakah ingin menjalankan kembali program [ya/tidak] ")
            val jalankanKembaliProgram = readLine()
            if (jalankanKembaliProgram == ya)
                belanja()
             else
                println("Program Berhenti.")
        }

    }
}
