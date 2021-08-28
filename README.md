# dynamic_verification
A dynamic verification tool using json configuration file instead of if statements

In some cases we may not be able to write *if statement*. Instead, to put the verification rule in a configuration file may be an alternative. This small tool is used to deal with such circumstance.

Some basic "if judgments" are supported including number comparisons (bigger or smaller), string comparisons (contains, startsWith, endsWith etc.) and collections comparisons. If you want to add custom functions, edit StaticOperator.java and put it into OPERATIONMAP declared in OperationType.java.

For the method to be executed if the verification is passed, it only support nonparametric method, since the overhead on determining whether there is a method overloading will seriously degrade the performance.
