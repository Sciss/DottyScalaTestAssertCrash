package synth

import org.scalatest.funspec.AnyFunSpec

class RichNumberSuite extends AnyFunSpec {
  describe("Rich number operators") {
    it("should properly expand to primitives and GE") {
      val intInt1 = 6
      assert(intInt1.isInstanceOf[Int], "found " + intInt1.getClass)
    }
  }
}