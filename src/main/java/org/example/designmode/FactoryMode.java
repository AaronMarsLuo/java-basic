package org.example.designmode;

import org.junit.Test;

public class FactoryMode {
    abstract class AbstractFactory {
        abstract Food createFood();
        abstract Vehicle createVehicle();
        abstract Weapon createWeapon();
    }
    class ModernFactory extends AbstractFactory {
        @Override
        public Food createFood() {
            return new Bread();
        }

        @Override
        Vehicle createVehicle() {
            return new Car();
        }

        @Override
        Weapon createWeapon() {
            return new AK47();
        }
    }

    class MagicFactory extends AbstractFactory{
        @Override
        public Food createFood() {
            return new Mushroom();
        }

        @Override
        Vehicle createVehicle() {
            return new Broom();
        }

        @Override
        Weapon createWeapon() {
            return new MagicStick();
        }
    }

    abstract class Food { abstract void eat();}
    abstract class Vehicle { abstract void transfer();}
    abstract class Weapon { abstract void fight();}

    class Bread extends Food {
        @Override
        public void eat(){
            System.out.println("吃了两块面包");
        }
    }

    class Car extends Vehicle {
        @Override
        public void transfer(){
            System.out.println("坐车去北化");
        }
    }

    class AK47 extends Weapon {
        @Override
        public void fight(){
            System.out.println("拿枪打老鼠");
        }
    }

    class Mushroom extends Food {
        @Override
        public void eat(){
            System.out.println("吃了两块蘑菇");
        }
    }

    class Broom extends Vehicle {
        @Override
        public void transfer(){
            System.out.println("坐扫帚去北化");
        }
    }

    class MagicStick extends Weapon {
        @Override
        public void fight(){
            System.out.println("拿魔法棒打灰太狼");
        }
    }

    @Test
    public void testFactory(){
        AbstractFactory ab=new ModernFactory();
        Food food=ab.createFood();
        Vehicle vehicle=ab.createVehicle();
        Weapon weapon=ab.createWeapon();
    }
}
