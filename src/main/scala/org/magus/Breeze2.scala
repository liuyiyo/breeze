package org.magus

import breeze.linalg.{*, DenseMatrix, DenseVector}

import java.io.FileInputStream
import scala.io.Source
import scala.reflect.io.File

object Breeze2 {
  def main(args: Array[String]): Unit = {
    val dm = DenseMatrix((1.0,2.0,3.0),
      (4.0,5.0,6.0))
    println(dm)
    //给每行加值
    val res = dm(::, *) + DenseVector(3.0,4.0);
    println(res)
    val file = Source.fromFile("ce_v.txt")
    //先创建一个2*92的矩阵(2行，92列)
    val m = DenseMatrix((2,3),(3,5))
    println(m)
    var first = Array(String)
    for( line <- file.getLines()){
      val list = line.split(",").toArray
      if(first == null){
        first = list
      }else{
        val dm1 = DenseMatrix(first)
        val dm2 = DenseMatrix(list)
      }
      println(line)
    }
  }

}
