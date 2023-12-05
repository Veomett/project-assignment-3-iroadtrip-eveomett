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
        Assertions.assertEquals(ColombiaArgentina.get(1), "Peru --> Bolivia (1069 km.)");

    }
    @org.junit.jupiter.api.Test
    void findPathIndiaYemen() {
        List<String> IndiaYemen = r.findPath("India", "Yemen");
        Assertions.assertEquals(IndiaYemen.get(2), "Iran --> Iraq (698 km.)");

    }
    @org.junit.jupiter.api.Test
    void findPathNorwaySweden() {
        List<String> NorwaySweden = r.findPath("Norway", "Sweden");
        Assertions.assertEquals(NorwaySweden.get(0), "Norway --> Sweden (419 km.)");

    }
    @org.junit.jupiter.api.Test
    void findPathChinaYemen() {
        List<String> ChinaYemen = r.findPath("China", "Yemen");
        Assertions.assertEquals(ChinaYemen.get(3), "Turkmenistan --> Iran (653 km.)");

    }

}