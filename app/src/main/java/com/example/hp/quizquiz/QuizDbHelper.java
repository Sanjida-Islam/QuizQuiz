package com.example.hp.quizquiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.hp.quizquiz.QuizContract.*;

import java.util.ArrayList;
import java.util.List;

public class QuizDbHelper extends SQLiteOpenHelper {

    private static  final  String DATABASE_NAME = "QuizQuiz.db";
    private static  final  int DATABASE_VERSION = 1;

    private  SQLiteDatabase db;

    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        this.db = db;

        final  String SQL_CREATE_QUESTION_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_ANS_NUMBER + " INTEGER, " +
                QuestionsTable.COLUMN_DIFFICULTY + " TEXT" +
                ")";

        db.execSQL(SQL_CREATE_QUESTION_TABLE);
        fillQuestionTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    private  void  fillQuestionTable(){

        Question q1 = new Question("OOPP paradigm based on the concept of ", "Functions", "Objects", "Statements", 2, Question.DIFFICULTY_EASY);
        addQuestion(q1);
        Question q2 = new Question("Class often known as", "Signature", "Methods", "All", 1, Question.DIFFICULTY_EASY);
        addQuestion(q2);
        Question q3 = new Question("Functions often known as", "Signature", "Methods", "Model", 2, Question.DIFFICULTY_EASY);
        addQuestion(q3);
        Question q4 = new Question("Dynamic method dispatch at", "Compile time", "Runtime", "None", 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q4);
        Question q5 = new Question("In aggregation, objects have their own life cycle but there is an", "Ownership", "Membership", "All", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q5);
        Question q6 = new Question("What type of language java is?", "Weakly", "Strongly", "Modarate", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q6);
        Question q7 = new Question("Constructed data types you define yourself using", "Structs", "Unions", "Both", 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q7);
        Question q8 = new Question("What is the smallest int type?", "Short", "Byte", "Bit", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q8);
        Question q9 = new Question("Static binding uses which information for binding?", "Type", "Object", "Both", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q9);
        Question q10 = new Question("What was the first phone released that ran the Android OS?", "Google gPhone", "T-Mobile G1", "Motorola Droid", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q10);
        Question q11 = new Question("Which of these is a type of stream in Java?", "Integer stream", "Short stream", "Byte stream", 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q11);
        Question q12 = new Question("Which of these class is used to read from byte array?", "InputStream", "ArrayInputStream", "ByteArrayInputStream", 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q12);
        Question q13 = new Question("Which of these is used to read a string from the input stream?", "get()", "read()", "read_line()", 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q13);
        Question q14 = new Question("Which of these class is implemented by FilterInputStream class?", "FileInputStream", "BufferedInputStream", "InputStream", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q14);
        Question q15 = new Question("Which of these class contains the methods print() & println()?", "BUfferedOutputStream", "PrintStream", "System.out", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q15);
        Question q16 = new Question("What is Parent class of Activity?", "Context", "Object", "ActivityGroup", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q16);
        Question q17 = new Question("Which piece of code used in Android is not open source?", "Keypad driver", "Keypad driver", "WiFi driver", 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q17);
        Question q18 = new Question("What is the 'Progress' parameter type of Async Task?", "String", "Integer", "Void", 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q18);
        Question q19 = new Question("Selection statements: ", "switch", "if", "Both", 3, Question.DIFFICULTY_EASY);
        addQuestion(q19);
        Question q20 = new Question("What is the main difference between set and list in android?", "Set can't contain duplicate values", "List may contain duplicate values", "Both", 3, Question.DIFFICULTY_EASY);
        addQuestion(q20);
        Question q21 = new Question("What does AWT stands for?", "Abstract Window Toolkit", "d.Abstract Writing Toolkit", "All Window Tools", 1, Question.DIFFICULTY_EASY);
        addQuestion(q21);
        Question q22 = new Question("What are the wake locks available in android?", "SCREEN_DIM_WAKE_LOCK", "FULL_WAKE_LOCK", "FULL_WAKE_LOCK", 2, Question.DIFFICULTY_EASY);
        addQuestion(q22);
        Question q23 = new Question("What is APK in android?", "c. Android packaging kit", "Android packages", "None of the above.", 1, Question.DIFFICULTY_EASY);
        addQuestion(q23);
        Question q24 = new Question("Is it possible activity without UI in android?", "Yes,it's possible", "No, it's not possible", "We can't say", 1, Question.DIFFICULTY_EASY);
        addQuestion(q24);
        Question q25 = new Question("How do you join two notifications in android?", "Give same id for both notifications", "It is not possible in android", "Both", 3, Question.DIFFICULTY_EASY);
        addQuestion(q25);
        Question q26 = new Question("Which method downloads content in Async Task?", "publishProgress()", "doInBackground()", "onProgressUpdate()", 2, Question.DIFFICULTY_EASY);
        addQuestion(q26);
        Question q27 = new Question("What is the name of the AI inside Android?", "Home", "Google secretary", "Google assistant", 3, Question.DIFFICULTY_EASY);
        addQuestion(q27);
        Question q28 = new Question("How to store heavy structured data in android?", "SQlite database", "Shared Preferences", "Cursor", 1, Question.DIFFICULTY_EASY);
        addQuestion(q28);
        Question q29 = new Question("What operating system is used as the base of Android stack?", "windows", "Linux", "java", 2, Question.DIFFICULTY_EASY);
        addQuestion(q29);
        Question q30 = new Question("What year was development on the Dalvik virtual machine started ?", "2003", "b)2005", "b)2007", 2, Question.DIFFICULTY_EASY);
        addQuestion(q30);
        Question q31 = new Question("How to move services to foreground in android?", "startFordgroud", "Services always work in Foreground only", "No,We can't do this query", 1, Question.DIFFICULTY_HARD);
        addQuestion(q31);
        Question q32 = new Question("What is contained within the manifest xml file?", "The list of strings used in the app", "The permissions the app requires", "All other choices", 2, Question.DIFFICULTY_HARD);
        addQuestion(q32);
        Question q33 = new Question("Which one is NOT related to fragment class?", "preferenceFragment", "d.cursorFragment", "dialogFragment", 2, Question.DIFFICULTY_HARD);
        addQuestion(q33);
        Question q34 = new Question("Which of these are not one of the three main components of the APK?", "Webkit", "Dalvik Executable", "Resources", 1, Question.DIFFICULTY_HARD);
        addQuestion(q34);
        Question q35 = new Question("Which method works to read next element from JSON array?", "nextInt", "nextString", "Both", 3, Question.DIFFICULTY_HARD);
        addQuestion(q35);
        Question q36 = new Question("Which class contains various methods for manipulating arrays in android?", "java.lang.nullpointerexception", "java.lang.Class", "java.util.Arrays", 3, Question.DIFFICULTY_HARD);
        addQuestion(q36);
        Question q37 = new Question("Which component is not activated by an Intent?", "activity", "contentProvider", "services", 2, Question.DIFFICULTY_HARD);
        addQuestion(q37);
        Question q38 = new Question("What are the functionalities in asyncTask in android?", "onPostExecution()", "onPreExecution()", "onProgressUpdate()", 1, Question.DIFFICULTY_HARD);
        addQuestion(q38);
        Question q39 = new Question("Which of the following add a click listener to items in a listView?", "onItemClicked", "onItemClickListener", "onClickListener", 2, Question.DIFFICULTY_HARD);
        addQuestion(q39);
        Question q40 = new Question("What if Flags in Intent", "Metadat for an Bundle", "Metadat for an intent", "All of them", 2, Question.DIFFICULTY_HARD);
        addQuestion(q40);
        Question q41 = new Question("What does AOAP stands for?", "Android open source project", "Android open source protocol", "Android open system programming", 1, Question.DIFFICULTY_HARD);
        addQuestion(q41);
        Question q42 = new Question("When contentProvider would be activated?", "using Intent", "using ContentResolver", "using SQLite", 2, Question.DIFFICULTY_HARD);
        addQuestion(q42);
        Question q43 = new Question("Which service isn't offered by Volley?", "Auto Scheduling", "Auto Ordering", "Multiple Connections", 2, Question.DIFFICULTY_HARD);
        addQuestion(q43);
        Question q44 = new Question("In which, OkHttp works as a networking layer?", "RetroFit", "Retrofit 1", "Retrofit 2", 3, Question.DIFFICULTY_HARD);
        addQuestion(q44);
        Question q45 = new Question("Which of the following is NOT a state in the lifecycle of a service?", "pasued", "Destroyed", "Starting", 1, Question.DIFFICULTY_HARD);
        addQuestion(q45);






    }

    private  void  addQuestion(Question question){

        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_ANS_NUMBER,question.getAnsNumber());
        cv.put(QuestionsTable.COLUMN_DIFFICULTY,question.getDifficulty());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }


    public ArrayList<Question> getAllQuestion(){
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()){
            do{
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION )));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnsNumber(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANS_NUMBER)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                questionList.add(question);
            } while (c.moveToNext());
        }
        c.close();
        return questionList;
    }




    public ArrayList<Question> getQuestion(String difficulty){
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();

        String[] selectionArgs = new String[]{difficulty};
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME + " WHERE " + QuestionsTable.COLUMN_DIFFICULTY + " = ?", selectionArgs);

        if (c.moveToFirst()){
            do{
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION )));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnsNumber(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANS_NUMBER)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                questionList.add(question);
            } while (c.moveToNext());
        }
        c.close();
        return questionList;
    }
}
