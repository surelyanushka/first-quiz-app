package com.example.mysecond;

public class BookRepo {

    public  String question_set[] ={
            "What was the first science-fiction novel?",
            "What was the first book in the Harry Potter series?",
            "The character Robert Langdon is a professor at which university?",
            "Where is Divergent set?",
            "Which of these ISN'T in the Percy Jackson series?",
            "Who is the author of The Vampire Diaries?",
            "What is inscribed above the entrance of Wuthering Heights?",
            "What are the names of the servants who care for Rochester at Ferndean?",
            "In which branch of the Armed Forces did Reacher serve?",
            "Which king is murdered in William Shakespeare's Macbeth?"
    };

    public  String options[][] = {
            {"Frankenstein", "Don Quixote", "Stand on Zanzibar", "Dracula"},
            {"Harry Potter and the wizard", "Harry Potter and the Philosopher’s Stone","Harry Potter and the Giant Snake", "Harry Potter and the Pot of Gold"},
            {"Harvard", "Oxford","Yale", "Cambridge"},
            {"Seattle", "New York City","Los Angeles", "Chicago"},
            {"The Gods of Greece", "Mark of Athena","House of Hades", "The son of Neptune"},
            {"E.L.Smith", "RJ Smitz","John Green", "LJ Smith"},
            {"“Hindley Earnshaw, 1750”", "“Hareton Earnshaw, 1500”","Wuthering Heights", "Abandon all hope, ye who enter here"},
            {"John and Clara", "Reginald and Mrs. Fairfax","Mrs. Fairfax and Grace Poole", "John and Mary"},
            {"Army", "Navy","Air Force", "Marines"},
            {"Daniel", "Duncan","Derek", "David"}
            //{"", "", "", ""}
    };

    public String correct_ans[] ={
            "Frankenstein", "Harry Potter and the Philosopher’s Stone", "Harvard","Chicago", "The Gods of Greece", "LJ Smith",
            "“Hareton Earnshaw, 1500”","John and Mary","Army", "Duncan"};

    public String get_question(int i){
        String question = question_set[i];
        return question;
    }
    //Anushka Tawte
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

