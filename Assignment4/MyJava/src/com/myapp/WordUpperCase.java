package com.myapp;

import java.io.*;

 class WordUpperCase extends BufferedReader {


    public WordUpperCase(Reader in) {
        super(in);
    }

    public String readLine() {
try {
    return super.readLine().toUpperCase();
}
catch(Exception ee)
{
return null;
}
    }



}
