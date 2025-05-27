package com.mycompany.student;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class StudentAnalyzerTest {

    StudentAnalyzer analyzer = new StudentAnalyzer();

    @Test
    public void testCountExcellentStudents_Normal() {
        List<Double> scores = Arrays.asList(9.0, 7.5, 8.5, 10.0, 6.0);
        assertEquals(3, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCountExcellentStudents_NullList() {
        assertEquals(0, analyzer.countExcellentStudents(null));
    }

    @Test
    public void testCountExcellentStudents_WithNullValues() {
        List<Double> scores = Arrays.asList(null, 9.0, null, 8.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_OutOfRangeScores() {
        List<Double> scores = Arrays.asList(11.0, 2.0, 7.9, 10.1); // all not excellent
        assertEquals(0, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCalculateValidAverage_Normal() {
        List<Double> scores = Arrays.asList(5.0, 7.5, 10.0);
        assertEquals(7.5, analyzer.calculateValidAverage(scores), 0.001);
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()));
    }

    @Test
    public void testCalculateValidAverage_NullList() {
        assertEquals(0.0, analyzer.calculateValidAverage(null));
    }

    @Test
    public void testCalculateValidAverage_WithNullAndInvalidValues() {
        List<Double> scores = Arrays.asList(null, -1.0, 11.0, 5.0, 7.0);
        assertEquals(6.0, analyzer.calculateValidAverage(scores), 0.001);
    }

    @Test
    public void testCalculateValidAverage_AllInvalid() {
        List<Double> scores = Arrays.asList(null, -5.0, 11.5, 20.0);
        assertEquals(0.0, analyzer.calculateValidAverage(scores));
    }
}
