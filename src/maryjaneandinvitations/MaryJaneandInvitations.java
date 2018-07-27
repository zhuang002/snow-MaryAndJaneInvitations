/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maryjaneandinvitations;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MaryJaneandInvitations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
	int numline = reader.nextInt();
        String type = reader.next();
        
        String namelist[] = new String [numline];
        for(int i = 0; i<numline; i++){
            String name = reader.next();
            namelist[i] = name;
        }
        String tletter;
        tletter = OrderType(numline,type);
        String a = ", beloved artist, I would love to have you at my party. Come to my crib on April 20th.";
        String o = ", beloved occasion enthusiast, come to my crib to celebrate this very special day.";
        String r = ", April 20th is happening again this year. Don't miss out.";
        String d = "Dear ";
        for(int i = 0; i < numline; i++){
            if(tletter.charAt(i) == 'A'){
                System.out.println(d+namelist[i]+a);
            }
            if(tletter.charAt(i) == 'O'){
                System.out.println(d+namelist[i]+o);
            }
            if(tletter.charAt(i) == 'R'){
                System.out.println(d+namelist[i]+r);
            }
        }
    }

    public static String OrderType(int numline,String type) {
        String order = "";
        int countX = 0;
        int firstX = 0;
        int lastX;
        char[] Type =type.toCharArray();

        for(int i = 0; i< type.length(); i++){
            if(Type[i] == 'X'){
                countX ++;
                if(Type[i-1] != 'X'){
                    firstX = i;
                }
                if(Type[i+1]!= 'X'){
                    lastX = i;
                    for(int j = firstX; j<=lastX; j++){
                        Type[j] = 0;
                    }
                    Type[firstX-countX] = Type[lastX +1];
                    Type[lastX+1] = 0;
                    i+=2;
                    countX=0;
                }
            }
        }
        for(int i =0; i< type.length(); i++){
            if (Character.isAlphabetic(Type[i])) {
                order = order+Type[i];
            }
        }
        
        return order;
    }
}
