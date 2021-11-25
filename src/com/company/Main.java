package com.company;

public class Main {

    public static void main(String[] args) {
        Boss slash = new Boss();
        slash.setDamage(50);
        slash.setHealth(1200);
        slash.weapon.setNameWeapon(" Огнестрельное");
        slash.weapon.setNameWeapon("G18");
        System.out.println(" Здоровье Босса" + slash.health + " Урон босса" + slash.damage + " Имя оружия " + slash.weapon.getNameWeapon() + " Вид оружия " + slash.weapon.getTypWeapon());


    }

    }
