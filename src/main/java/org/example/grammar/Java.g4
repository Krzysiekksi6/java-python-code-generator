grammar Java;

@parser::members {
  StringBuilder result = new StringBuilder();

  public String getResult() {
    return result.toString();
  }
}

prule: creators;
creators:  seq | branch | concur | cond | para | loop | choice | seqSeq | repeat ;
seq: 'Seq' '(' arg_java ',' arg_java ')';
branch: ('Branch' '(' arg_java ',' branchRe ')')|();
branchRe: 'BranchRe' '(' arg_java ',' arg_java ',' arg_java ')';
concur: 'Concur' '(' arg_java ',' concurRe ')';
concurRe: 'ConcurRe' '('arg_java ',' arg_java ',' arg_java ')';
cond: 'Cond' '(' arg_java ',' arg_java ',' arg_java ',' arg_java ')';
para: 'Para' '(' arg_java ',' arg_java ',' arg_java ',' arg_java ')';
loop: 'Loop' '(' arg_java ',' arg_java ',' arg_java ',' arg_java ')';
choice: 'Choice' '(' arg_java ',' arg_java ',' arg_java ',' arg_java ')';
seqSeq: 'SeqSeq' '(' arg_java ',' arg_java ',' arg_java ')';
repeat: 'Repeat' '(' arg_java ',' arg_java ',' arg_java ',' arg_java ')';
function: CharArray '(' (arg_java',')*(arg_java)* ')';
arg_java:  prule | function | string |special_String;
special_String:'#'CharArray'#';
string: CharArray;
CharArray: [a-zA-Z0-9_]+ [a-zA-Z0-9_+ =!<>%?]*;