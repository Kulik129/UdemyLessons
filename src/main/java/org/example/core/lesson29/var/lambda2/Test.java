package org.example.core.lesson29.var.lambda2;

public class Test {
    public static void main(String[] args) {
        // одно и тоже
        TestInferenceType testInferenceType1 = new TestInferenceType();
        var testInferenceType2 = new TestInferenceType();
    }
}

class TestInferenceType {

}
