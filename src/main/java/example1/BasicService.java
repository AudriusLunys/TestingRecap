package example1;

public class BasicService {

    public String basicMethod() {
        return "BasicString";

    }

    public String joinStringsMethod(String name, String lastName) {
        String belekas;
        if (name == null) {
            belekas = "".concat(lastName);
        } else if (lastName == null) {
            belekas = name.concat("");
        } else
            belekas = name.concat(lastName);

        return belekas;
    }

}
