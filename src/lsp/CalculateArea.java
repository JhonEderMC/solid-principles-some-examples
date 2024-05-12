package lsp;

import main.java.srp.Form;

import java.util.Arrays;

public class CalculateArea {

    public static double calculateTotalArea(Form [] forms) {
        return Arrays.stream(forms).reduce(0d, (sum, form) -> sum + form.calculateArea(), Double::sum);
    }
}
