/**
 * @description:
 * @author: yudongyue
 * @date: Created in 2021/4/9 16:19
 */
object Test_4 {
  //添加默认参数值
  def addInt(a: Int = 5, b: Int = 7): Int = {
    var sum: Int = 0
    sum = a + b
    sum
  }

  //高阶函数即通过函数调用其他函数
  //函数f和值V作为参数，而函数f又调用了参数v
  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString + "]"

  def main(args: Array[String]): Unit = {
    println(addInt(1, 2))
    println(addInt())
    println(apply(layout, 1))
  }

}
