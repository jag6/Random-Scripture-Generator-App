package com.example.randomscripturegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView scripture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);
        scripture = findViewById(R.id.scripture);

        button.setOnClickListener(view -> {
            HashMap<String, List<Integer>> bible = new HashMap<String, List<Integer>>();

            Integer[] genesisC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
                    28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
            Integer[] exodusC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
                    29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};
            Integer[] leviticusC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
            Integer[] numbersC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
                    28, 29, 30, 31, 32, 33, 34, 35, 36};
            Integer[] deuteronomyC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
                    28, 29, 30, 31, 32, 33, 34};
            Integer[] joshuaC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
            Integer[] judgesC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
            Integer[] ruthC = { 1, 2, 3, 4};
            Integer[] samuel1C = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
                    28, 29, 30, 31};
            Integer[] samuel2C = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
            Integer[] kings1C = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
            Integer[] kings2C = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
            Integer[] chronicles1C = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
                    28, 29};
            Integer[] chronicles2C = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
                    28, 29, 30, 31, 32, 33, 34, 35, 36};
            Integer[] ezraC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            Integer[] nehemiahC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
            Integer[] estherC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            Integer[] jobC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
                    29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42};
            Integer[] psalmsC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
                    29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53,
                    54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78,
                    79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103,
                    104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123,
                    124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143,
                    144, 145, 146, 147, 148, 149, 150};
            Integer[] proverbsC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
                    29, 30, 31};
            Integer[] ecclesiastesC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            Integer[] songC = { 1, 2, 3, 4, 5, 6, 7, 8};
            Integer[] isaiahC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
                    29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53,
                    54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66};
            Integer[] jeremiahC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
                    29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52};
            Integer[] lamentationsC = { 1, 2, 3, 4, 5};
            Integer[] ezekialC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
                    29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};
            Integer[] danielC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            Integer[] hoseaC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
            Integer[] joelC = { 1, 2, 3};
            Integer[] amosC = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
            Integer[] obadiahC = { 1};
            Integer[] jonahC = { 1, 2, 3, 4};
            Integer[] micahC = { 1, 2, 3, 4, 5, 6, 7};
            Integer[] nahumC = { 1, 2, 3};
            Integer[] habbakukC = { 1, 2, 3};
            Integer[] zephaniahC = { 1, 2, 3};
            Integer[] haggaiC = { 1, 2};
            Integer[] zechariahC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
            Integer[] malachiC = { 1, 2, 3, 4};
            Integer[] matthewC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
                    28};
            Integer[] markC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
            Integer[] lukeC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
            Integer[] johnC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
            Integer[] actsC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
                    28};
            Integer[] romansC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
            Integer[] corinthians1C = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
            Integer[] corinthians2C = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
            Integer[] galatiansC = { 1, 2, 3, 4, 5, 6};
            Integer[] ephesiansC = { 1, 2, 3, 4, 5, 6};
            Integer[] philippiansC = { 1, 2, 3, 4};
            Integer[] colossiansC = { 1, 2, 3, 4};
            Integer[] thessalonians1C = { 1, 2, 3, 4, 5};
            Integer[] thessalonians2C = { 1, 2, 3};
            Integer[] timothy1C = { 1, 2, 3, 4, 5, 6};
            Integer[] timothy2C = { 1, 2, 3, 4};
            Integer[] titusC = { 1, 2, 3};
            Integer[] philemonC = { 1};
            Integer[] hebrewsC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
            Integer[] jamesC = { 1, 2, 3, 4, 5};
            Integer[] peter1C = { 1, 2, 3, 4, 5};
            Integer[] peter2C = { 1, 2, 3};
            Integer[] john1C = { 1, 2, 3, 4, 5};
            Integer[] john2C = { 1};
            Integer[] john3C = { 1};
            Integer[] judeC = { 1};
            Integer[] revelationC = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};

            bible.put("Genesis", Arrays.asList(genesisC));
            bible.put("Exodus", Arrays.asList(exodusC));
            bible.put("Leviticus", Arrays.asList(leviticusC));
            bible.put("Numbers", Arrays.asList(numbersC));
            bible.put("Deuteronomy", Arrays.asList(deuteronomyC));
            bible.put("Joshua", Arrays.asList(joshuaC));
            bible.put("Judges", Arrays.asList(judgesC));
            bible.put("Ruth", Arrays.asList(ruthC));
            bible.put("1 Samuel", Arrays.asList(samuel1C));
            bible.put("2 Samuel", Arrays.asList(samuel2C));
            bible.put("1 Kings", Arrays.asList(kings1C));
            bible.put("2 Kings", Arrays.asList(kings2C));
            bible.put("1 Chronicles", Arrays.asList(chronicles1C));
            bible.put("2 Chronicles", Arrays.asList(chronicles2C));
            bible.put("Ezra", Arrays.asList(ezraC));
            bible.put("Nehemiah", Arrays.asList(nehemiahC));
            bible.put("Esther", Arrays.asList(estherC));
            bible.put("Job", Arrays.asList(jobC));
            bible.put("Psalms", Arrays.asList(psalmsC));
            bible.put("Proverbs", Arrays.asList(proverbsC));
            bible.put("Ecclesiastes", Arrays.asList(ecclesiastesC));
            bible.put("Song of Solomon", Arrays.asList(songC));
            bible.put("Isaiah", Arrays.asList(isaiahC));
            bible.put("Jeremiah", Arrays.asList(jeremiahC));
            bible.put("Lamentations", Arrays.asList(lamentationsC));
            bible.put("Ezekial", Arrays.asList(ezekialC));
            bible.put("Daniel", Arrays.asList(danielC));
            bible.put("Hosea", Arrays.asList(hoseaC));
            bible.put("Joel", Arrays.asList(joelC));
            bible.put("Amos", Arrays.asList(amosC));
            bible.put("Obadiah", Arrays.asList(obadiahC));
            bible.put("Jonah", Arrays.asList(jonahC));
            bible.put("Micah", Arrays.asList(micahC));
            bible.put("Nahum", Arrays.asList(nahumC));
            bible.put("Habakkuk", Arrays.asList(habbakukC));
            bible.put("Zephaniah", Arrays.asList(zephaniahC));
            bible.put("Haggai", Arrays.asList(haggaiC));
            bible.put("Zechariah", Arrays.asList(zechariahC));
            bible.put("Malachi", Arrays.asList(malachiC));

            bible.put("Matthew", Arrays.asList(matthewC));
            bible.put("Mark", Arrays.asList(markC));
            bible.put("Luke", Arrays.asList(lukeC));
            bible.put("John", Arrays.asList(johnC));
            bible.put("Acts", Arrays.asList(actsC));
            bible.put("Romans", Arrays.asList(romansC));
            bible.put("1 Corinthians", Arrays.asList(corinthians1C));
            bible.put("2 Corinthians", Arrays.asList(corinthians2C));
            bible.put("Galatians", Arrays.asList(galatiansC));
            bible.put("Ephesians", Arrays.asList(ephesiansC));
            bible.put("Philippians", Arrays.asList(philippiansC));
            bible.put("Colossians", Arrays.asList(colossiansC));
            bible.put("1 Thessalonians", Arrays.asList(thessalonians1C));
            bible.put("2 Thessalonians", Arrays.asList(thessalonians2C));
            bible.put("1 Timothy", Arrays.asList(timothy1C));
            bible.put("2 Timothy", Arrays.asList(timothy2C));
            bible.put("Titus", Arrays.asList(titusC));
            bible.put("Philemon", Arrays.asList(philemonC));
            bible.put("Hebrews", Arrays.asList(hebrewsC));
            bible.put("James", Arrays.asList(jamesC));
            bible.put("1 Peter", Arrays.asList(peter1C));
            bible.put("2 Peter", Arrays.asList(peter2C));
            bible.put("1 John", Arrays.asList(john1C));
            bible.put("2 John", Arrays.asList(john2C));
            bible.put("3 John", Arrays.asList(john3C));
            bible.put("Jude", Arrays.asList(judeC));
            bible.put("Revelation", Arrays.asList(revelationC));

            Integer genesisCR = genesisC[new Random().nextInt(genesisC.length)];
            Integer exodusCR = exodusC[new Random().nextInt(exodusC.length)];
            Integer leviticusCR = leviticusC[new Random().nextInt(leviticusC.length)];
            Integer numbersCR = numbersC[new Random().nextInt(numbersC.length)];
            Integer deuteronomyCR = deuteronomyC[new Random().nextInt(deuteronomyC.length)];
            Integer joshuaCR = joshuaC[new Random().nextInt(joshuaC.length)];
            Integer judgesCR = judgesC[new Random().nextInt(judgesC.length)];
            Integer ruthCR = ruthC[new Random().nextInt(ruthC.length)];
            Integer samuel1CR = samuel1C[new Random().nextInt(samuel1C.length)];
            Integer samuel2CR = samuel2C[new Random().nextInt(samuel2C.length)];
            Integer kings1CR = kings1C[new Random().nextInt(kings1C.length)];
            Integer kings2CR = kings2C[new Random().nextInt(kings2C.length)];
            Integer chronicles1CR = chronicles1C[new Random().nextInt(chronicles1C.length)];
            Integer chronicles2CR = chronicles2C[new Random().nextInt(chronicles2C.length)];
            Integer ezraCR = ezraC[new Random().nextInt(ezraC.length)];
            Integer nehemiahCR = nehemiahC[new Random().nextInt(nehemiahC.length)];
            Integer estherCR = estherC[new Random().nextInt(estherC.length)];
            Integer jobCR = jobC[new Random().nextInt(jobC.length)];
            Integer psalmsCR = psalmsC[new Random().nextInt(psalmsC.length)];
            Integer proverbsCR = proverbsC[new Random().nextInt(proverbsC.length)];
            Integer ecclesiastesCR = ecclesiastesC[new Random().nextInt(ecclesiastesC.length)];
            Integer songCR = songC[new Random().nextInt(songC.length)];
            Integer isaiahCR = isaiahC[new Random().nextInt(isaiahC.length)];
            Integer jeremiahCR = jeremiahC[new Random().nextInt(jeremiahC.length)];
            Integer lamentationsCR = lamentationsC[new Random().nextInt(lamentationsC.length)];
            Integer ezekialCR = ezekialC[new Random().nextInt(ezekialC.length)];
            Integer danielCR = danielC[new Random().nextInt(danielC.length)];
            Integer hoseaCR = hoseaC[new Random().nextInt(hoseaC.length)];
            Integer joelCR = joelC[new Random().nextInt(joelC.length)];
            Integer amosCR = amosC[new Random().nextInt(amosC.length)];
            Integer obadiahCR = obadiahC[new Random().nextInt(obadiahC.length)];
            Integer jonahCR = jonahC[new Random().nextInt(jonahC.length)];
            Integer micahCR = micahC[new Random().nextInt(micahC.length)];
            Integer nahumCR = nahumC[new Random().nextInt(nahumC.length)];
            Integer habbakukCR = habbakukC[new Random().nextInt(habbakukC.length)];
            Integer zephaniahCR = zephaniahC[new Random().nextInt(zephaniahC.length)];
            Integer haggaiCR = haggaiC[new Random().nextInt(haggaiC.length)];
            Integer zechariahCR = zechariahC[new Random().nextInt(zechariahC.length)];
            Integer malachiCR = malachiC[new Random().nextInt(malachiC.length)];

            Integer matthewCR = matthewC[new Random().nextInt(matthewC.length)];
            Integer markCR = markC[new Random().nextInt(markC.length)];
            Integer lukeCR = lukeC[new Random().nextInt(lukeC.length)];
            Integer johnCR = johnC[new Random().nextInt(johnC.length)];
            Integer actsCR = actsC[new Random().nextInt(actsC.length)];
            Integer romansCR = romansC[new Random().nextInt(romansC.length)];
            Integer corinthians1CR = corinthians1C[new Random().nextInt(corinthians1C.length)];
            Integer corinthians2CR = corinthians2C[new Random().nextInt(corinthians2C.length)];
            Integer galatiansCR = galatiansC[new Random().nextInt(galatiansC.length)];
            Integer ephesiansCR = ephesiansC[new Random().nextInt(ephesiansC.length)];
            Integer philippiansCR = philippiansC[new Random().nextInt(philippiansC.length)];
            Integer colossiansCR = colossiansC[new Random().nextInt(colossiansC.length)];
            Integer thessalonians1CR = thessalonians1C[new Random().nextInt(thessalonians1C.length)];
            Integer thessalonians2CR = thessalonians2C[new Random().nextInt(thessalonians2C.length)];
            Integer timothy1CR = timothy1C[new Random().nextInt(timothy1C.length)];
            Integer timothy2CR = timothy2C[new Random().nextInt(timothy2C.length)];
            Integer titusCR = titusC[new Random().nextInt(titusC.length)];
            Integer philemonCR = philemonC[new Random().nextInt(philemonC.length)];
            Integer hebrewsCR = hebrewsC[new Random().nextInt(hebrewsC.length)];
            Integer jamesCR = jamesC[new Random().nextInt(jamesC.length)];
            Integer peter1CR = peter1C[new Random().nextInt(peter1C.length)];
            Integer peter2CR = peter2C[new Random().nextInt(peter2C.length)];
            Integer john1CR = john1C[new Random().nextInt(john1C.length)];
            Integer john2CR = john2C[new Random().nextInt(john2C.length)];
            Integer john3CR = john3C[new Random().nextInt(john3C.length)];
            Integer judeCR = judeC[new Random().nextInt(judeC.length)];
            Integer revelationCR = revelationC[new Random().nextInt(revelationC.length)];

            Object[] randomBook = bible.keySet().toArray();
            Object selectedBook = randomBook[new Random().nextInt(randomBook.length)];

            if(selectedBook == "Genesis"){
                scripture.setText("Please read Genesis " + genesisCR);
            }else if(selectedBook == "Exodus"){
                scripture.setText("Please read Exodus " + exodusCR);
            }else if(selectedBook == "Leviticus"){
                scripture.setText("Please read Leviticus " + leviticusCR);
            }else if(selectedBook == "Numbers"){
                scripture.setText("Please read Numbers " + numbersCR);
            }else if(selectedBook == "Deuteronomy"){
                scripture.setText("Please read Deuteronomy " + deuteronomyCR);
            }else if(selectedBook == "Joshua"){
                scripture.setText("Please read Joshua " + joshuaCR);
            }else if(selectedBook == "Judges"){
                scripture.setText("Please read Judges " + judgesCR);
            }else if(selectedBook == "Ruth"){
                scripture.setText("Please read Ruth " + ruthCR);
            }else if(selectedBook == "1 Samuel"){
                scripture.setText("Please read 1 Samuel " + samuel1CR);
            }else if(selectedBook == "2 Samuel"){
                scripture.setText("Please read 2 Samuel " + samuel2CR);
            }else if(selectedBook == "1 Kings"){
                scripture.setText("Please read 1 Kings " + kings1CR);
            }else if(selectedBook == "2 Kings"){
                scripture.setText("Please read 2 Kings " + kings2CR);
            }else if(selectedBook == "1 Chronicles"){
                scripture.setText("Please read 1 Chronicles " + chronicles1CR);
            }else if(selectedBook == "2 Chronicles"){
                scripture.setText("Please read 2 Chronicles " + chronicles2CR);
            }else if(selectedBook == "Ezra"){
                scripture.setText("Please read Ezra " + ezraCR);
            }else if(selectedBook == "Nehemiah"){
                scripture.setText("Please read Nehemiah " + nehemiahCR);
            }else if(selectedBook == "Esther"){
                scripture.setText("Please read Esther " + estherCR);
            }else if(selectedBook == "Job"){
                scripture.setText("Please read Job " + jobCR);
            }else if(selectedBook == "Psalms"){
                scripture.setText("Please read Psalms " + psalmsCR);
            }else if(selectedBook == "Proverbs"){
                scripture.setText("Please read Proverbs " + proverbsCR);
            }else if(selectedBook == "Ecclesiastes"){
                scripture.setText("Please read Ecclesiastes " + ecclesiastesCR);
            }else if(selectedBook == "Song of Solomon"){
                scripture.setText("Please read Song of Solomon " + songCR);
            }else if(selectedBook == "Isaiah"){
                scripture.setText("Please read Isaiah " + isaiahCR);
            }else if(selectedBook == "Jeremiah"){
                scripture.setText("Please read Jeremiah " + jeremiahCR);
            }else if(selectedBook == "Lamentations"){
                scripture.setText("Please read Lamentations " + lamentationsCR);
            }else if(selectedBook == "Ezekial"){
                scripture.setText("Please read Ezekial " + ezekialCR);
            }else if(selectedBook == "Daniel"){
                scripture.setText("Please read Daniel " + danielCR);
            }else if(selectedBook == "Hosea"){
                scripture.setText("Please read Hosea " + hoseaCR);
            }else if(selectedBook == "Joel"){
                scripture.setText("Please read Joel " + joelCR);
            }else if(selectedBook == "Amos"){
                scripture.setText("Please read Amos " + amosCR);
            }else if(selectedBook == "Obadiah"){
                scripture.setText("Please read Obadiah " + obadiahCR);
            }else if(selectedBook == "Jonah"){
                scripture.setText("Please read Jonah " + jonahCR);
            }else if(selectedBook == "Jonah"){
                scripture.setText("Please read Jonah " + jonahCR);
            }else if(selectedBook == "Micah"){
                scripture.setText("Please read Micah " + micahCR);
            }else if(selectedBook == "Nahum"){
                scripture.setText("Please read Nahum " + nahumCR);
            }else if(selectedBook == "Habakkuk"){
                scripture.setText("Please read Habakkuk " + habbakukCR);
            }else if(selectedBook == "Zephaniah"){
                scripture.setText("Please read Zephaniah " + zephaniahCR);
            }else if(selectedBook == "Haggai"){
                scripture.setText("Please read Haggai " + haggaiCR);
            }else if(selectedBook == "Zechariah"){
                scripture.setText("Please read Zechariah " + zechariahCR);
            }else if(selectedBook == "Malachi"){
                scripture.setText("Please read Malachi " + malachiCR);
            }else if(selectedBook == "Matthew"){
                scripture.setText("Please read Matthew " + matthewCR);
            }else if(selectedBook == "Mark"){
                scripture.setText("Please read Mark " + markCR);
            }else if(selectedBook == "Luke"){
                scripture.setText("Please read Luke " + lukeCR);
            }else if(selectedBook == "John"){
                scripture.setText("Please read John " + johnCR);
            }else if(selectedBook == "Acts"){
                scripture.setText("Please read Acts " + actsCR);
            }else if(selectedBook == "Romans"){
                scripture.setText("Please read Romans " + romansCR);
            }else if(selectedBook == "1 Corinthians"){
                scripture.setText("Please read 1 Corinthians " + corinthians1CR);
            }else if(selectedBook == "2 Corinthians"){
                scripture.setText("Please read 2 Corinthians " + corinthians2CR);
            }else if(selectedBook == "Galatians"){
                scripture.setText("Please read Galatians " + galatiansCR);
            }else if(selectedBook == "Ephesians"){
                scripture.setText("Please read Ephesians " + ephesiansCR);
            }else if(selectedBook == "Philippians"){
                scripture.setText("Please read Philippians " + philippiansCR);
            }else if(selectedBook == "Colossians"){
                scripture.setText("Please read Colossians " + colossiansCR);
            }else if(selectedBook == "1 Thessalonians"){
                scripture.setText("Please read 1 Thessalonians " + thessalonians1CR);
            }else if(selectedBook == "2 Thessalonians"){
                scripture.setText("Please read 2 Thessalonians " + thessalonians2CR);
            }else if(selectedBook == "1 Timothy"){
                scripture.setText("Please read 1 Timothy " + timothy1CR);
            }else if(selectedBook == "2 Timothy"){
                scripture.setText("Please read 2 Timothy " + timothy2CR);
            }else if(selectedBook == "Titus"){
                scripture.setText("Please read Titus " + titusCR);
            }else if(selectedBook == "Philemon"){
                scripture.setText("Please read Philemon " + philemonCR);
            }else if(selectedBook == "Hebrews"){
                scripture.setText("Please read Hebrews " + hebrewsCR);
            }else if(selectedBook == "James"){
                scripture.setText("Please read James " + jamesCR);
            }else if(selectedBook == "1 Peter"){
                scripture.setText("Please read 1 Peter " + peter1CR);
            }else if(selectedBook == "2 Peter"){
                scripture.setText("Please read 2 Peter " + peter2CR);
            }else if(selectedBook == "1 John"){
                scripture.setText("Please read 1 John " + john1CR);
            }else if(selectedBook == "2 John"){
                scripture.setText("Please read 2 John " + john2CR);
            }else if(selectedBook == "3 John"){
                scripture.setText("Please read 3 John " + john3CR);
            }else if(selectedBook == "Jude"){
                scripture.setText("Please read Jude " + judeCR);
            }else if(selectedBook == "Revelation"){
                scripture.setText("Please read Revelation " + revelationCR);
            }
        });
    }
}