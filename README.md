# dynamic_verification
A dynamic verification tool using json configuration file instead of if statements.
---

In some cases we may not be able to write *if statement*. Instead, to put the verification rule in a configuration file may be an alternative and makes it more flexible. This small tool is used to deal with such circumstance.

__e.g.__  
Replace code like
  `if(student.age) < 18 {
    student.goToSchool()
  }`  
with
  `{"operator": "LT", "attribute": "age", "rule": 18, "action": "goToSchool", "param": null}` outside of the source code.
  
- ***operator*** refers to the predicate of __if statement__. Valid inputs includes "GT" (greater than), "LT" (less than), "EQ" (equals), "STRCONTAINS" (String.contains) etc., which can be found in StaticOperator.java.  
- ***attribute*** refers to the attribute of a certain Java bean.  
- ***action*** refers to the method to be executed if the __if statement__ is true.  
- ***param*** refers to the variable parameters the method needs.  

Here are some valid json configurations:  
`{"operator": "LT", "attribute": "age", "rule": 18, "action": "goToSchool", "param": null}`  
`{"operator": "ENDSWITH", "attribute": "mobile", "rule": "0000", "action": "doHomework", "param": null}`  
`{"operator": "LISTCONTAINS", "attribute": "certificate", "rule": "driver license", "action": "drive", "param": null}`  
`{"operator": "LT", "attribute": "age", "rule": 18, "action": "doHomework", "param": [10, "history"]}`  


Some basic "if judgments" are supported including number comparisons (bigger or smaller), string comparisons (contains, startsWith, endsWith etc.) and collections comparisons. If you want to add custom functions, edit StaticOperator.java and put it into OPERATIONMAP declared in OperationType.java. 
