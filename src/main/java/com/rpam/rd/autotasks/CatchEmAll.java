package com.rpam.rd.autotasks;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {

    //You may set another exception in this field;
    static Exception exception = new FileNotFoundException();

    public static void riskyMethod() throws Exception {


        try {
            throw exception;
        } catch (FileNotFoundException varExcaption) {
            throw new IllegalArgumentException("Resource is missing", varExcaption);

        } catch (IOException e) {
            throw new IllegalArgumentException("Resource error", e);
        } catch (ArithmeticException | NumberFormatException exception) {
            System.err.println(exception.getMessage());
        }

    }

    public static void main(String[] args) throws Exception {
        riskyMethod();
    }
}