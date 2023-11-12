package pages;

import org.openqa.selenium.support.PageFactory;
import utility.Driver;
import utility.Methods;

public class CommonPage {
    private static AddCart addCart;
    private static LogIn logIn;
    private static ShoppingCart shoppingCart;
    private static SignUp signUp;

    private static Methods methods;
    public CommonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static AddCart getAddCart() {
        if (addCart == null) {
            addCart = new AddCart();
        }
        return addCart;
    }

    public static LogIn getLogIn() {
        if (logIn == null) {
            logIn = new LogIn();
        }
        return logIn;
    }


    public static ShoppingCart getShoppingCart() {
        if (shoppingCart == null) {
            shoppingCart= new ShoppingCart();
        }
        return shoppingCart;
    }

    public static SignUp getSignUp() {
        if (signUp == null) {
            signUp= new SignUp();
        }
        return signUp;
    }

    public static Methods getMethods() {
        if (methods == null) {
            methods= new Methods();
        }
        return methods;
    }
}
