
import org.junit.jupiter.api.Assertions;

import java.util.List;


class IRoadTripTest {
    String[] myArgs = {"borders.txt", "capdist.csv", "state_name.tsv"};
    IRoadTrip r = new IRoadTrip(myArgs);
    @org.junit.jupiter.api.Test
    public void getDistanceGuatemalaMexico() {
        int distMexicoUS = r.getDistance("Guatemala", "Mexico");
        Assertions.assertEquals(distMexicoUS, 1065);
    }
    @org.junit.jupiter.api.Test
    public void getDistanceJordanArgentina() {
        int distJordanArgentina = r.getDistance("Jordan", "Argentina");
        Assertions.assertEquals(distJordanArgentina, -1);
    }

    @org.junit.jupiter.api.Test
    public void getDistanceIndiaNepal() {
        int distIndiaNepal = r.getDistance("India", "Nepal");
        Assertions.assertEquals(distIndiaNepal, 795);
    }

    @org.junit.jupiter.api.Test
    public void getDistanceChadNiger() {
        int distChadNiger = r.getDistance("Chad", "Niger");
        Assertions.assertEquals(distChadNiger, 1397);
    }
    @org.junit.jupiter.api.Test
    public void getDistanceKenyaAustralia() {
        int distChadNiger = r.getDistance("Kenya", "Australia");
        Assertions.assertEquals(distChadNiger, -1);
    }

    @org.junit.jupiter.api.Test
    void findPathColombiaArgentina() {
        List<String> ColombiaArgentina = r.findPath("Colombia", "Argentina");
        Assertions.assertTrue(ColombiaArgentina.get(1).contains("Peru"));
        Assertions.assertTrue(ColombiaArgentina.get(1).contains("Bolivia"));
        Assertions.assertTrue(ColombiaArgentina.get(1).contains("1069 km"));
    }
    @org.junit.jupiter.api.Test
    void findPathIndiaYemen() {
        List<String> IndiaYemen = r.findPath("India", "Yemen");
        Assertions.assertTrue(IndiaYemen.get(2).contains("Iran"));
        Assertions.assertTrue(IndiaYemen.get(2).contains("Iraq"));
        Assertions.assertTrue(IndiaYemen.get(2).contains("698 km"));
    }
    @org.junit.jupiter.api.Test
    void findPathNorwaySweden() {
        List<String> NorwaySweden = r.findPath("Norway", "Sweden");
        Assertions.assertTrue(NorwaySweden.get(0).contains("Norway"));
        Assertions.assertTrue(NorwaySweden.get(0).contains("Sweden"));
        Assertions.assertTrue(NorwaySweden.get(0).contains("419 km"));
    }
    @org.junit.jupiter.api.Test
    void findPathChinaYemen() {
        List<String> ChinaYemen = r.findPath("China", "Yemen");
        Assertions.assertTrue(ChinaYemen.get(3).contains("Turkmenistan"));
        Assertions.assertTrue(ChinaYemen.get(3).contains("Iran"));
        Assertions.assertTrue(ChinaYemen.get(3).contains("653 km"));
    }
    @org.junit.jupiter.api.Test
    void findPathChinaAustralia() {
        List<String> ChinaAustralia = r.findPath("China", "Australia");
        Assertions.assertEquals(ChinaAustralia.size(), 0);
    }

}