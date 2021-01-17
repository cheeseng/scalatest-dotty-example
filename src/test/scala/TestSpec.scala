import org.scalatest.funspec._

class TestSpec extends AnyFunSpec {

  describe("testing") {
    it("a test") {
      info("test info")
      assert(3 + 2 == 5)  
    }  
  }

}