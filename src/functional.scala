/**
 * @description:
 * @author: yudongyue
 * @date: Created in 2021/4/9 15:58
 */
object functional {
  //Scala 解析函数时有两种方式：
  //传值调用：先计算表达式得值再传入函数内部、
  //传名调用：将未计算得表达式传入函数内部
  def main(args: Array[String]): Unit = {
    delayed(time())
  }

  def time() = {
    println("获取时间，单位为纳秒")
    System.nanoTime()
  }

  def delayed(t: => Long) = {
    println("在delayed方法内:")
    println("参数:" + t)
    t
  }

}
