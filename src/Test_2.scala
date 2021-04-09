/**
 * @description:
 * @author: yudongyue
 * @date: Created in 2021/4/9 15:48
 */
object Test_2 {
  //定义方法
  def m(x: Int) = x + 3

  //定义函数
  val f = (x: Int) => x + 3

  def addInt(a: Int, b: Int): Int = {
    //    var sum: Int = 0
    //    sum = a + b
    return (a + b)
  }

  def main(args: Array[String]): Unit = {
    println(addInt(1, 2))
  }
}
