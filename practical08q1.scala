object q1 extends App{

    def encrypt(text: String, shift: Int): String = {
        text.map { char =>
            if (char.isUpper) {
                ((char - 'A' + shift) % 26 + 'A').toChar
            } else if (char.isLower) {
                ((char - 'a' + shift) % 26 + 'a').toChar
            } else {
                char
            }
        }
    }

    def decrypt(text: String, shift: Int): String = {
        text.map { char =>
            if (char.isUpper) {
                ((char - 'A' - shift + 26) % 26 + 'A').toChar
            } else if (char.isLower) {
                ((char - 'a' - shift + 26) % 26 + 'a').toChar
            } else {
                char
            }
        }
    }

    def cipher(text: String, shift: Int, operation: (String, Int) => String): String = {
        operation(text, shift)
    }

    val plaintext = "encrypt and decrypt"
    val shift = 2

    val encrypted = cipher(plaintext, shift, encrypt)
    println(s"Encrypted: $encrypted")

    val decrypted = cipher(encrypted, shift, decrypt)
    println(s"Decrypted: $decrypted")

}
