package ru.sbt.hw2;

import ru.sbt.hw2.model.Person;
/**
 * Created by ����� on 23.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        Person man1 = new Person("Manly", true);
        Person man2 = new Person("Notsomanly", true);

        Person woman1 = new Person("Shiny", false);
        Person woman2 = new Person("Snowflake", false);

        System.out.println(woman1.marry(woman2));   //������ �������� ����� ������ ����
        System.out.println();

        System.out.println(man1.marry(woman1) + " " + man1.getSpouse() + " " + woman1.getSpouse());     //����� �������
        System.out.println();

        System.out.println(woman1.marry(man1));     //������ ��� �������
        System.out.println();

        System.out.println(man2.marry(woman1) + " " + man2.getSpouse() + " " + woman1.getSpouse());     //����� ������� �� ���� �� �����


    }

}
