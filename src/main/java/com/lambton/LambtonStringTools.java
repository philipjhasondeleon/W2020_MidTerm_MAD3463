/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s)
    {


        return null;

    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {
        String name = s;
        int len = name.length();
        return s;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        return null;
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {

       return 0;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String text, String findString, String newString)
    {
        //replaceSubString().toLowerCase(text, findString, newString);

        /*{
            String t1 = text;
            String t1 ("Lambton College in Toronto");
            String t1=text.replace("the dog jumped over the fence");
            System.out.println(t1);
        }

         */
        return text.toLowerCase() + findString.toLowerCase() + newString.toLowerCase();
    }
}
