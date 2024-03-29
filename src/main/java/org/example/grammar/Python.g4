grammar Python;
prule: creators;
creators:  seq | branch | concur | cond | para | loop | choice | seqSeq | repeat ;
seq: 'Seq' '(' arg_python ',' arg_python ')';
branch: 'Branch' '(' arg_python ',' branchRe  ')';
branchRe: 'BranchRe' '(' arg_python ',' arg_python ',' arg_python ')';
concur: 'Concur' '(' arg_python ',' concurRe ')';
concurRe: 'ConcurRe' '('arg_python ',' arg_python ',' arg_python ')';
cond: 'Cond' '(' arg_python ',' arg_python ',' arg_python ',' arg_python ')';
para: 'Para' '(' arg_python ',' arg_python ',' arg_python ',' arg_python ')';
loop: 'Loop' '(' arg_python ',' arg_python ',' arg_python ',' arg_python ')';
choice: 'Choice' '(' arg_python ',' arg_python ',' arg_python ',' arg_python ')';
seqSeq: 'SeqSeq' '(' arg_python ',' arg_python ',' arg_python ')';
repeat: 'Repeat' '(' arg_python ',' arg_python ',' arg_python ',' arg_python ')';
function: CharArray '(' (arg_python',')*(arg_python)* ')';
arg_python:  prule | function | string ;
string: CharArray;
CharArray: [a-zA-Z0-9_]+ [a-zA-Z0-9_+ =!<>%?]*;