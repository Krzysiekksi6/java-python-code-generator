package org.example.parsers;

import org.example.gen.PythonBaseListener;
import org.example.gen.PythonParser;

public class PythonLikeParser extends PythonBaseListener {
    @Override
    public void enterSeq(PythonParser.SeqContext ctx) {
        String arg1Type = null;
        String arg1Name = null;
        String arg2Type = null;
        String arg2Name = null;
        String template = "";
        String code = "";
        int templateType=0;
        if(ctx.arg_python(0).type() != null){
            arg1Type = ctx.arg_python(0).type().getText();
            arg1Name = ctx.arg_python(0).ID().getText();
        }
        else{
            templateType+=1;
            arg1Type  = ctx.arg_python(0).prule().function().getText();
        }
        if(ctx.arg_python(1).type() != null){
            arg2Type = ctx.arg_python(1).type().getText();
            arg2Name = ctx.arg_python(1).ID().getText();
        }else {
            templateType+=2;
            arg2Type = ctx.arg_python(1).prule().function().getText();
        }
        switch (templateType){
            case 0:
                template = "def Seq(%s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg2Name);
                break;
            case 1:
                template = "def Seq(%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name);
                break;
            case 2:
                template = "def Seq(%s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type);
                break;
            case 3:
                template = "def Seq(%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type);
                break;
            default:
                System.out.println("Null pointer exception");
        }

        System.out.println(code);
        // Add code here to modify the template for the function with two arguments
    }
    @Override
    public void  enterBranch(PythonParser.BranchContext ctx) {
        String arg1Type = null;
        String arg1Name = null;
        String arg2Type = null;
        String arg2Name = null;
        String arg3Type = null;
        String arg3Name = null;
        String template ="";
        String code ="";
        int templatetype=0;
        if(ctx.arg_python(0).type() != null){
            arg1Type = ctx.arg_python(0).type().getText();
            arg1Name = ctx.arg_python(0).ID().getText();
        }
        else{
            templatetype+=1;
            arg1Type  = ctx.arg_python(0).prule().function().getText();
        }
        if(ctx.arg_python(1).type() != null){
            arg2Type = ctx.arg_python(1).type().getText();
            arg2Name = ctx.arg_python(1).ID().getText();
        }else {
            templatetype+=2;
            arg2Type = ctx.arg_python(1).prule().function().getText();
        }
        if(ctx.arg_python(2).type() != null){
            arg3Type = ctx.arg_python(2).type().getText();
            arg3Name = ctx.arg_python(2).ID().getText();
        }else {
            templatetype+=4;
            arg3Type = ctx.arg_python(2).prule().function().getText();
        }
        switch (templatetype){
            case 0:
                template = "def Branch(%s%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg2Name, arg3Type, arg3Name);
                break;
            case 6:
                template = "def Branch(%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type, arg3Name);
                break;
            case 1:
                template = "def Branch(%s%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type);
                break;
            case 7:
                template = "def Branch(%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type);
                break;
            case 3:
                template = "def Branch(%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type, arg3Name);
                break;
            case 2:
                template = "def Branch(%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type);
                break;
            case 5:
                template = "def Branch(%s%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type, arg3Name);
                break;
            case 4:
                template = "def Branch(%s%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg2Name, arg3Type);
                break;
            default:
                System.out.println("Null pointer exception");
        }

        System.out.println(code);
        // Add code here to modify the template for the function with two arguments
    }
    @Override
    public void  enterBranchRe(PythonParser.BranchReContext ctx) {
        String arg1Type = null;
        String arg1Name = null;
        String arg2Type = null;
        String arg2Name = null;
        String arg3Type = null;
        String arg3Name = null;
        String template ="";
        String code ="";
        int templatetype=0;
        if(ctx.arg_python(0).type() != null){
            arg1Type = ctx.arg_python(0).type().getText();
            arg1Name = ctx.arg_python(0).ID().getText();
        }
        else{
            templatetype+=1;
            arg1Type  = ctx.arg_python(0).prule().function().getText();
        }
        if(ctx.arg_python(1).type() != null){
            arg2Type = ctx.arg_python(1).type().getText();
            arg2Name = ctx.arg_python(1).ID().getText();
        }else {
            templatetype+=2;
            arg2Type = ctx.arg_python(1).prule().function().getText();
        }
        if(ctx.arg_python(2).type() != null){
            arg3Type = ctx.arg_python(2).type().getText();
            arg3Name = ctx.arg_python(2).ID().getText();
        }else {
            templatetype+=4;
            arg3Type = ctx.arg_python(2).prule().function().getText();
        }
        switch (templatetype){
            case 0:
                template = "def BranchRe(%s%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg2Name, arg3Type, arg3Name);
                break;
            case 6:
                template = "def BranchRe(%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type, arg3Name);
                break;
            case 1:
                template = "def BranchRe(%s%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type);
                break;
            case 7:
                template = "def BranchRe(%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type);
                break;
            case 3:
                template = "def BranchRe(%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type, arg3Name);
                break;
            case 2:
                template = "def BranchRe(%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type);
                break;
            case 5:
                template = "def BranchRe(%s%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type, arg3Name);
                break;
            case 4:
                template = "def BranchRe(%s%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg2Name, arg3Type);
                break;
            default:
                System.out.println("Null pointer exception");
        }

        System.out.println(code);
        // Add code here to modify the template for the function with two arguments
    }
    @Override
    public void  enterConcur(PythonParser.ConcurContext ctx) {
        String arg1Type = null;
        String arg1Name = null;
        String arg2Type = null;
        String arg2Name = null;
        String arg3Type = null;
        String arg3Name = null;
        String template ="";
        String code ="";
        int templatetype=0;
        if(ctx.arg_python(0).type() != null){
            arg1Type = ctx.arg_python(0).type().getText();
            arg1Name = ctx.arg_python(0).ID().getText();
        }
        else{
            templatetype+=1;
            arg1Type  = ctx.arg_python(0).prule().function().getText();
        }
        if(ctx.arg_python(1).type() != null){
            arg2Type = ctx.arg_python(1).type().getText();
            arg2Name = ctx.arg_python(1).ID().getText();
        }else {
            templatetype+=2;
            arg2Type = ctx.arg_python(1).prule().function().getText();
        }
        if(ctx.arg_python(2).type() != null){
            arg3Type = ctx.arg_python(2).type().getText();
            arg3Name = ctx.arg_python(2).ID().getText();
        }else {
            templatetype+=4;
            arg3Type = ctx.arg_python(2).prule().function().getText();
        }
        switch (templatetype){
            case 0:
                template = "def Concur(%s%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg2Name, arg3Type, arg3Name);
                break;
            case 6:
                template = "def Concur(%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type, arg3Name);
                break;
            case 1:
                template = "def Concur(%s%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type);
                break;
            case 7:
                template = "def Concur(%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type);
                break;
            case 3:
                template = "def Concur(%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type, arg3Name);
                break;
            case 2:
                template = "def Concur(%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type);
                break;
            case 5:
                template = "def Concur(%s%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type, arg3Name);
                break;
            case 4:
                template = "def Concur(%s%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg2Name, arg3Type);
                break;
            default:
                System.out.println("Null pointer exception");
        }

        System.out.println(code);
        // Add code here to modify the template for the function with two arguments
    }
    @Override
    public void  enterConcurRe(PythonParser.ConcurReContext ctx) {
        String arg1Type = null;
        String arg1Name = null;
        String arg2Type = null;
        String arg2Name = null;
        String arg3Type = null;
        String arg3Name = null;
        String template ="";
        String code ="";
        int templatetype=0;
        if(ctx.arg_python(0).type() != null){
            arg1Type = ctx.arg_python(0).type().getText();
            arg1Name = ctx.arg_python(0).ID().getText();
        }
        else{
            templatetype+=1;
            arg1Type  = ctx.arg_python(0).prule().function().getText();
        }
        if(ctx.arg_python(1).type() != null){
            arg2Type = ctx.arg_python(1).type().getText();
            arg2Name = ctx.arg_python(1).ID().getText();
        }else {
            templatetype+=2;
            arg2Type = ctx.arg_python(1).prule().function().getText();
        }
        if(ctx.arg_python(2).type() != null){
            arg3Type = ctx.arg_python(2).type().getText();
            arg3Name = ctx.arg_python(2).ID().getText();
        }else {
            templatetype+=4;
            arg3Type = ctx.arg_python(2).prule().function().getText();
        }
        switch (templatetype){
            case 0:
                template = "def ConcurRe(%s%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg2Name, arg3Type, arg3Name);
                break;
            case 6:
                template = "def ConcurRe(%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type, arg3Name);
                break;
            case 1:
                template = "def ConcurRe(%s%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type);
                break;
            case 7:
                template = "def ConcurRe(%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type);
                break;
            case 3:
                template = "def ConcurRe(%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type, arg3Name);
                break;
            case 2:
                template = "def ConcurRe(%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type);
                break;
            case 5:
                template = "def ConcurRe(%s%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type, arg3Name);
                break;
            case 4:
                template = "def ConcurRe(%s%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg2Name, arg3Type);
                break;
            default:
                System.out.println("Null pointer exception");
        }

        System.out.println(code);
        // Add code here to modify the template for the function with two arguments
    }
    @Override
    public void  enterSeqSeq(PythonParser.SeqSeqContext ctx) {
        String arg1Type = null;
        String arg1Name = null;
        String arg2Type = null;
        String arg2Name = null;
        String arg3Type = null;
        String arg3Name = null;
        String template ="";
        String code ="";
        int templatetype=0;
        if(ctx.arg_python(0).type() != null){
            arg1Type = ctx.arg_python(0).type().getText();
            arg1Name = ctx.arg_python(0).ID().getText();
        }
        else{
            templatetype+=1;
            arg1Type  = ctx.arg_python(0).prule().function().getText();
        }
        if(ctx.arg_python(1).type() != null){
            arg2Type = ctx.arg_python(1).type().getText();
            arg2Name = ctx.arg_python(1).ID().getText();
        }else {
            templatetype+=2;
            arg2Type = ctx.arg_python(1).prule().function().getText();
        }
        if(ctx.arg_python(2).type() != null){
            arg3Type = ctx.arg_python(2).type().getText();
            arg3Name = ctx.arg_python(2).ID().getText();
        }else {
            templatetype+=4;
            arg3Type = ctx.arg_python(2).prule().function().getText();
        }
        switch (templatetype){
            case 0:
                template = "def SeqSeq(%s%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg2Name, arg3Type, arg3Name);
                break;
            case 6:
                template = "def SeqSeq(%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type, arg3Name);
                break;
            case 1:
                template = "def SeqSeq(%s%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type);
                break;
            case 7:
                template = "def SeqSeq(%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type);
                break;
            case 3:
                template = "def SeqSeq(%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type, arg3Name);
                break;
            case 2:
                template = "def SeqSeq(%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type);
                break;
            case 5:
                template = "def SeqSeq(%s%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type, arg3Name);
                break;
            case 4:
                template = "def SeqSeq(%s%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg2Name, arg3Type);
                break;
            default:
                System.out.println("Null pointer exception");
        }

        System.out.println(code);
        // Add code here to modify the template for the function with two arguments
    }
    @Override
    public void enterCond(PythonParser.CondContext ctx) {
        String arg1Type = null;
        String arg1Name = null;
        String arg2Type = null;
        String arg2Name = null;
        String arg3Type = null;
        String arg3Name = null;
        String arg4Type = null;
        String arg4Name = null;
        String template ="";
        String code ="";
        int templatetype=0;
        if(ctx.arg_python(0).type() != null){
            arg1Type = ctx.arg_python(0).type().getText();
            arg1Name = ctx.arg_python(0).ID().getText();
        }
        else{
            templatetype+=1;
            arg1Type  = ctx.arg_python(0).prule().function().getText();
        }
        if(ctx.arg_python(1).type() != null){
            arg2Type = ctx.arg_python(1).type().getText();
            arg2Name = ctx.arg_python(1).ID().getText();
        }else {
            templatetype+=2;
            arg2Type = ctx.arg_python(1).prule().function().getText();
        }
        if(ctx.arg_python(2).type() != null){
            arg3Type = ctx.arg_python(2).type().getText();
            arg3Name = ctx.arg_python(2).ID().getText();
        }else {
            templatetype+=4;
            arg3Type = ctx.arg_python(2).prule().function().getText();
        }
        if(ctx.arg_python(3).type() != null){
            arg4Type = ctx.arg_python(3).type().getText();
            arg4Name = ctx.arg_python(3).ID().getText();
        }else {
            templatetype+=8;
            arg4Type = ctx.arg_python(3).prule().function().getText();
        }
        switch (templatetype){
            case 0:
                template = "def Cond(%s%s, %s%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg2Name, arg3Type, arg3Name, arg4Type, arg4Name);
                break;
            case 1:
                template = "def Cond(%s, %s%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type, arg3Name, arg4Type, arg4Name);
                break;
            case 2:
                template = "def Cond(%s%s, %s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type, arg3Type, arg3Name, arg4Type, arg4Name);
                break;
            case 3:
                template = "def Cond(%s, %s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type,arg3Name,  arg4Type, arg4Name);
                break;
            case 4:
                template = "def Cond(%s%s, %s%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type,arg2Name, arg3Type, arg4Type, arg4Name);
                break;
            case 5:
                template = "def Cond(%s, %s%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type,  arg2Type,arg2Name, arg3Type, arg4Type, arg4Name);
                break;
            case 6:
                template = "def Cond(%s%s, %s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type, arg4Type, arg4Name);
                break;
            case 7:
                template = "def Cond(%s, %s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type,  arg3Type, arg4Type, arg4Name);
                break;
            case 8:
                template = "def Cond(%s%s, %s%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type, arg2Name, arg3Type, arg3Name, arg4Type);
                break;
            case 9:
                template = "def Cond(%s, %s%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,  arg2Type, arg2Name, arg3Type, arg3Name, arg4Type );
                break;
            case 10:
                template = "def Cond(%s%s, %s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type, arg3Name, arg4Type);
                break;
            case 11:
                template = "def Cond(%s, %s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,  arg2Type, arg3Type,arg3Name, arg4Type);
                break;
            case 12:
                template = "def Cond(%s%s, %s%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type,arg2Name, arg3Type, arg4Type);
                break;
            case 13:
                template = "def Cond(%s, %s%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type, arg4Type);
                break;
            case 14:
                template = "def Cond(%s%s, %s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type,  arg3Type, arg4Type);
                break;
            case 15:
                template = "def Cond(%s, %s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type,  arg4Type);
                break;
            default:
                System.out.println("Null pointer exception");
        }

        System.out.println(code);
        // Add code here to modify the template for the function with two arguments
    }
    @Override
    public void enterPara(PythonParser.ParaContext ctx) {
        String arg1Type = null;
        String arg1Name = null;
        String arg2Type = null;
        String arg2Name = null;
        String arg3Type = null;
        String arg3Name = null;
        String arg4Type = null;
        String arg4Name = null;
        String template ="";
        String code ="";
        int templatetype=0;
        if(ctx.arg_python(0).type() != null){
            arg1Type = ctx.arg_python(0).type().getText();
            arg1Name = ctx.arg_python(0).ID().getText();
        }
        else{
            templatetype+=1;
            arg1Type  = ctx.arg_python(0).prule().function().getText();
        }
        if(ctx.arg_python(1).type() != null){
            arg2Type = ctx.arg_python(1).type().getText();
            arg2Name = ctx.arg_python(1).ID().getText();
        }else {
            templatetype+=2;
            arg2Type = ctx.arg_python(1).prule().function().getText();
        }
        if(ctx.arg_python(2).type() != null){
            arg3Type = ctx.arg_python(2).type().getText();
            arg3Name = ctx.arg_python(2).ID().getText();
        }else {
            templatetype+=4;
            arg3Type = ctx.arg_python(2).prule().function().getText();
        }
        if(ctx.arg_python(3).type() != null){
            arg4Type = ctx.arg_python(3).type().getText();
            arg4Name = ctx.arg_python(3).ID().getText();
        }else {
            templatetype+=8;
            arg4Type = ctx.arg_python(3).prule().function().getText();
        }
        switch (templatetype){
            case 0:
                template = "def Para(%s%s, %s%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg2Name, arg3Type, arg3Name, arg4Type, arg4Name);
                break;
            case 1:
                template = "def Para(%s, %s%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type, arg3Name, arg4Type, arg4Name);
                break;
            case 2:
                template = "def Para(%s%s, %s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type, arg3Type, arg3Name, arg4Type, arg4Name);
                break;
            case 3:
                template = "def Para(%s, %s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type,arg3Name,  arg4Type, arg4Name);
                break;
            case 4:
                template = "def Para(%s%s, %s%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type,arg2Name, arg3Type, arg4Type, arg4Name);
                break;
            case 5:
                template = "def Para(%s, %s%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type,  arg2Type,arg2Name, arg3Type, arg4Type, arg4Name);
                break;
            case 6:
                template = "def Para(%s%s, %s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type, arg4Type, arg4Name);
                break;
            case 7:
                template = "def Para(%s, %s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type,  arg3Type, arg4Type, arg4Name);
                break;
            case 8:
                template = "def Para(%s%s, %s%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type, arg2Name, arg3Type, arg3Name, arg4Type);
                break;
            case 9:
                template = "def Para(%s, %s%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,  arg2Type, arg2Name, arg3Type, arg3Name, arg4Type );
                break;
            case 10:
                template = "def Para(%s%s, %s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type, arg3Name, arg4Type);
                break;
            case 11:
                template = "def Para(%s, %s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,  arg2Type, arg3Type,arg3Name, arg4Type);
                break;
            case 12:
                template = "def Para(%s%s, %s%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type,arg2Name, arg3Type, arg4Type);
                break;
            case 13:
                template = "def Para(%s, %s%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type, arg4Type);
                break;
            case 14:
                template = "def Para(%s%s, %s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type,  arg3Type, arg4Type);
                break;
            case 15:
                template = "def Para(%s, %s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type,  arg4Type);
                break;
            default:
                System.out.println("Null pointer exception");
        }

        System.out.println(code);
        // Add code here to modify the template for the function with two arguments
    }
    @Override
    public void enterLoop(PythonParser.LoopContext ctx) {
        String arg1Type = null;
        String arg1Name = null;
        String arg2Type = null;
        String arg2Name = null;
        String arg3Type = null;
        String arg3Name = null;
        String arg4Type = null;
        String arg4Name = null;
        String template ="";
        String code ="";
        int templatetype=0;
        if(ctx.arg_python(0).type() != null){
            arg1Type = ctx.arg_python(0).type().getText();
            arg1Name = ctx.arg_python(0).ID().getText();
        }
        else{
            templatetype+=1;
            arg1Type  = ctx.arg_python(0).prule().function().getText();
        }
        if(ctx.arg_python(1).type() != null){
            arg2Type = ctx.arg_python(1).type().getText();
            arg2Name = ctx.arg_python(1).ID().getText();
        }else {
            templatetype+=2;
            arg2Type = ctx.arg_python(1).prule().function().getText();
        }
        if(ctx.arg_python(2).type() != null){
            arg3Type = ctx.arg_python(2).type().getText();
            arg3Name = ctx.arg_python(2).ID().getText();
        }else {
            templatetype+=4;
            arg3Type = ctx.arg_python(2).prule().function().getText();
        }
        if(ctx.arg_python(3).type() != null){
            arg4Type = ctx.arg_python(3).type().getText();
            arg4Name = ctx.arg_python(3).ID().getText();
        }else {
            templatetype+=8;
            arg4Type = ctx.arg_python(3).prule().function().getText();
        }
        switch (templatetype){
            case 0:
                template = "def Loop(%s%s, %s%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg2Name, arg3Type, arg3Name, arg4Type, arg4Name);
                break;
            case 1:
                template = "def Loop(%s, %s%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type, arg3Name, arg4Type, arg4Name);
                break;
            case 2:
                template = "def Loop(%s%s, %s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type, arg3Type, arg3Name, arg4Type, arg4Name);
                break;
            case 3:
                template = "def Loop(%s, %s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type,arg3Name,  arg4Type, arg4Name);
                break;
            case 4:
                template = "def Loop(%s%s, %s%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type,arg2Name, arg3Type, arg4Type, arg4Name);
                break;
            case 5:
                template = "def Loop(%s, %s%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type,  arg2Type,arg2Name, arg3Type, arg4Type, arg4Name);
                break;
            case 6:
                template = "def Loop(%s%s, %s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type, arg4Type, arg4Name);
                break;
            case 7:
                template = "def Loop(%s, %s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type,  arg3Type, arg4Type, arg4Name);
                break;
            case 8:
                template = "def Loop(%s%s, %s%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type, arg2Name, arg3Type, arg3Name, arg4Type);
                break;
            case 9:
                template = "def Loop(%s, %s%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,  arg2Type, arg2Name, arg3Type, arg3Name, arg4Type );
                break;
            case 10:
                template = "def Loop(%s%s, %s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type, arg3Name, arg4Type);
                break;
            case 11:
                template = "def Loop(%s, %s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,  arg2Type, arg3Type,arg3Name, arg4Type);
                break;
            case 12:
                template = "def Loop(%s%s, %s%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type,arg2Name, arg3Type, arg4Type);
                break;
            case 13:
                template = "def Loop(%s, %s%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type, arg4Type);
                break;
            case 14:
                template = "def Loop(%s%s, %s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type,  arg3Type, arg4Type);
                break;
            case 15:
                template = "def Loop(%s, %s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type,  arg4Type);
                break;
            default:
                System.out.println("Null pointer exception");
        }

        System.out.println(code);
        // Add code here to modify the template for the function with two arguments
    }
    @Override
    public void enterChoice(PythonParser.ChoiceContext ctx) {
        String arg1Type = null;
        String arg1Name = null;
        String arg2Type = null;
        String arg2Name = null;
        String arg3Type = null;
        String arg3Name = null;
        String arg4Type = null;
        String arg4Name = null;
        String template ="";
        String code ="";
        int templatetype=0;
        if(ctx.arg_python(0).type() != null){
            arg1Type = ctx.arg_python(0).type().getText();
            arg1Name = ctx.arg_python(0).ID().getText();
        }
        else{
            templatetype+=1;
            arg1Type  = ctx.arg_python(0).prule().function().getText();
        }
        if(ctx.arg_python(1).type() != null){
            arg2Type = ctx.arg_python(1).type().getText();
            arg2Name = ctx.arg_python(1).ID().getText();
        }else {
            templatetype+=2;
            arg2Type = ctx.arg_python(1).prule().function().getText();
        }
        if(ctx.arg_python(2).type() != null){
            arg3Type = ctx.arg_python(2).type().getText();
            arg3Name = ctx.arg_python(2).ID().getText();
        }else {
            templatetype+=4;
            arg3Type = ctx.arg_python(2).prule().function().getText();
        }
        if(ctx.arg_python(3).type() != null){
            arg4Type = ctx.arg_python(3).type().getText();
            arg4Name = ctx.arg_python(3).ID().getText();
        }else {
            templatetype+=8;
            arg4Type = ctx.arg_python(3).prule().function().getText();
        }
        switch (templatetype){
            case 0:
                template = "def Choice(%s%s, %s%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg2Name, arg3Type, arg3Name, arg4Type, arg4Name);
                break;
            case 1:
                template = "def Choice(%s, %s%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type, arg3Name, arg4Type, arg4Name);
                break;
            case 2:
                template = "def Choice(%s%s, %s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type, arg3Type, arg3Name, arg4Type, arg4Name);
                break;
            case 3:
                template = "def Choice(%s, %s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type,arg3Name,  arg4Type, arg4Name);
                break;
            case 4:
                template = "def Choice(%s%s, %s%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type,arg2Name, arg3Type, arg4Type, arg4Name);
                break;
            case 5:
                template = "def Choice(%s, %s%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type,  arg2Type,arg2Name, arg3Type, arg4Type, arg4Name);
                break;
            case 6:
                template = "def Choice(%s%s, %s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type, arg4Type, arg4Name);
                break;
            case 7:
                template = "def Choice(%s, %s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type,  arg3Type, arg4Type, arg4Name);
                break;
            case 8:
                template = "def Choice(%s%s, %s%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type, arg2Name, arg3Type, arg3Name, arg4Type);
                break;
            case 9:
                template = "def Choice(%s, %s%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,  arg2Type, arg2Name, arg3Type, arg3Name, arg4Type );
                break;
            case 10:
                template = "def Choice(%s%s, %s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type, arg3Name, arg4Type);
                break;
            case 11:
                template = "def Choice(%s, %s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,  arg2Type, arg3Type,arg3Name, arg4Type);
                break;
            case 12:
                template = "def Choice(%s%s, %s%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type,arg2Name, arg3Type, arg4Type);
                break;
            case 13:
                template = "def Choice(%s, %s%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type, arg4Type);
                break;
            case 14:
                template = "def Choice(%s%s, %s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type,  arg3Type, arg4Type);
                break;
            case 15:
                template = "def Choice(%s, %s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type,  arg4Type);
                break;
            default:
                System.out.println("Null pointer exception");
        }

        System.out.println(code);
        // Add code here to modify the template for the function with two arguments
    }
    @Override
    public void enterRepeat(PythonParser.RepeatContext ctx) {
        String arg1Type = null;
        String arg1Name = null;
        String arg2Type = null;
        String arg2Name = null;
        String arg3Type = null;
        String arg3Name = null;
        String arg4Type = null;
        String arg4Name = null;
        String template ="";
        String code ="";
        int templatetype=0;
        if(ctx.arg_python(0).type() != null){
            arg1Type = ctx.arg_python(0).type().getText();
            arg1Name = ctx.arg_python(0).ID().getText();
        }
        else{
            templatetype+=1;
            arg1Type  = ctx.arg_python(0).prule().function().getText();
        }
        if(ctx.arg_python(1).type() != null){
            arg2Type = ctx.arg_python(1).type().getText();
            arg2Name = ctx.arg_python(1).ID().getText();
        }else {
            templatetype+=2;
            arg2Type = ctx.arg_python(1).prule().function().getText();
        }
        if(ctx.arg_python(2).type() != null){
            arg3Type = ctx.arg_python(2).type().getText();
            arg3Name = ctx.arg_python(2).ID().getText();
        }else {
            templatetype+=4;
            arg3Type = ctx.arg_python(2).prule().function().getText();
        }
        if(ctx.arg_python(3).type() != null){
            arg4Type = ctx.arg_python(3).type().getText();
            arg4Name = ctx.arg_python(3).ID().getText();
        }else {
            templatetype+=8;
            arg4Type = ctx.arg_python(3).prule().function().getText();
        }
        switch (templatetype){
            case 0:
                template = "def Repeat(%s%s, %s%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg2Name, arg3Type, arg3Name, arg4Type, arg4Name);
                break;
            case 1:
                template = "def Repeat(%s, %s%s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type, arg3Name, arg4Type, arg4Name);
                break;
            case 2:
                template = "def Repeat(%s%s, %s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type, arg3Type, arg3Name, arg4Type, arg4Name);
                break;
            case 3:
                template = "def Repeat(%s, %s, %s%s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type,arg3Name,  arg4Type, arg4Name);
                break;
            case 4:
                template = "def Repeat(%s%s, %s%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type,arg2Name, arg3Type, arg4Type, arg4Name);
                break;
            case 5:
                template = "def Repeat(%s, %s%s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type,  arg2Type,arg2Name, arg3Type, arg4Type, arg4Name);
                break;
            case 6:
                template = "def Repeat(%s%s, %s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type, arg4Type, arg4Name);
                break;
            case 7:
                template = "def Repeat(%s, %s, %s, %s%s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type,  arg3Type, arg4Type, arg4Name);
                break;
            case 8:
                template = "def Repeat(%s%s, %s%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type, arg2Name, arg3Type, arg3Name, arg4Type);
                break;
            case 9:
                template = "def Repeat(%s, %s%s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,  arg2Type, arg2Name, arg3Type, arg3Name, arg4Type );
                break;
            case 10:
                template = "def Repeat(%s%s, %s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg1Name, arg2Type, arg3Type, arg3Name, arg4Type);
                break;
            case 11:
                template = "def Repeat(%s, %s, %s%s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,  arg2Type, arg3Type,arg3Name, arg4Type);
                break;
            case 12:
                template = "def Repeat(%s%s, %s%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type,arg2Name, arg3Type, arg4Type);
                break;
            case 13:
                template = "def Repeat(%s, %s%s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg2Name, arg3Type, arg4Type);
                break;
            case 14:
                template = "def Repeat(%s%s, %s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type,arg1Name, arg2Type,  arg3Type, arg4Type);
                break;
            case 15:
                template = "def Repeat(%s, %s, %s, %s):\n  // Add code here\n";
                code = String.format(template, arg1Type, arg2Type, arg3Type,  arg4Type);
                break;
            default:
                System.out.println("Null pointer exception");
        }

        System.out.println(code);
        // Add code here to modify the template for the function with two arguments
    }

}