/**
 * Created by tatenda on 10/14/15.
 * Write a function using a for loop called alternatingReverse that takes a String and returns it in reverse,
 * keeping every other character. So if you pass in "This is a test.", it will give back ".stas iT". Your answer
 * should always include the last character, whether the number of characters is even or odd.

Function name: alternatingReverse

Variables/Parameters:

str : String
 */


def alternatingReverse1(str: String): String = {
  var answer = ""
  var keep = true
  for (ch <- str.reverse) {
    if (keep) {
      answer += ch
    }
    keep = !keep
  }
  answer
}

def alternatingReverse(str: String): String = {
  var answer = ""
  var count = 0
  for (ch <- str.reverse) {
    if (count % 2 == 0) {
      answer += ch
    }
    count += 1
  }
  answer
}


println(alternatingReverse("This is a test."))

