package auth;

import com.intuit.karate.junit5.Karate;

public class SignupLoginRunner {

    @Karate.Test
    Karate testSignupLogin(){
        return Karate.run("signupLogin").relativeTo(getClass());
    }
}
