package br.com.trabalhofinal;

import java.util.Scanner;

import br.com.trabalhofinal.view.AlgoritmosView;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        AlgoritmosView av = new AlgoritmosView();

        av.menu(sc);

        sc.close();
    }
}
