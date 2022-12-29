
package enterprise.interpreter;

import enterprise.interpreter.interpreterElements.AndExpression;
import enterprise.interpreter.interpreterElements.Expression;
import enterprise.interpreter.interpreterElements.OrExpression;
import enterprise.interpreter.interpreterElements.TerminalExpression;

public class InterpreterMain {

    /*
    Interpreter is a behavioral design pattern that used to define a grammatical representation
    for a language and provides an interpreter to deal with this grammar.

    Интерпретатор — это поведенческий шаблон проектирования, который используется для определения
    грамматического представления языка и предоставляет интерпретатор для работы с этой грамматикой.
     */

    public static void main(String[] args) {

        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEeExpression();

        System.out.println("Does developer knows Java Core: " + isJava.interpret("Java Core"));
        System.out.println("Does developer knows Java EE: " + isJavaEE.interpret("Java Spring"));
    }

    public static Expression getJavaExpression() {

        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEeExpression() {

        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
