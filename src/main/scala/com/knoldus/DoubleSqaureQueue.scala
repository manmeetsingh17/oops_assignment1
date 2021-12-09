package com.knoldus

import scala.collection.mutable.ListBuffer

class DoubleSqaureQueue(q : ListBuffer[Int]) extends Queue {

  override def enqueue(pushedElement: Int): Unit = {

    q += (pushedElement * 2)
  }

}

class SquareQueue(q: ListBuffer[Int]) extends Queue {

  override def enqueue(pushedElement: Int): Unit = {

    q += (pushedElement * pushedElement)
  }

}