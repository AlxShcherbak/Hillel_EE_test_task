package com.oshcherbak;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task01Test {
    private final List<String> expectedResult = generateExpectedList();

    private List<String> generateExpectedList(){
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Еней");
        expectedResult.add("був");
        expectedResult.add("парубок");
        expectedResult.add("моторний");
        return expectedResult;
    }

    @Test
    public void readFileAndParseVar1TestSpace() throws IOException {
        final String FILE_PATH = "testRes/test_res_space.txt";

        List<String> actualResult = Task01.readFileAndParseVar1(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void readFileAndParseVar1TestDot() throws IOException {
        final String FILE_PATH = "testRes/test_res_dot.txt";

        List<String> actualResult = Task01.readFileAndParseVar1(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void readFileAndParseVar1TestComma() throws IOException {
        final String FILE_PATH = "testRes/test_res_comma.txt";

        List<String> actualResult = Task01.readFileAndParseVar1(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void readFileAndParseVar1TestSlash() throws IOException {
        final String FILE_PATH = "testRes/test_res_slash.txt";

        List<String> actualResult = Task01.readFileAndParseVar1(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void readFileAndParseVar1TestDash() throws IOException {
        final String FILE_PATH = "testRes/test_res_dash.txt";

        List<String> actualResult = Task01.readFileAndParseVar1(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void readFileAndParseVar1TestSemicolon() throws IOException {
        final String FILE_PATH = "testRes/test_res_semicolon.txt";

        List<String> actualResult = Task01.readFileAndParseVar1(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void readFileAndParseVar1TestColon() throws IOException {
        final String FILE_PATH = "testRes/test_res_colon.txt";

        List<String> actualResult = Task01.readFileAndParseVar1(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test (expected = IOException.class)
    public void readFileAndParseVar1TestFileNotFoundException() throws IOException {
        final String FILE_PATH = "testRes/test_res_exception.txt";

        Task01.readFileAndParseVar1(FILE_PATH);
    }

    @Test
    public void readFileAndParseVar2TestSpace() throws IOException {
        final String FILE_PATH = "testRes/test_res_space.txt";

        List<String> actualResult = Task01.readFileAndParseVar2(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void readFileAndParseVar2TestDot() throws IOException {
        final String FILE_PATH = "testRes/test_res_dot.txt";

        List<String> actualResult = Task01.readFileAndParseVar2(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void readFileAndParseVar2TestComma() throws IOException {
        final String FILE_PATH = "testRes/test_res_comma.txt";

        List<String> actualResult = Task01.readFileAndParseVar2(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void readFileAndParseVar2TestSlash() throws IOException {
        final String FILE_PATH = "testRes/test_res_slash.txt";

        List<String> actualResult = Task01.readFileAndParseVar2(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void readFileAndParseVar2TestDash() throws IOException {
        final String FILE_PATH = "testRes/test_res_dash.txt";

        List<String> actualResult = Task01.readFileAndParseVar2(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void readFileAndParseVar2TestSemicolon() throws IOException {
        final String FILE_PATH = "testRes/test_res_semicolon.txt";

        List<String> actualResult = Task01.readFileAndParseVar2(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void readFileAndParseVar2TestColon() throws IOException {
        final String FILE_PATH = "testRes/test_res_colon.txt";

        List<String> actualResult = Task01.readFileAndParseVar2(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test (expected = IOException.class)
    public void readFileAndParseVar2TestFileNotFoundException() throws IOException {
        final String FILE_PATH = "testRes/test_res_exception.txt";

        Task01.readFileAndParseVar2(FILE_PATH);
    }

    @Test
    public void readFileAndParseVar3TestSpace() throws IOException {
        final String FILE_PATH = "testRes/test_res_space.txt";

        List<String> actualResult = Task01.readFileAndParseVar3(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void readFileAndParseVar3TestDot() throws IOException {
        final String FILE_PATH = "testRes/test_res_dot.txt";

        List<String> actualResult = Task01.readFileAndParseVar3(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void readFileAndParseVar3TestComma() throws IOException {
        final String FILE_PATH = "testRes/test_res_comma.txt";

        List<String> actualResult = Task01.readFileAndParseVar3(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void readFileAndParseVar3TestSlash() throws IOException {
        final String FILE_PATH = "testRes/test_res_slash.txt";

        List<String> actualResult = Task01.readFileAndParseVar3(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void readFileAndParseVar3TestDash() throws IOException {
        final String FILE_PATH = "testRes/test_res_dash.txt";

        List<String> actualResult = Task01.readFileAndParseVar3(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void readFileAndParseVar3TestSemicolon() throws IOException {
        final String FILE_PATH = "testRes/test_res_semicolon.txt";

        List<String> actualResult = Task01.readFileAndParseVar3(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void readFileAndParseVar3TestColon() throws IOException {
        final String FILE_PATH = "testRes/test_res_colon.txt";

        List<String> actualResult = Task01.readFileAndParseVar3(FILE_PATH);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test (expected = IOException.class)
    public void readFileAndParseVar3TestFileNotFoundException() throws IOException {
        final String FILE_PATH = "testRes/test_res_exception.txt";

        Task01.readFileAndParseVar3(FILE_PATH);
    }
}
