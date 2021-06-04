package org.magus

import breeze.linalg.{DenseMatrix, DenseVector}

object Breeze1 {
  def main(args:Array[String]): Unit = {
    //创建普通数组
    val x = DenseVector.zeros[Double](5)
    println(x(0))
    x(1) = 2
    println(x(1))
    x(3 to 4) := 0.5
    println(x(3))
    x(0 to 1) := DenseVector(0.1,0.2)
    //创建矩阵
    val m = DenseMatrix.zeros[Int](5,4)
    println(m)
    println(m.rows)
    println(m.cols)
    //取出矩阵的第一列
    println(m(::,1))
    //设置矩阵的行
    m(4,::) := DenseVector(1,2,3,4,5).t
    println(m)
//    m(0 to 1, 0 to 1)


  }

}
