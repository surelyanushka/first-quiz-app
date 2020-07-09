package com.example.mysecond;

public class Repository {

    public  String question_set[] ={
            "What is a correct syntax to output \"Hello World\" in Python?",
            "What will be the output of the following code :\n" + "print type(type(int))",
            "What is called when a function is defined inside a class?",
            "Which of the following is the use of id() function in python?",
            "Which operator is overloaded by the or() function?",
            "Which of these is not a core data type?",
            "Which of the following function convert a string to a float in python?",
            "What command is used to insert 6 in a list ‘‘L’’ at 3rd position ?",
            "For tuples and list which is correct?",
            "Which method can be used to remove any whitespace from both the beginning and the end of a string?"
    };

    public  String options[][] = {
            {"print(\"Hello World\")", "println(\"Hello World\")", "print \"Hello World\"", "cout>>Hello World"},
            {"type 'int'", "type 'type'","Error", "0"},
            {"Module", "Class","Another Function", "Method"},
            {"Id returns the identity of the object", "Every object doesn't have a unique id","All of the above", "None of the above"},
            {"|", "||","//", "/"},
            {"Lists", "Dictionary","Tuples", "Class"},
            {"int(x [,base])", "long(x [,base] )","float(x)", "str(x)"},
            {"L.insert(2,6)", " L.insert(3,6)","L.add(3,6)", "L.append(2,6)"},
            {" List and tuples both are mutable", "List is mutable whereas tuples are immutable.","List and tuples both are immutable", "List is immutable whereas tuples are mutable"},
            {"strip()", "trim()","len()", "cut()"},
            //{"", "", "", ""}
    };

    public String correct_ans[] ={
            "print(\"Hello World\")", "type 'type'", "Method","Id returns the identity of the object", "|", "Class", "float(x)","L.insert(2,6)", "List is mutable whereas tuples are immutable.","strip()"};

    public String get_question(int i){
        String question = question_set[i];
        return question;
    }

    public String get_option1(int i){
            String option = options[i][0];
            return option;
    }
    public String get_option2(int i){
        String option = options[i][1];
        return option;
    }
    public String get_option3(int i){
        String option = options[i][2];
        return option;
    }
    public String get_option4(int i){
        String option = options[i][3];
        return option;
    }

    public String get_correct_ans(int i){
        String answer = correct_ans[i];
        return answer;
    }
}
