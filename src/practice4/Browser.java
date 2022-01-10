package practice4;

public class Browser {

    public static void main(String[] args) {

        String browserName = "chrome";
        String result = "";

        switch(browserName){
            case "chrome":
                 result = "Chrome";
                 break;
                 case "firefox":
                result = "Firefox";
                break;
                case "opera":
                result = "Opera";
                break;
                case "safari":
                result = "Safari";
                break;
                case "edge":
                result = "Edge";
                break;
                default:
                result = "Invalid Browser";
        }
        System.out.println(result);
    }
}
/*
write a program that can display the selected browser
            3.1  declear a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary

 */
