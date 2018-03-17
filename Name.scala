def succ(i:Int):Int = i+1
def pred(i:Int):Int = i-1

def TatendaAdd ( a: Int , b:Int): Int = {
  if (b>0)
      TatendaAdd(succ(a),pred(b))
  else a
}

def TatendaMult ( a: Int, b:Int): Int = {
   if (b>0)
        TatendaAdd(a, TatendaMult(a,pred(b)))
   else 0
}

def TatendaExp ( a: Int, b:Int): Int = {
  if (b>0)
        TatendaMult(a, TatendaExp(a, pred(b)))
  else 1
}



