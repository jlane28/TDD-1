package password_checker

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._

class Password_Test extends AnyFunSpec with Matchers {
  describe("A password checker") {
    describe("determines proper length") {
      it("rejects passwords that are less than 6 characters, checks if there are any special characters, checks if there are numbers, and checks if there are upper case letters.") {
        val tooShort = "abcde"
        val longEnough = "abcdef"
        val evenLonger = "abcdefghi"
        val nums = "eSgreg5232*@#"
        Password.isValid(tooShort) shouldBe true
        Password.isValid(longEnough) shouldBe false
        Password.isValid(evenLonger) shouldBe false

        Password.hasNums(tooShort) shouldBe true
        Password.hasNums(longEnough) shouldBe true
        Password.hasNums(nums) shouldBe false

        Password.hasSpecChars(tooShort) shouldBe true
        Password.hasSpecChars(longEnough) shouldBe true
        Password.hasSpecChars(nums) shouldBe false

        Password.hasUpper(tooShort) shouldBe true
        Password.hasUpper(longEnough) shouldBe true
        Password.hasUpper(nums) shouldBe false

      }
    }
  }
}
