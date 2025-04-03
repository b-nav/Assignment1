package com.assignmentheroes.AssignmentHeroes;

public class SuperMan implements Hero {
    @Override
    public void action(){
        String powerLevel = "Ultra";
        int experience = 5;
        System.out.println("Superman with power level"+" "+powerLevel+" "+"and"+" "+experience+" "+"years of experience in flying!");
    }
}
