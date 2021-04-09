/**
 * @description:
 * @author: yudongyue
 * @date: Created in 2021/4/9 15:04
 */
//演示private
class Outer {

  class Inner {
    private def f() {
      println("f")
      class InnerClass {
        f() //正确
      }
    }
  }

  //  (new Inner).f() //错误，不允许外部成员访问内部私有成员   JAVA两周都可以，外部可以访问内部private，内部也可以访问
}

//演示protected
package p {

  class Super {
    protected def f() {
      println("f")
    }
  }

  class Sub extends Super {
    f()
  }

  class Other {
    //    (new Super).f() //错误
  }

}

//公共成员，任何地方都可以访问public
class Outer1 {

  class Inner {
    def f() {
      println("f")
    }

    class InnerMost {
      f() //正确
    }

  }

  (new Inner).f() //正确
}