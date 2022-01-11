package password_checker

object Password {
  def isValid(password: String): Boolean =
    if (password.length() >= 6 ) true
    else false

  def hasNums(password: String): Boolean =
    if (password.exists(_.isDigit)) true
    else false

  def hasSpecChars(password: String): Boolean =
    val specCharsArr = Array('!','@','#','$','%','^','&','*','?','>','<',':')

    if (password.exists(specCharsArr.contains(_))) true
    else false

  def hasUpper(password: String): Boolean =
    if (password.exists(_.isUpper)) true
    else false
}
