package practice2;

public class SchoolType {

    public static void main(String[] args) {
        byte grade = 11;

        boolean elementarySchool = grade >= 1 && grade <= 5;
        boolean middleSchool = grade >= 6 && grade <= 8;
        boolean highSchool = grade >= 9 && grade <= 12;
        boolean college = grade >= 13 && grade <=16;
        boolean gradSchool = grade >= 17 && grade <= 18;

        if(elementarySchool){
            System.out.println("Elementary School");
        } else if(middleSchool){
            System.out.println("Middle School");
        } else if(highSchool) {
            System.out.println("High School");
        }else if(college){
            System.out.println("College");
        }else{
            System.out.println("Grad School");
        }
    }
}

/*  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

            Assume that the given number is 1 ~ 18

 */