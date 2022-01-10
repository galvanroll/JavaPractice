package practice3;

public class AgeGroups {

    public static void main(String[] args) {

        int ageGroup = 29;

        if(ageGroup >= 1 && ageGroup <= 2){
            System.out.println("Infant");
        }else if(ageGroup >= 3 && ageGroup <= 5){
            System.out.println("Toddler");
        }else if(ageGroup >= 6 && ageGroup <= 9){
            System.out.println("Kid");
        }else if(ageGroup >= 10 && ageGroup <= 12){
            System.out.println("Pre-Teen");
        }else if(ageGroup >= 13 && ageGroup <= 17){
            System.out.println("Teenager");
        }else if(ageGroup >= 18 && ageGroup <= 20){
            System.out.println("Young Adult");
        }else if(ageGroup >= 21 && ageGroup <= 39){
            System.out.println("Adult");
        }else if(ageGroup >= 40 && ageGroup <= 49){
            System.out.println("Young Middle-Aged Adult");
        }else if(ageGroup >= 50 && ageGroup <= 54){
            System.out.println("Middle-Aged Adult");
        }else if(ageGroup >= 55 && ageGroup <= 64){
            System.out.println("Very Young Senior Citizen");
        }else if(ageGroup >= 65 && ageGroup <= 74){
            System.out.println("Young Senior Citizen");
        }else if(ageGroup >= 75 && ageGroup <= 84){
            System.out.println("Senior Citizen");
        }else{
            System.out.println("Old Senior Citizen");
         }
    }
}
/*
5. Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */
