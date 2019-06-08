package com.company;

import com.company.example_1.AppStore;
import com.company.example_1.AppType;
import com.company.example_2.*;

public class Main {

    public static void main(String[] args) {

        //Example_1
        new AppStore().orderApp(AppType.IOS);


        //Example_2
        HeroFactoryImp factory;
        Mage mage;
        Warold warlord;
        Beast beast;

        factory = new HeroFactoryImp(new ElfMage("cooking"), new ElfWarold("cleaning"), new ElfBeast("protecting"));
        mage = factory.createMage();
        warlord = factory.createWarlord();
        beast = factory.createBeast();


        factory = new HeroFactoryImp(new OrcMage("axe"), new OrcWarlord("sword"), new OrcBeast("laser"));
        mage = factory.createMage();
        warlord = factory.createWarlord();
        beast = factory.createBeast();

    }
}
