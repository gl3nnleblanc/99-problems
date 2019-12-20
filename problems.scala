// Gets last element of list L.
def last(l: List[Any]) : Any = {
  var i: Int = 0;
  var last: Any = l(0);
  while (i < l.length) {
    last = l(i);
    i = i + 1;
  }
  return last;
}

// Gets second to last element of list L.
def lastButOne(l : List[Any]) : Any = {
  var i: Int = 0;
  var almostLast = l(0);
  while (i < l.length - 1) {
    almostLast = l(i);
    i = i + 1;
  }
  return almostLast;
}

// Gets Kth element of list L.
def getKth(l : List[Any], i : Int) : Any = {
  return l.lift(i): Any
}

// Returns size of list L.
def size(l: List[Any]) : Int = {
  return l.length
}

// Reverses list L.
def reverse(l: List[Any]) : List[Any] = {
  var i: Int = l.length - 1;
  var res = List[Any]();
  while (i >= 0) {
    res = res.appended(l.lift(i));
    i = i - 1;
  }
  return res;
}

// Returns whether L is a palindrome.
def palindrome(l: List[Any]) : Boolean = {
  
}
