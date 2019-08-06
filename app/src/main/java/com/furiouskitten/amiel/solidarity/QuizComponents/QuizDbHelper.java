package com.furiouskitten.amiel.solidarity.QuizComponents;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.furiouskitten.amiel.solidarity.BookContents.UBCV3.UbcvThreeChapterOne;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV4.UbcvFourChapterTwo;
import com.furiouskitten.amiel.solidarity.QuizComponents.QuizContract.*;

import java.util.ArrayList;
import java.util.List;


public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "SolidarityQuizDatabase.db";
    private static final int DATABASE_VERSION = 1;

    private static QuizDbHelper instance;

    private SQLiteDatabase db;

    private QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static synchronized QuizDbHelper getInstance(Context context) {
        if (instance == null) {
            instance = new QuizDbHelper(context.getApplicationContext());
        }
        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_CATEGORIES_TABLE = "CREATE TABLE " +
                CategoriesTable.TABLE_NAME + "( " +
                CategoriesTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                CategoriesTable.COLUMN_NAME + " TEXT " +
                ")";

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER, " +
                QuestionsTable.COLUMN_DIFFICULTY + " TEXT, " +
                QuestionsTable.COLUMN_CATEGORY_ID + " INTEGER, " +
                "FOREIGN KEY(" + QuestionsTable.COLUMN_CATEGORY_ID + ") REFERENCES " +
                CategoriesTable.TABLE_NAME + "(" + CategoriesTable._ID + ")" + "ON DELETE CASCADE" +
                ")";

        db.execSQL(SQL_CREATE_CATEGORIES_TABLE);
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillCategoriesTable();
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + CategoriesTable.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
        db.setForeignKeyConstraintsEnabled(true);
    }

    private void fillCategoriesTable() {
        Category c1 = new Category("Chapter One");
        insertCategory(c1);
        Category c2 = new Category("Chapter Two");
        insertCategory(c2);
        Category c3 = new Category("Chapter Three");
        insertCategory(c3);
        Category c4 = new Category("Chapter Four");
        insertCategory(c4);
        Category c5 = new Category("Chapter Five");
        insertCategory(c5);
        Category c6 = new Category("Chapter Six");
        insertCategory(c6);
        Category c7 = new Category("Chapter Seven");
        insertCategory(c7);
        Category c8 = new Category("Chapter Eight");
        insertCategory(c8);
        Category c9 = new Category("Chapter Nine");
        insertCategory(c9);
        Category c10 = new Category("Chapter Ten");
        insertCategory(c10);
        Category c11 = new Category("Chapter Eleven");
        insertCategory(c11);
        Category c12 = new Category("Chapter Twelve");
        insertCategory(c12);
        Category c13 = new Category("Chapter Thirteen");
        insertCategory(c13);
        Category c14 = new Category("Chapter Fourteen");
        insertCategory(c14);
        Category c15 = new Category("Chapter Fifteen");
        insertCategory(c15);
    }

    public void addCategory(Category category){
        db = getWritableDatabase();
        insertCategory(category);
    }

    public void addCategories(List<Category> categories){
        db = getWritableDatabase();
        for(Category category : categories){
            insertCategory(category);
        }
    }

    private void insertCategory(Category category) {

        ContentValues cv = new ContentValues();
        cv.put(CategoriesTable.COLUMN_NAME, category.getName());
        db.insert(CategoriesTable.TABLE_NAME, null, cv);
    }

    private void fillQuestionsTable() {

        //test fill up

            /*
            Question qex = new Question("Question", "Choice One", Choice Two, "Choice Three", AnswerNumber)
            Question.BOOK_NUMBER, BOOK_CHAPTER);
           */

         //UbcvOneChapterOne

        Question q1 = new Question("When did Batangas liberated themselves from the Japanese Colony?",
                "March 11, 1945", "May 12, 1945", "March 11, 1946", 1,
                Question.UBCV_ONE, Category.CHAPTER_ONE);
        insertQuestion(q1);

        Question q2 = new Question("They we're the military police arm of the Imperial Japanese Army from 1881 to 1945.",
                "Japanese Kempeitai", "Philippine National Police", "Seal Team 6", 1,
                Question.UBCV_ONE, Category.CHAPTER_ONE);
        insertQuestion(q2);

        Question q3 = new Question("What was the War that made Batangas fall to ashes?",
                "Vietnamese War", "Civil War", "World War II", 3,
                Question.UBCV_ONE, Category.CHAPTER_ONE);
        insertQuestion(q3);

        Question q4 = new Question("For how many years did the Japanese Empire ruled the Philippines?",
                "333 years", "3 years", "5 years", 2,
                Question.UBCV_ONE, Category.CHAPTER_ONE);
        insertQuestion(q4);

        Question q5 = new Question("What system became paralyzed due to lack of school buildings and teaching paraphernalia?",
                "Educational System", "Political System", "Defense System", 1,
                Question.UBCV_ONE, Category.CHAPTER_ONE);
        insertQuestion(q5);

        //UbcvOneChapterTwo

        Question q6 = new Question("Who is the Fourth President of the Western Philippine College?",
                "Epifania De Los Santos ", "Flordeliza M. Arguelles", "Florelita F. Gutierrez", 2,
                Question.UBCV_ONE, Category.CHAPTER_TWO);
        insertQuestion(q6);

        Question q7 = new Question("Where did the idea of putting up a school took shape?",
                "Mr. Juan Javier's Garden", "Mr. Juan Javier's living Room", "Mr. Juan Javier's Printing Press", 3,
                Question.UBCV_ONE, Category.CHAPTER_TWO);
        insertQuestion(q7);

        Question q8 = new Question("In 1946, The number of College Students rose from 48 up to __?",
                "68", "88", "78", 3,
                Question.UBCV_ONE, Category.CHAPTER_TWO);
        insertQuestion(q8);

        Question q9 = new Question("How many enrollees were registered during the 1951 Opening Classes?",
                "700", "600", "710", 1,
                Question.UBCV_ONE, Category.CHAPTER_TWO);
        insertQuestion(q9);

        Question q10 = new Question("What was the Building that Mr. Javier rented in 1947?",
                "Gozos Bldg.", "Oblates of St. John Bldg.", "Knights of Columbus Bldg.", 3,
                Question.UBCV_ONE, Category.CHAPTER_TWO);
        insertQuestion(q10);

        //UbcvOneChapterThree

        Question q11 = new Question("Who bought home the title ''Jr. Mr. Philippines?",
                "Prolifico Peralco.", "Pacifico Pasno", "Celebes Pasno.", 2,
                Question.UBCV_ONE, Category.CHAPTER_THREE);
        insertQuestion(q11);

        Question q12 = new Question("Who bought home the title ''Jr. Mr. Philippines?",
                "Prolifico Peralco.", "Pacifico Pasno", "Celebes Pasno.", 2,
                Question.UBCV_ONE, Category.CHAPTER_THREE);
        insertQuestion(q12);

        Question q13 = new Question("Who was the the Student Teachers' Literary Club President that produced plays and radio podcasts?",
                "Prolifico Peralco.", "Pacifico Pasno", "Alejandro Esmiller.", 3,
                Question.UBCV_ONE, Category.CHAPTER_THREE);
        insertQuestion(q13);

        Question q14 = new Question("Who was the the Student Teachers' Literary Club President that produced plays and radio podcasts?",
                "Prolifico Peralco.", "Pacifico Pasno", "Alejandro Esmiller.", 3,
                Question.UBCV_ONE, Category.CHAPTER_THREE);
        insertQuestion(q14);

        Question q15 = new Question("What was Mr. Javier's Trademark?",
                "A Jeep", "A Motorbike", "A car", 1,
                Question.UBCV_ONE, Category.CHAPTER_THREE);
        insertQuestion(q15);

        //UbcvOneChapterFour

        Question q16 = new Question("Who was elected chairman of the Executive Board in 1966?",
                "Pacifico Pasno", "Flordeliza Arguelles", "Dr. Abelardo B. Perez", 3,
                Question.UBCV_ONE, Category.CHAPTER_FOUR);
        insertQuestion(q16);

        Question q17 = new Question("She was the first MA graduate at that time.",
                "Crispina Faller", "Mercedes Macarandang", "Lydia M. Profeta", 2,
                Question.UBCV_ONE, Category.CHAPTER_FOUR);
        insertQuestion(q17);

        Question q18 = new Question("all graduating students were required to take this exam for the assessment of their aptitudes and skills and to prepare them for college.",
                "UAAP", "NCAA", "NCEE", 3,
                Question.UBCV_ONE, Category.CHAPTER_FOUR);
        insertQuestion(q18);

        //UbcvOneChapterFive

        Question q19 = new Question("How much percent were needed to hike up on tuition for the welfare of the students and the salary of the teachers?",
                "7%", "4%", "5%", 3,
                Question.UBCV_ONE, Category.CHAPTER_FIVE);
        insertQuestion(q19);

        Question q20 = new Question("How many commerce accounting majors from WPC passed the CPA examination in 1981?",
                "100", "31", "33", 3,
                Question.UBCV_ONE, Category.CHAPTER_FIVE);
        insertQuestion(q20);

        Question q21 = new Question("She was the first national winner in the National Secondary Schools Press Conference in Editing and copy Reading in 1983",
                "Abegayle Machelle M. Perez", "Armen Perez", "Mrs. Araceli Lucena ", 1,
                Question.UBCV_ONE, Category.CHAPTER_FIVE);
        insertQuestion(q21);

        //UbcvOneChapterSix

        Question q22 = new Question("When did the College of Law reopened?",
                "July 1993", "June 1993", "August 1997", 2,
                Question.UBCV_ONE, Category.CHAPTER_SIX);
        insertQuestion(q22);

        Question q23 = new Question("What was the WPC's weakest point?",
                "Limited Reseach Output", "Limited space", "Limited Faculy and Personnel", 1,
                Question.UBCV_ONE, Category.CHAPTER_SIX);
        insertQuestion(q23);

        Question q24 = new Question("When did the Alliance for Networking and Technology started?",
                "1985", "1972", "1986", 3,
                Question.UBCV_ONE, Category.CHAPTER_SIX);
        insertQuestion(q24);

        //UbcvOneChapterSeven

        Question q25 = new Question("How many enrollees back then when WPC celebrated their 50th Anniversary?",
                "13, 465 students", "14, 465 students", "12, 465 students", 2,
                Question.UBCV_ONE, Category.CHAPTER_SEVEN);
        insertQuestion(q25);

        Question q26 = new Question("When was the WPC granted the University status?",
                "August 1,1996", "August 2, 1997", "August 3, 1998", 1,
                Question.UBCV_ONE, Category.CHAPTER_SEVEN);
        insertQuestion(q26);

        Question q27 = new Question("Who was elected chairman of the Executive Board in 1966?",
                "Pacifico Pasno", "Flordeliza Arguelles", "Dr. Abelardo B. Perez", 3,
                Question.UBCV_ONE, Category.CHAPTER_SEVEN);
        insertQuestion(q27);

        //UbcvOneChapterEight

        Question q28 = new Question("The University of Batangas received citations from _______ for the prestigious awards and most number of courses offered and most number of accredited programs",
                "PACUCOA", "PRISAM", "STCAA", 1,
                Question.UBCV_ONE, Category.CHAPTER_EIGHT);
        insertQuestion(q28);

        Question q29 = new Question("When the celebration of the University's foundation annually held?",
                "first week of February", "third week of March", "third week of February", 3,
                Question.UBCV_ONE, Category.CHAPTER_EIGHT);
        insertQuestion(q29);

        Question q30 = new Question("Official Sim Card of the University of Batangas",
                "UBAT Sim", "UBATS Sim", "UBSIM", 1,
                Question.UBCV_ONE, Category.CHAPTER_EIGHT);
        insertQuestion(q30);

        //UbcvOneChapterNine

        Question q31 = new Question("The date when the Legacy Of Love was launched",
                "February 22, 2011", "February 22, 2012", "January 22, 2011", 1,
                Question.UBCV_ONE, Category.CHAPTER_NINE);
        insertQuestion(q31);

        Question q32 = new Question("Course Book of UBCV 101",
                "Legacy of Hope", "Burning Love", "Legacy of Love", 3,
                Question.UBCV_ONE, Category.CHAPTER_NINE);
        insertQuestion(q32);


        //UbcvTwoChapterOne

            Question q33 = new Question("How many days did God needed to create the Earth?",
                "3", "6", "7", 2,
                Question.UBCV_TWO, Category.CHAPTER_ONE);
        insertQuestion(q33);

        Question q34 = new Question("What is God's most glorious masterpiece?",
                "Human Beings", "Animals", "Plants", 1,
                Question.UBCV_TWO, Category.CHAPTER_ONE);
        insertQuestion(q34);

        Question q35 = new Question("Who is the Author of the book, A Purpose-Driven Life? ",
                "Rick Astley", "Rick Oswald", "Rick Warren", 3,
                Question.UBCV_TWO, Category.CHAPTER_ONE);
        insertQuestion(q35);

        //UbcvTwoChapterTwo

        Question q36 = new Question("God's characteristic in which, he knows everything.",
                "Omnipotent", "Omnipresent", "Omniscience", 3,
                Question.UBCV_TWO, Category.CHAPTER_TWO);
        insertQuestion(q36);

        Question q37 = new Question("God's Wisdom may also refer as?",
                "Hidden Wisdom", "Obvious Wisdom", "Just Wisdom", 1,
                Question.UBCV_TWO, Category.CHAPTER_TWO);
        insertQuestion(q37);

        Question q38 = new Question("God's characteristic in which, he is the most powerful. ",
                "Omniscience", "Omnipresent", "Omnipotent", 3,
                Question.UBCV_TWO, Category.CHAPTER_TWO);
        insertQuestion(q38);

        //UbcvTwoChapterThree

        Question q39 = new Question("'in whom ye also are built together for an habitation of God through the Spirit.'",
                " Ephesians 2:13", "Ephesians 2:22", " Ephesians 1:22", 2,
                Question.UBCV_TWO, Category.CHAPTER_THREE);
        insertQuestion(q39);

        Question q40 = new Question("'for where two or three are gathered together in my name, there am I in the midst of them.'",
                "Matthew 18:1", "Matthew 18:20", "Matthew 18:5", 2,
                Question.UBCV_TWO, Category.CHAPTER_THREE);
        insertQuestion(q40);

        Question q41 = new Question("'if  I ascend up into heaven, thou art there: if I make my bed in hell, behold, thou art there.'",
                "Psalm 139:4 ", "Psalm 139:1 ", "Psalm 139:8 ", 3,
                Question.UBCV_TWO, Category.CHAPTER_THREE);
        insertQuestion(q41);

        //UbcvTwoChapterFour

        Question q42 = new Question("'For with God nothing shall be impossible.'",
                "Luke 1:37", "Ephesians 2:22", " Luke 1:32", 1,
                Question.UBCV_TWO, Category.CHAPTER_FOUR);
        insertQuestion(q42);

        Question q43 = new Question("'I know that thou canst do everything, and that no thought can be withholder from thee. '",
                "Job 42:5", "Job 42:2 ", "Ephesians 2:22 ", 2,
                Question.UBCV_TWO, Category.CHAPTER_FOUR);
        insertQuestion(q43);

        Question q44 = new Question("'But Jesus beheld them, and said unto them, With men this is impossible; but with God all things are possible'",
                "Matthew 19:26", "Psalm 139:1 ", "Matthew 19:23  ", 1,
                Question.UBCV_TWO, Category.CHAPTER_FOUR);
        insertQuestion(q44);

        //UbcvTwoChapterFive

        Question q45 = new Question("'Known to God are all his works from the beginning of the world.'",
                "Matthew 19:26", "Psalm 139:1", "Matthew 19:23", 1,
                Question.UBCV_TWO, Category.CHAPTER_FIVE);
        insertQuestion(q45);

        Question q46 = new Question("Who saved the inhabitants of Keilah?",
                "David", "Goliath", "John", 1,
                Question.UBCV_TWO, Category.CHAPTER_FIVE);
        insertQuestion(q46);

        Question q47 = new Question("'The Lord looketh from ________; he beholdeth all the sons of men. '",
                "Sky", "Land", "Heaven", 3,
                Question.UBCV_TWO, Category.CHAPTER_FIVE);
        insertQuestion(q47);

        //UbcvTwoChapterSix

        Question q48 = new Question("'Who is the image of the invisible God, the firstborn of every creature.'",
                "Acts 15:18", "Colossians 1:15", "Acts 15:1", 2,
                Question.UBCV_TWO, Category.CHAPTER_SIX);
        insertQuestion(q48);

        Question q49 = new Question("Now unto the King eternal, immortal, invisible, the only wise God, be honour and glory forever and ever. Amen.",
                "I Timothy 1:17", "Acts 15:18", "Colossians 1:15", 1,
                Question.UBCV_TWO, Category.CHAPTER_SIX);
        insertQuestion(q49);

        Question q50 = new Question("'For the invisible things of him from the creation of the world are clearly seen, being understood by the things that are made, even his eternal power and Godhead; so that they are without excuse.'",
                    "Acts 15:18", "I Timothy 1:17", " Romans 1:20", 3,
                Question.UBCV_TWO, Category.CHAPTER_SIX);
        insertQuestion(q50);

        //UbcvTwoChapterSeven

        Question q51 = new Question("'Man cannot gain ___________ by his own power, instead God must grant it to him.'",
                "Courage", "Knowledge", "Immortality", 3,
                Question.UBCV_TWO, Category.CHAPTER_SEVEN);
        insertQuestion(q51);

        Question q52 = new Question("Now unto the King eternal, immortal, invisible, the only wise God, be honour and glory forever and ever. Amen.",
                "I Timothy 1:17", "Acts 15:18", "Colossians 1:15", 1,
                Question.UBCV_TWO, Category.CHAPTER_SEVEN);
        insertQuestion(q52);

        Question q53 = new Question("What is the Conclusion of the Lesson?",
                "Men can make themselves immortal", "No one is Immortal", "Only God is immortal in and of Himself", 3,
                Question.UBCV_TWO, Category.CHAPTER_SEVEN);
        insertQuestion(q53);

        //UbcvTwoChapterEight

        Question q54 = new Question("To be holy means to be separate from _____",
                "evil", "junk foods", "money", 1,
                Question.UBCV_TWO, Category.CHAPTER_EIGHT);
        insertQuestion(q54);

        Question q55 = new Question("Because it is written, Be ye holy; for I am holy.",
                "I Timothy 1:17", "I Peter 1:16-25 ", "Colossians 1:15", 2,
                Question.UBCV_TWO, Category.CHAPTER_EIGHT);
        insertQuestion(q55);

        Question q56 = new Question("And one cried unto another, and said Holy, holy, holy, is the Lord of hosts: the whole earth is full of his glory.",
                "I Peter 1:16-25 ", "I Timothy 1:17", "Isaiah 6:3", 3,
                Question.UBCV_TWO, Category.CHAPTER_EIGHT);
        insertQuestion(q56);

        //UbcvTwoChapterNine

        Question q57 = new Question("What is the Conclusion of the lesson?",
                "There is no God", "God never exist", "God has always existed and He always will", 3,
                Question.UBCV_TWO, Category.CHAPTER_NINE);
        insertQuestion(q57);

        Question q58 = new Question("'Now unto the King eternal, immortal, invisible, the only wise God, be honour and glory for ever and ever. Amen.'",
                "I Peter 1:16-25", "I Timothy 1:17", "Colossians 1:15", 2,
                Question.UBCV_TWO, Category.CHAPTER_NINE);
        insertQuestion(q58);

        Question q59 = new Question("'And Abraham planted a grove in Beersheba, and called there on the name of the Lord, the everlasting God.'",
                "Genesis 21:33 ", "I Timothy 1:17", "Isaiah 6:3", 1,
                Question.UBCV_TWO, Category.CHAPTER_NINE);
        insertQuestion(q59);

        //UbcvTwoChapterTen

        Question q60 = new Question("What is the Conclusion of the lesson?",
                "God loves us more than we can ever know", "God never exist", "God has always existed and He always will", 1,
                Question.UBCV_TWO, Category.CHAPTER_TEN);
        insertQuestion(q60);

        Question q61 = new Question("'And now abideth faith, hope, charity (love), these three; but the greatest of these is charity'",
                "I Peter 1:16-25", "I Timothy 1:17", "I Corinthians 13:13", 3,
                Question.UBCV_TWO, Category.CHAPTER_TEN);
        insertQuestion(q61);

        Question q62 = new Question("'But God commendeth his love toward us, in that, while we were yet sinners, Christ died for us.'",
                "Genesis 21:33 ", "Romans 5:8", "Isaiah 6:3", 2,
                Question.UBCV_TWO, Category.CHAPTER_TEN);
        insertQuestion(q62);

        //UbcvTwoChapterEleven

        Question q63 = new Question("What is the Conclusion of the lesson?",
                "God loves us more than we can ever know", "Whatever God says He will do.", "God has always existed and He always will", 2,
                Question.UBCV_TWO, Category.CHAPTER_ELEVEN);
        insertQuestion(q63);

        Question q64 = new Question("'Sanctify them through truth: thy word is truth'",
                "I Peter 1:16-25", "I Timothy 1:17", "John 17:17", 3,
                Question.UBCV_TWO, Category.CHAPTER_ELEVEN);
        insertQuestion(q64);

        Question q65 = new Question("'The fear of the Lord is clean, enduring forever: the judgments of the Lord are true and righteous altogether. '",
                "Genesis 21:33 ", "Psalm 19:9 ", "Isaiah 6:3", 2,
                Question.UBCV_TWO, Category.CHAPTER_ELEVEN);
        insertQuestion(q65);

        //UbcvTwoChapterTwelve

        Question q66 = new Question("What is the Meaning of the lesson?",
                "God loves us more than we can ever know", "God is someone we can get to know.", "God has always existed and He always will", 2,
                Question.UBCV_TWO, Category.CHAPTER_TWELVE);
        insertQuestion(q66);

        Question q67 = new Question("'No man hath seen God at any time; the only begotten Son, which is in the bosom of the Father, he hath declared him.'",
                "I Peter 1:16-25", "I Timothy 1:17", "John 1:18", 3,
                Question.UBCV_TWO, Category.CHAPTER_TWELVE);
        insertQuestion(q67);

        Question q68 = new Question("'Who only hath immortality, dwelling in the light which no may can approach unto; whom no man hath seen, nor can see: to whom be honour and power everlasting. Amen.'",
                "Genesis 21:33 ", "I Timothy 6:16", "Isaiah 6:3", 2,
                Question.UBCV_TWO, Category.CHAPTER_TWELVE);
        insertQuestion(q68);

        //UbcvTwoChapterThirteen

        Question q69 = new Question("'Who only hath immortality, dwelling in the light which no may can approach unto; whom no man hath seen, nor can see: to whom be honour and power everlasting. Amen.'",
                "Genesis 21:33 ", "I Timothy 6:16", "Isaiah 6:3", 2,
                Question.UBCV_TWO, Category.CHAPTER_THIRTEEN);
        insertQuestion(q69);

        Question q70 = new Question("'The fear of the Lord is clean, enduring forever: the judgments of the Lord are true and righteous altogether. '",
                    "Genesis 21:33 ", "Psalm 19:9 ", "Isaiah 6:3", 2,
                Question.UBCV_TWO, Category.CHAPTER_THIRTEEN);
        insertQuestion(q70);

        Question q71 = new Question("What is the Conclusion of the lesson?",
                    "God loves us more than we can ever know", "God never exist", "God has always existed and He always will", 1,
                Question.UBCV_TWO, Category.CHAPTER_THIRTEEN);
        insertQuestion(q71);

        //UbcvTwoChapterFourteen

        Question q72 = new Question("'Man cannot gain ___________ by his own power, instead God must grant it to him.'",
                "Courage", "Knowledge", "Immortality", 3,
                Question.UBCV_TWO, Category.CHAPTER_FOURTEEN);
        insertQuestion(q72);

        Question q73 = new Question("Because it is written, Be ye holy; for I am holy.",
                "I Timothy 1:17", "I Peter 1:16-25 ", "Colossians 1:15", 2,
                Question.UBCV_TWO, Category.CHAPTER_FOURTEEN);
        insertQuestion(q73);

        Question q74 = new Question("'The fear of the Lord is clean, enduring forever: the judgments of the Lord are true and righteous altogether. '",
                "Genesis 21:33 ", "Psalm 19:9 ", "Isaiah 6:3", 2,
                Question.UBCV_TWO, Category.CHAPTER_FOURTEEN);
        insertQuestion(q74);

        //UbcvTwoChapterFifteen

        Question q75 = new Question("What is the Meaning of the lesson?",
                "God loves us more than we can ever know", "God is someone we can get to know.", "God has always existed and He always will", 1,
                Question.UBCV_TWO, Category.CHAPTER_FIFTEEN);
        insertQuestion(q75);

        Question q76 = new Question("'No man hath seen God at any time; the only begotten Son, which is in the bosom of the Father, he hath declared him.'",
                "I Peter 1:16-25", "I Timothy 1:17", "John 1:18", 1,
                Question.UBCV_TWO, Category.CHAPTER_FIFTEEN);
        insertQuestion(q76);

        Question q77 = new Question("'Who only hath immortality, dwelling in the light which no may can approach unto; whom no man hath seen, nor can see: to whom be honour and power everlasting. Amen.'",
                "Genesis 21:33 ", "I Timothy 6:16", "Isaiah 6:3", 1,
                Question.UBCV_TWO, Category.CHAPTER_FIFTEEN);
        insertQuestion(q77);

        //UbcvThreeChapterTwo

        Question q78 = new Question("To Socrates and Plato what is the meaning of philosophy?",
                "Love of Wisdom", "Love for Literature", "Love for Art", 1,
                Question.UBCV_THREE, Category.CHAPTER_TWO);
        insertQuestion(q78);

        Question q79 = new Question("Equivalent of Bible in Islam",
                "Quoran", "Scriptures", "Textbook", 1,
                Question.UBCV_TWO, Category.CHAPTER_TWO);
        insertQuestion(q79);

        //UbcvThreeChapterThree

        Question q80 = new Question("acquiring new or modifying existing knowledge, behaviors, skills, values, or preferences and may involve synthesizing different types of information.",
                "Reading", "Memorizing", "Learning", 3,
                Question.UBCV_THREE, Category.CHAPTER_THREE);
        insertQuestion(q80);

        Question q81 = new Question("Equivalent of Bible in Islam",
                "Quoran", "Scriptures", "Textbook", 2,
                Question.UBCV_THREE, Category.CHAPTER_THREE);
        insertQuestion(q81);

        //UbcvThreeChapterFive

        Question q82 = new Question("become aware of how you use your time as one resource in organizing priorities and succeeding n0 your work.",
                "Time Management", "Time organization", "Scheduling", 1,
                Question.UBCV_THREE, Category.CHAPTER_FIVE);
        insertQuestion(q82);

        Question q83 = new Question("a team process where members support and rely each other to achieve on agreed-upon goal. The classroom is an excellent place to develop team-building skills you will need later in life.",
                "Scheduling", "Solo learning", "Collaborative Learning", 3,
                Question.UBCV_THREE, Category.CHAPTER_FIVE);
        insertQuestion(q83);

        //UbcvThreeChapterSix

        Question q84 = new Question("the structured school system that runs from primary programs created through the university and school-like programs in business for educational and professional training.",
                "Formal Learning", "Time organization", "Scheduling", 1,
                Question.UBCV_THREE, Category.CHAPTER_SIX);
        insertQuestion(q84);

        Question q85 = new Question("In recognition of the cost involved in subsidizing the lifelong involvement on education and training.",
                "Scheduling", "Solo learning", "Self-Funded Learning", 3,
                Question.UBCV_THREE, Category.CHAPTER_SIX);
        insertQuestion(q85);

        //UbcvThreeChapterOne

        Question q86 = new Question("We envision the University of Batangas to be center of excellence committed to serve the broader community through quality education. ",
                "UB Mission", "UB Hymn", "UB Vision", 3,
                Question.UBCV_THREE, Category.CHAPTER_ONE);
        insertQuestion(q86);

        Question q87 = new Question("The University of Batangas provides quality education by promoting personal and professional growth and enabling the person to participate in a global, technology and research-driven environment.",
                "UB Mission", "UB Hymn", "UB Vision", 1,
                Question.UBCV_THREE, Category.CHAPTER_ONE);
        insertQuestion(q87);

        //UbcvFourChapterTwo

        Question q88 = new Question("The occupation or condition of being a servant ",
                "Operations", "Service", "Trade", 2,
                Question.UBCV_FOUR, Category.CHAPTER_TWO);
        insertQuestion(q88);

        Question q89 = new Question("___________ is a daily struggle, a lesson I must relearn over and over. ",
                "Humility", "Empathy", "Courage", 1,
                Question.UBCV_FOUR, Category.CHAPTER_TWO);
        insertQuestion(q89);

        //UbcvFourChapterThree

        Question q90 = new Question("any one whom we mingle and see or the people living around us. ",
                "Countrymen", "Brothers", "Fellowmen", 3,
                Question.UBCV_FOUR, Category.CHAPTER_THREE);
        insertQuestion(q90);

        Question q91 = new Question("Way to help our fellowmen",
                " Find a missionary to support with your prayers and money.", "Teach him how to gamble", "Deprive him on his own rights.", 1,
                Question.UBCV_FOUR, Category.CHAPTER_THREE);
        insertQuestion(q91);

        //UbcvFourChapterFour

        Question q92 = new Question("any one whom we mingle and see or the people living around us. ",
                "Countrymen", "Brothers", "Fellowmen", 3,
                Question.UBCV_FOUR, Category.CHAPTER_FOUR);
        insertQuestion(q92);

        Question q93 = new Question("What does SEA stands for?",
                "Students and External Affairs", "South East Asia", "Students and Economic Affairs", 1,
                Question.UBCV_FOUR, Category.CHAPTER_FOUR);
        insertQuestion(q93);

        //UbcvFourChapterFour

        Question q94 = new Question("collection of sources, resources and services. ",
                "Bathroom", "Classroom", "Library", 3,
                Question.UBCV_THREE, Category.CHAPTER_FOUR);
        insertQuestion(q94);

        Question q95 = new Question("System of library classification made up of ten classes.",
                "Dewey Decimal Classification", "Donald Dickins Classification", "Library of Congress Classification", 1,
                Question.UBCV_THREE, Category.CHAPTER_FOUR);
        insertQuestion(q95);

        //UbcvThreeChapterOne

        Question q96 = new Question("We envision the University of Batangas to be center of excellence committed to serve the broader community through quality education. ",
                "UB Mission", "UB Hymn", "UB Vision", 3,
                Question.UBCV_FOUR, Category.CHAPTER_ONE);
        insertQuestion(q96);

        Question q97 = new Question("The University of Batangas provides quality education by promoting personal and professional growth and enabling the person to participate in a global, technology and research-driven environment.",
                "UB Mission", "UB Hymn", "UB Vision", 1,
                Question.UBCV_FOUR, Category.CHAPTER_ONE);
        insertQuestion(q97);
    }


    public void addQuestion(Question question){
        db = getWritableDatabase();
        insertQuestion(question);

    }

    public void addQuestions(List<Question> questions){
        db = getWritableDatabase();

        for(Question question : questions){
            insertQuestion(question);
        }
    }

    private void insertQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        cv.put(QuestionsTable.COLUMN_DIFFICULTY, question.getDifficulty());
        cv.put(QuestionsTable.COLUMN_CATEGORY_ID, question.getCategoryID());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }

    public List<Category> getAllCategories() {
        List<Category> categoryList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + CategoriesTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Category category = new Category();
                category.setId(c.getInt(c.getColumnIndex(CategoriesTable._ID)));
                category.setName(c.getString(c.getColumnIndex(CategoriesTable.COLUMN_NAME)));
                categoryList.add(category);
            } while (c.moveToNext());
        }

        c.close();
        return categoryList;
    }

    public ArrayList<Question> getAllQuestions() {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setId(c.getInt(c.getColumnIndex(QuestionsTable._ID)));
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                question.setCategoryID(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_CATEGORY_ID)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }

    public ArrayList<Question> getQuestions(int categoryID, String difficulty) {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();

        String selection = QuestionsTable.COLUMN_CATEGORY_ID + " = ? " +
                " AND " + QuestionsTable.COLUMN_DIFFICULTY + " = ? ";
        String[] selectionArgs = new String[]{String.valueOf(categoryID), difficulty};

        Cursor c = db.query(
                QuestionsTable.TABLE_NAME,
                null,
                selection,
                selectionArgs,
                null,
                null,
                null
        );

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setId(c.getInt(c.getColumnIndex(QuestionsTable._ID)));
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                question.setCategoryID(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_CATEGORY_ID)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}