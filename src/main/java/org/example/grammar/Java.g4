grammar Java;
prule: creators;
<<<<<<< Updated upstream
creators:  seq | branch | concur | cond | para | loop | choice | seqSeq | repeat ;
seq: 'Seq' '(' arg_java ',' arg_java ')';
branch: 'Branch' '(' arg_java ',' branchRe  ')';
branchRe: 'BranchRe' '(' arg_java ',' arg_java ',' arg_java ')';
=======
creators:  seq | branch | branchRe | concur | concurRe | cond | para | loop | choice | seqSeq | repeat ;
seq: 'Seq' twoArguments;
branch: 'Branch' '(' arg_java ',' branchRe ')';
branchRe: 'BranchRe' threeArguments;
>>>>>>> Stashed changes
concur: 'Concur' '(' arg_java ',' concurRe ')';
concurRe: 'ConcurRe' threeArguments;
cond: 'Cond' fourArguments;
para: 'Para' fourArguments;
loop: 'Loop' fourArguments;
choice: 'Choice' fourArguments;
seqSeq: 'SeqSeq' threeArguments;
repeat: 'Repeat' fourArguments;
twoArguments : '(' arg_java ',' arg_java ')';
threeArguments : '(' arg_java ',' arg_java ',' arg_java ')';
fourArguments : '(' arg_java ',' arg_java ',' arg_java ',' arg_java ')';
function: CharArray '(' (arg_java',')*(arg_java)* ')';
arg_java:  prule | function | string |special_String;
special_String:'#'CharArray'#';
string: CharArray;
CharArray: [a-zA-Z0-9_]+ [a-zA-Z0-9_+ =!<>%?]*;