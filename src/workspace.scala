/**
 * @description:
 * @author: yudongyue
 * @date: Created in 2021/4/9 15:19
 */
//作用域保护
package bobsrockets {
  package navigation {

    //Navigator这个类对bobsrockets这个包了里所有得类和对象可见
    private[bobsrockets] class Navigator {
      protected[navigation] def useStarChart() {}

      class LegOfJourney {
        private[Navigator] val distance = 100
      }

      private[this] var speed = 200
    }

  }

  package launch {

    import navigation._
    // 比如说，从 Vehicle 对象里对 Navigator 的访问是被允许的，因为对象 Vehicle 包含在包 launch 中，而 launch 包在 bobsrockets 中，相反，所有在包 bobsrockets
    //之外的代码都不能访问类 Navigator

    object Vehicle {
      private[launch] val guide = new Navigator
    }

  }

}
