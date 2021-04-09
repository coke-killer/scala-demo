/**
 * @description:
 * @author: yudongyue
 * @date: Created in 2021/4/9 16:07
 */
object Test_3 {

  def printInt(a: Int, b: Int): Unit = {
    println(a)
    println(b)
    printStrings("cat", "dog", "fish")
    for (i <- 1 to 10) {
      println(i + "的阶乘为：" + factorial(i))
    }
  }

  //指定函数名，不按照创建顺序传递参数
  def main(args: Array[String]): Unit = {
    printInt(b = 5, a = 7)
  }

  //可变参数
  def printStrings(args: String*) = {
    var i = 0
    for (arg <- args) {
      println("Arg value[" + i + "]" + arg)
      i += 1
    }
  }

  //递归函数
  def factorial(n: BigInt): BigInt = {
    if (n <= 1) {
      1
    }
    else
      n * factorial(n - 1)
  }

}
