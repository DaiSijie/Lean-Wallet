package com.example.leanwallet;

import android.content.Context;

import java.io.File;
import java.util.ArrayList;

public class CardDatabase {

    private static final String DB_FILENAME = "CARDS_DB";

    private static CardDatabase instance;

    private CardDatabase(){

    };

    public static CardDatabase getInstanceOf(){
        if(instance == null){
            instance = new CardDatabase();
        }
        return instance;
    }

    public void loadDatabase(Context appContext){
        System.out.println("opiajpsopaijsopijas" + appContext.getFilesDir().listFiles().length);
        //File file = new File(appContext.getFilesDir(), DB_FILENAME);
    }

    public ArrayList<String> getCards(){
        return null;
    }

    public void addCard(){

    }

    public void removeCard(){

    }

}
