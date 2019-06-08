package com.company;

import com.company.example_1.AppCreationFacade;
import com.company.example_2.DwarvenGoldmineFacade;

public class Main {

    public static void main(String[] args) {

        //Example_1
	    AppCreationFacade.orderApp("App for tracking weather");

        //Example_2
        DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }


}
