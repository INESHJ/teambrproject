package lecture

object HELLA {

  // return the maximum value that can be computed by multiplying two different elements from the input list
  // -Two elements with the same value are considered different
  // If the list only contains 1 element, return that element squared
  // If the list is empty, return -1
  def maxMultiply(input: List[Int]): Int = {

    if (input.isEmpty) {
      -1
    } else if (input.length == 1) {
      // round to avoid truncation errors
      Math.round(Math.pow(input.head, 2)).toInt
    } else {
      var maxFound = input.head * input.apply(1)
      var ix = 0
      var iy = 0
      for (x <- input) {
        for (y <- input) {
          if (iy != ix) {
            if (y * x > maxFound) {
              maxFound = x * y
            }
          }
          iy += 1
        }
        ix += 1
      }
      maxFound
    }
  }

  def main(args: Array[String]): Unit = {

  }

}
