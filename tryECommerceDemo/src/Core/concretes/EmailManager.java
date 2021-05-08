package Core.concretes;

import Core.abstarcts.EmailService;

import java.util.regex.Pattern;

public class EmailManager implements EmailService {


    public boolean verify(String email) {
            if (email == null || email.isEmpty()) {
                return false;
            }
            //Regex'e göre email olma şartı
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                    "[a-zA-Z0-9_+&*-]+)*@"+
                    "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            Pattern pattern = Pattern.compile(emailRegex);
            if (pattern.matcher(email).matches()) {
                return true;
            } else {
                return false;
            }
        }

    @Override
    public boolean isTheLinkClicked() {
        return false;
    }

    @Override
    public void sendToMail() {
        System.out.println("Verification email sent");
    }

}
