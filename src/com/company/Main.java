package com.company;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String name = scan.nextLine();
        System.out.println("Enter 5 names:");

        ArrayList<String> namesa = new ArrayList<>();
        namesa.add(scan.next());
        namesa.add(scan.next());
        namesa.add(scan.next());
        namesa.add(scan.next());
        namesa.add(scan.next());
        for (int i = 0; i < namesa.size(); i++)
            System.out.println("List a " + namesa.get(i));

        ArrayList<String> namesb = new ArrayList<>();
        namesb.add(scan.next());
        namesb.add(scan.next());
        namesb.add(scan.next());
        namesb.add(scan.next());
        namesb.add(scan.next());
        for (int i = 0; i < namesb.size(); i++) {
            System.out.println("List b " + namesb.get(i));
        }
        ArrayList<String> namesc = new ArrayList<>();
        Collections.reverse(namesb);
        Iterator<String> iteratorA = namesa.iterator();
        Iterator<String> iteratorB = namesb.iterator();
        for (int i = 0; i < namesa.size(); i++) {
            namesc.add(iteratorA.next());
            namesc.add(iteratorB.next());
            Collections.sort(namesc,new LenghFirstCom());
            System.out.println(namesc);
        }
    }
}


