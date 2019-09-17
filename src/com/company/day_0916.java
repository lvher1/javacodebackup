package com.company;

import java.util.Scanner;

public class day_0916 {
    public static void day_0916
            (String[] args){

        Scanner input = new Scanner(System.in);
        int tvProgram = input.nextInt();

        if(tvProgram <= 15){
            System.out.println("15세 관람가입니다.");
        }
        else if(tvProgram>=16&&tvProgram<=19){
            System.out.println("청소년 관람가입니다.");
        }
        else if(tvProgram>=20){
            System.out.println("미성년자 관람불가");
        }



    }
}
