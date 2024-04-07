
package poeassingment;


public class CheckuserName {
    public static boolean checkUserName(String username){
        
        if(username.length()<5){
            
            if(checkUser(username)){
                return true;
            }
            else{
                return false;
            }
        }
       else {
            return false;
        }
    }
    public static boolean checkUser(String username){
      
        boolean underScore = false;
       
        if(username.contains("-")){
            underScore = true;
        }
        if(underScore){
            return true;
        }
        return false;
    }
    public static String registerUser(String username){
        String correct = "Username succefully captured";
        String wrong ="Username is not crrectly fotmatted,please ensure that the password contains at least 8 characters, a capital letter , a number, and a special character";
       
        if(checkUserName(username)){
            return correct;
        }
        else{
            return wrong;
        }
        
        
        }
        public static boolean passworComplexity(String password){
            
            if(password.length()> 7){
                if(Validpass(password)){
                    return true;
                }
                else{
                    return false;
                }
                }
        return false;
    
        }
        public static boolean Validpass(String password){
          
            boolean hasNumber = false;
            boolean hasCapital = false;
            boolean haslowercase = false;
            char letters;
            
            for(int i = 0; i <password.length(); i++){
                letters = password.charAt(i);
                
                if(Character.isDigit(letters)){
                    
                    hasNumber = true;
                }
                else if(Character.isUpperCase(letters)){
                    hasCapital = true;
                }
                else if(Character.isLowerCase(letters)){
                    haslowercase = true;
                }
                if(hasNumber && haslowercase && hasCapital){
                    return true;
                }
            }
        return false;
            
        }
        public static String registeruser1(String password){
            
            String validpass = "password succefully captured";
            String invalidpass = "password in not correctly formatted,please ensure that password contains 8 characters,contain a capital letter, contain a number,a special character";
           
            if(Validpass(password)){
           
            return validpass;
        }
            else {
              return invalidpass;
            }
         }
        }    

